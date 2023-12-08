package Model.DAO;

import Model.VO.Pedido;
import java.util.List;

public interface PedidoDAO {
    void salvar (Pedido pedido);
    
    void atualizar(Pedido pedido);
    
    void excluir (Pedido pedido);
    
    List<Pedido> listarTodos();
    
    Pedido listarUm(Long ped_id);
    
    Pedido listarFuncionario(String func_nome);
}
