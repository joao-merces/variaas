package Model.DAO;

import Model.VO.Pedido;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class PedidoDAOImpl implements PedidoDAO{
    EntityManager manager;
    
    public PedidoDAOImpl(){
        manager = ConexaoDB.getInstance();
    }
    
    @Override
    public void salvar(Pedido pedido){
        manager.getTransaction().begin();
        manager.persist(pedido);
        manager.getTransaction().commit();
    }
    
    @Override
    public void atualizar(Pedido pedido){
        manager.getTransaction().begin();
        manager.merge(pedido);
        manager.getTransaction().commit();
    }
    
    @Override
    public void excluir (Pedido pedido){
        manager.getTransaction().begin();
        manager.remove(pedido);
        manager.getTransaction().commit();
    }
    
    @Override
    public List<Pedido> listarTodos(){
        List<Pedido> pedidos;
        
        TypedQuery<Pedido> query = manager.createQuery("SELECT p FROM Pedido p", Pedido.class);
        
        pedidos = query.getResultList();
        
        return pedidos;
    }
    
    @Override
    public Pedido listarUm(Long ped_id){
        Pedido pedido;
        
        TypedQuery<Pedido> query = manager.createQuery("SELECT p FROM Pedido p WHERE p.pedidoId = "+ ped_id, Pedido.class);
        
        pedido = query.getSingleResult();
        
        return pedido;
    }
    
    @Override
    public Pedido listarFuncionario(String func_nome){
        Pedido funcionarioResponsavel;
        
        TypedQuery<Pedido> query = manager.createQuery("SELECT p FROM Pedido p WHERE p.pedidoFuncionarioId.funcionarioNome = " + func_nome, Pedido.class);
        
        funcionarioResponsavel = query.getSingleResult();
        
        return funcionarioResponsavel;
    }
}
