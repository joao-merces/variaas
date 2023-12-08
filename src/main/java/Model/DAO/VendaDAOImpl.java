package Model.DAO;

import Model.VO.Venda;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class VendaDAOImpl implements VendaDAO{
    EntityManager manager;
    
    public VendaDAOImpl(){
        manager = ConexaoDB.getInstance();
    }
    
    @Override
    public void salvar(Venda venda){
        manager.getTransaction().begin();
        manager.persist(venda);
        manager.getTransaction().commit();
    }
    
    @Override
    public void atualizar(Venda venda){
        manager.getTransaction().begin();
        manager.merge(venda);
        manager.getTransaction().commit();
    }
    
    @Override
    public void excluir(Venda venda){
        manager.getTransaction().begin();
        manager.remove(venda);
        manager.getTransaction().commit();
    }
    
    @Override
    public List<Venda> listarTodos(){
        List<Venda> vendas;
        
        TypedQuery<Venda> query = manager.createQuery("SELECT v FROM Venda v", Venda.class);
        
        vendas = query.getResultList();
        
        return vendas;
    }
    
    @Override
    public Venda listarUm(Long id_venda){
        Venda venda;
        
        TypedQuery<Venda> query = manager.createQuery("SELECT v FROM Venda v WHERE v.vendaId = " + id_venda, Venda.class);
        
        venda = query.getSingleResult();
        
        return venda;
    }
}
