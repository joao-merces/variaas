package Model.VO;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_livros_pedidos")
public class Livros_Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long livrosPedidosId;
    
    @Column(name = "liv_ped_quantidade", nullable = false)
    private Integer livrosPedidosQuantidade;
    
    // Chave dos pedidos
    @ManyToOne(optional = false)
    @JoinColumn(name = "livPed_id_pedido")
    private Pedido livrosPedidosPedidoId;
    
    // Chave dos livros
    @ManyToOne(optional = false)
    @JoinColumn(name = "livPed_id_livro")
    private Livro livrosPedidosLivroId;
    
    // Chave das vendas
    @OneToMany(mappedBy = "vendaLivrosPedidosId")
    private List<Venda> vendaId;

    public Long getLivrosPedidosId() {
        return livrosPedidosId;
    }

    public void setLivrosPedidosId(Long livrosPedidosId) {
        this.livrosPedidosId = livrosPedidosId;
    }

    public Integer getLivrosPedidosQuantidade() {
        return livrosPedidosQuantidade;
    }

    public void setLivrosPedidosQuantidade(Integer livrosPedidosQuantidade) {
        this.livrosPedidosQuantidade = livrosPedidosQuantidade;
    }

    public Pedido getLivrosPedidosPedidoId() {
        return livrosPedidosPedidoId;
    }

    public void setLivrosPedidosPedidoId(Pedido livrosPedidosPedidoId) {
        this.livrosPedidosPedidoId = livrosPedidosPedidoId;
    }

    public Livro getLivrosPedidosLivroId() {
        return livrosPedidosLivroId;
    }

    public void setLivrosPedidosLivroId(Livro livrosPedidosLivroId) {
        this.livrosPedidosLivroId = livrosPedidosLivroId;
    }

    public List<Venda> getVendaId() {
        return vendaId;
    }

    public void setVendaId(List<Venda> vendaId) {
        this.vendaId = vendaId;
    } 
}
