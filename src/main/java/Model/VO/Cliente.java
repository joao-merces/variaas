package Model.VO;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente")
@NamedQuery(name = "Cliente.logar", query = "SELECT c FROM Cliente c WHERE c.clienteNome = :usuario AND c.clienteSenha = :senha")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteId;

    @Column(name = "cli_nome", unique = false, nullable = false)
    private String clienteNome;

    @Column(name = "cli_dtnasc", unique = false, nullable = false)
    private LocalDate clienteDataNascimento;

    @Column(name = "cli_email", unique = true, nullable = false)
    private String clienteEmail;

    @Column(name = "cli_CPF", unique = true, nullable = false)
    private String clienteCPF;

    @Column(name = "cli_senha", unique = false, nullable = false)
    private String clienteSenha;

    //chaves estrangeiras
    //chave do pedido UM
    @OneToMany(mappedBy = "pedidoClienteId")
    private List<Pedido> pedidoId;

    public String getClienteCPF() {
        return clienteCPF;
    }

    public void setClienteCPF(String clienteCPF) {
        this.clienteCPF = clienteCPF;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public LocalDate getClienteDataNascimento() {
        return clienteDataNascimento;
    }

    public void setClienteDataNascimento(LocalDate clienteDataNascimento) {
        this.clienteDataNascimento = clienteDataNascimento;
    }

    public String getClienteEmail() {
        return clienteEmail;
    }

    public void setClienteEmail(String clienteEmail) {
        this.clienteEmail = clienteEmail;
    }

    public List<Pedido> getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(List<Pedido> pedidoId) {
        this.pedidoId = pedidoId;
    }

    public String getClienteSenha() {
        return clienteSenha;
    }

    public void setClienteSenha(String clienteSenha) {
        this.clienteSenha = clienteSenha;
    }
}