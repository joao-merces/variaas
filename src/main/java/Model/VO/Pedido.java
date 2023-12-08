package Model.VO;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pedidoId;
    
    @Column(name = "ped_data", nullable = false)
    private LocalDate pedidoData;
    
    @Column(name = "ped_situacao", nullable = false)
    private String pedidoSituacao;
    
    @Embedded
    private Endereco endereco;
    
    //Chaves Estrangeiras
    
    //Chave estrangeira do cliente MUITOS
    @ManyToOne(optional = false)
    @JoinColumn(name="ped_cli_id")
    private Cliente pedidoClienteId;
    
     //Chave estrangeira do pedido MUITOS
    @ManyToOne(optional = false)
    @JoinColumn(name = "ped_func_id")
    private Funcionario pedidoFuncionarioId;
    
     //Chave estrangeira do livros_pedidos UM
    @OneToMany(mappedBy = "livrosPedidosPedidoId")
    private List<Livros_Pedidos> livrosPedidosId;

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public LocalDate getPedidoData() {
        return pedidoData;
    }

    public void setPedidoData(LocalDate pedidoData) {
        this.pedidoData = pedidoData;
    }

    public String getPedidoSituacao() {
        return pedidoSituacao;
    }

    public void setPedidoSituacao(String pedidoSituacao) {
        this.pedidoSituacao = pedidoSituacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cliente getPedidoClienteId() {
        return pedidoClienteId;
    }

    public void setPedidoClienteId(Cliente pedidoClienteId) {
        this.pedidoClienteId = pedidoClienteId;
    }

    public Funcionario getPedidoFuncionarioId() {
        return pedidoFuncionarioId;
    }

    public void setPedidoFuncionarioId(Funcionario pedidoFuncionarioId) {
        this.pedidoFuncionarioId = pedidoFuncionarioId;
    }

    public List<Livros_Pedidos> getLivrosPedidosId() {
        return livrosPedidosId;
    }

    public void setLivrosPedidosId(List<Livros_Pedidos> livrosPedidosId) {
        this.livrosPedidosId = livrosPedidosId;
    }   
}
