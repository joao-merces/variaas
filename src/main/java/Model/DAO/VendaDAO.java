package Model.DAO;

import Model.VO.Venda;
import java.util.List;

public interface VendaDAO {
    void salvar(Venda venda);
    
    void atualizar(Venda venda);
    
    void excluir (Venda venda);
    
    List<Venda> listarTodos();
    
    Venda listarUm(Long id_venda);
   
}
