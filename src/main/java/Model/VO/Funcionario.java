package Model.VO;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long funcionarioId;

    @Column(name = "func_nome",unique = true , nullable = false)
    private String funcionarioNome;

    @Column(name = "func_salario", nullable = false)
    private Float funcionarioSalario;

    @Column(name = "func_dtnasc", nullable = false)
    private LocalDate funcionarioDataNascimento;

    @Column(name = "func_email", unique = true, nullable = false)
    private String funcionarioEmail;

    //Chaves estrangeiras
    //chave do pedido UM
    @OneToMany(mappedBy = "pedidoFuncionarioId")
    private List<Pedido> pedidoId;

    public Long getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(Long funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public String getFuncionarioNome() {
        return funcionarioNome;
    }

    public void setFuncionarioNome(String funcionarioNome) {
        this.funcionarioNome = funcionarioNome;
    }

    public Float getFuncionarioSalario() {
        return funcionarioSalario;
    }

    public void setFuncionarioSalario(Float funcionarioSalario) {
        this.funcionarioSalario = funcionarioSalario;
    }

    public LocalDate getFuncionarioDataNascimento() {
        return funcionarioDataNascimento;
    }

    public void setFuncionarioDataNascimento(LocalDate funcionarioDataNascimento) {
        this.funcionarioDataNascimento = funcionarioDataNascimento;
    }

    public String getFuncionarioEmail() {
        return funcionarioEmail;
    }

    public void setFuncionarioEmail(String funcionarioEmail) {
        this.funcionarioEmail = funcionarioEmail;
    }

    public List<Pedido> getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(List<Pedido> pedidoId) {
        this.pedidoId = pedidoId;
    }
}