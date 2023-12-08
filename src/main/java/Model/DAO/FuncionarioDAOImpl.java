package Model.DAO;

import Model.VO.Funcionario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class FuncionarioDAOImpl implements FuncionarioDAO{
    EntityManager manager;

    public FuncionarioDAOImpl(){
        manager = ConexaoDB.getInstance();
    }

    @Override
    public void salvar(Funcionario funcionario){
        manager.getTransaction().begin();
        manager.persist(funcionario);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Funcionario funcionario){
        manager.getTransaction().begin();
        manager.merge(funcionario);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(Funcionario funcionario){
        manager.getTransaction().begin();
        manager.remove(funcionario);
        manager.getTransaction().commit();
    }

    @Override
    public List<Funcionario> listarTodos(){
        List<Funcionario> funcionarios;

        TypedQuery<Funcionario> query = manager.createQuery("SELECT f FROM Funcionario f", Funcionario.class);

        funcionarios = query.getResultList();

        return funcionarios;
    }

    @Override
    public Funcionario listarUm(Long id){
        Funcionario funcionario;

        TypedQuery<Funcionario> query = manager.createQuery("SELECT f FROM Funcionario f WHERE f.funcionarioId = " + id, Funcionario.class);

        funcionario = query.getSingleResult();

        return funcionario;
    }

    @Override
    public List<Funcionario> listarSalario(){
        List<Funcionario> salarios;

        TypedQuery<Funcionario> query = manager.createQuery("SELECT f.sal_funcionario FROM Funcionario f ASC", Funcionario.class);

        salarios = query.getResultList();

        return salarios;
    }

    @Override
    public void atualizarSalariosPorcentagem (float porcentagem){
        Query query = manager.createQuery("UPDATE Funcionario f SET f.funcionarioSalario = f.funcionarioSalario *" + porcentagem);

        query.executeUpdate();
    }

    @Override
    public boolean atualizarSalarioFuncionario (Long id, float salario){
        Funcionario funcionario;
        
        TypedQuery<Funcionario> query = manager.createQuery("SELECT f FROM Funcionario f WHERE f.funcionarioId = " + id, Funcionario.class);
        
        try{
            funcionario = query.getSingleResult();
        }catch(javax.persistence.NoResultException e){
            return false;
        }
        
        funcionario.setFuncionarioSalario(salario);
        
        atualizar(funcionario);
        
        return true;
    }
}