package Model.DAO;

import Model.VO.Cliente;
import java.util.List;
import javafx.scene.control.Alert;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class ClienteDAOImpl implements ClienteDAO{
    
    EntityManager manager;
    
    public ClienteDAOImpl(){
        manager = ConexaoDB.getInstance();
    }
    
    @Override
    public void salvar(Cliente cliente){
        manager.getTransaction().begin();
        manager.persist(cliente);
        manager.getTransaction().commit();
    }
    
    @Override
    public void atualizar(Cliente cliente){
        manager.getTransaction().begin();
        manager.merge(cliente);
        manager.getTransaction().commit();
        
    }
    
    @Override
    public void excluir(Cliente cliente){
        manager.getTransaction().begin();
        manager.remove(cliente);
        manager.getTransaction().commit();
        
    }
    
    @Override
    public List<Cliente> listarTodos(){
        
        List<Cliente> clientes;
        
        TypedQuery<Cliente> query = manager.createQuery("SELECT c FROM Cliente c", Cliente.class);
        
        clientes = query.getResultList();
        
        return clientes;
    }
    
    public Cliente listarUm(Long id){
        Cliente cliente;
        
        Query query;
        query = manager.createQuery("SELECT c FROM Cliente c WHERE c.clienteId = " + id);
        
        cliente = (Cliente) query.getSingleResult();
        
        return cliente;
    }
    
    @Override
   public boolean logarCliente(String usuario, String senha) {
   
       Query query = manager.createNamedQuery("Cliente.logar");
       query.setParameter("usuario", usuario);
       query.setParameter("senha", senha);
       
    try {
        Cliente cliente = (Cliente) query.getSingleResult();
        return cliente != null;
    } catch (NoResultException e) {
        Alert alerta = new Alert(Alert.AlertType.WARNING);
        alerta.setHeaderText("Erro ao logar");
        alerta.setContentText("Login ou senha incorretos, por favor verifique suas credênciais");
        alerta.show();
        return false;
        }
    }
}
