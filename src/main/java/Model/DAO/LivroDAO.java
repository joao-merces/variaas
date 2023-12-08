package Model.DAO;

import Model.VO.Livro;
import java.util.List;

public interface LivroDAO {
    void salvar(Livro livro);
    
    void atualizar(Livro livro);
    
    void excluir(Livro livro);
    
    List<Livro> listarTodos();
    
    Livro listarUm(Long id);
    
    Livro listarTitulo(String titulo);
    
    List<Livro> listarLivrosPedido(Long pedido);
    
    boolean removerLivro(Long id);
    
    boolean atualizarLivro(Long id, float preco, int quantidade);
}
