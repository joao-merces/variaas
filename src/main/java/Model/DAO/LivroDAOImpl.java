package Model.DAO;

import Model.VO.Livro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class LivroDAOImpl implements LivroDAO {

    EntityManager manager;

    public LivroDAOImpl() {
        manager = ConexaoDB.getInstance();
    }

    @Override
    public void salvar(Livro livro) {
        manager.getTransaction().begin();
        manager.persist(livro);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Livro livro) {
        manager.getTransaction().begin();
        manager.merge(livro);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(Livro livro) {
        manager.getTransaction().begin();
        manager.remove(livro);
        manager.getTransaction().commit();
    }

    @Override
    public List<Livro> listarTodos() {
        List<Livro> livros;

        TypedQuery<Livro> query = manager.createQuery("SELECT l FROM Livro l", Livro.class);

        livros = query.getResultList();

        return livros;
    }

    @Override
    public Livro listarUm(Long id) {
        Livro livro;

        Query query = manager.createQuery("SELECT l FROM Livro l WHERE l.livroId = " + id);

        livro = (Livro) query.getSingleResult();

        return livro;
    }

    @Override
    public Livro listarTitulo(String titulo) {
        Livro livro;

        Query query = manager.createQuery("SELECT l FROM Livro l WHERE l.livroTitulo LIKE " + titulo + "%");

        livro = (Livro) query.getSingleResult();

        return livro;
    }

    @Override
    public List<Livro> listarLivrosPedido(Long pedido) {
        List<Livro> livrosDoPedido;

        TypedQuery<Livro> query = manager.createQuery("SELECT l FROM Livro l WHERE l.livroId = " + pedido, Livro.class);

        livrosDoPedido = query.getResultList();

        return livrosDoPedido;
    }

    @Override
    public boolean removerLivro(Long id) {
        Query query = manager.createNamedQuery("Livro.remover");
        query.setParameter("id", id);

        Livro livro = new Livro();

        try {
            livro = (Livro) query.getSingleResult();
        } catch (javax.persistence.NoResultException e) {
            return false;
        }

        excluir(livro);

        return true;

    }

    @Override
    public boolean atualizarLivro(Long id, float preco, int quantidade) {
        Livro livro;
        TypedQuery<Livro> query = manager.createQuery("SELECT l FROM Livro l WHERE l.livroId = " + id, Livro.class);

        try {
            livro = query.getSingleResult();
        }catch(javax.persistence.NoResultException e){
            return false;
        }

        livro.setLivroEstoque(quantidade);
        livro.setLivroPreco(preco);

        atualizar(livro);

        return true;
    }
}
