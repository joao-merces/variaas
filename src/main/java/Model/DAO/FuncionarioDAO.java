package Model.DAO;

import Model.VO.Funcionario;
import java.util.List;

public interface FuncionarioDAO {
    void salvar (Funcionario funcionario);

    void atualizar(Funcionario funcionario);

    void excluir (Funcionario funcionario);

    List<Funcionario> listarTodos();

    Funcionario listarUm(Long id);

    List<Funcionario> listarSalario();

    void atualizarSalariosPorcentagem (float porcentagem);

    boolean atualizarSalarioFuncionario (Long id, float salario);
}