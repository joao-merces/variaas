package Model.DAO;

import Model.VO.Cliente;
import java.util.List;

public interface ClienteDAO {
    void salvar(Cliente cliente);
    
    void atualizar(Cliente cliente);
    
    void excluir(Cliente cliente);
    
    List<Cliente> listarTodos();
    
    Cliente listarUm(Long id);
    
    boolean logarCliente(String usuario, String senha);
    
}
