package Model.VO;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQueries({
    @NamedQuery(name = "Livro.remover", query = "SELECT l FROM Livro l WHERE l.livroId = :id")
})

@Table(name = "tb_livro")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long livroId;

    @Column(name = "liv_titulo", unique = true, nullable = false)
    private String livroTitulo;

    @Column(name = "liv_autor", nullable = false)
    private String livroAutor;

    @Column(name = "liv_genero", nullable = false)
    private String livroGenero;

    @Column(name = "liv_preco", nullable = false)
    private Float livroPreco;

    @Column(name = "liv_publicacao", nullable = false)
    private LocalDate livroPublicacao;

    @Column(name = "liv_qtde_estoque", nullable = false)
    private Integer livroEstoque;
    
    @Column(name = "liv_caminho_imagem")
    private String imageSource;
    
    @OneToMany (mappedBy = "livrosPedidosLivroId")
    private List<Livros_Pedidos> livrosPedidosId;

    public Long getLivroId() {
        return livroId;
    }

    public void setLivroId(Long livroId) {
        this.livroId = livroId;
    }

    public String getLivroTitulo() {
        return livroTitulo;
    }

    public void setLivroTitulo(String livroTitulo) {
        this.livroTitulo = livroTitulo;
    }

    public String getLivroAutor() {
        return livroAutor;
    }

    public void setLivroAutor(String livroAutor) {
        this.livroAutor = livroAutor;
    }

    public LocalDate getLivroPublicacao() {
        return livroPublicacao;
    }

    public void setLivroPublicacao(LocalDate livroPublicacao) {
        this.livroPublicacao = livroPublicacao;
    }

    public Integer getLivroEstoque() {
        return livroEstoque;
    }

    public void setLivroEstoque(Integer livroEstoque) {
        this.livroEstoque = livroEstoque;
    }

    public String getLivroGenero() {
        return livroGenero;
    }

    public void setLivroGenero(String livroGenero) {
        this.livroGenero = livroGenero;
    }

    public Float getLivroPreco() {
        return livroPreco;
    }

    public void setLivroPreco(Float livroPreco) {
        this.livroPreco = livroPreco;
    }

    public List<Livros_Pedidos> getLivrosPedidosId() {
        return livrosPedidosId;
    }

    public void setLivrosPedidosId(List<Livros_Pedidos> livrosPedidosId) {
        this.livrosPedidosId = livrosPedidosId;
    }


    public String getImageSource() {
        return imageSource;
    }

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }
}
