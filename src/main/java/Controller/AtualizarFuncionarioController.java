package Controller;

import Model.DAO.FuncionarioDAO;
import Model.DAO.FuncionarioDAOImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AtualizarFuncionarioController {
    @FXML
    private TextField textSalario;

    @FXML
    private TextField textId;

    @FXML
    private Button botaoAtualizar;

    @FXML
    private Button botaoVoltar;

    @FXML
    void botaoVoltarClicked(ActionEvent event) {
        Stage stage = new Stage();
        stage = (Stage) botaoVoltar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void botaoAtualizarClicked(ActionEvent event) {
        FuncionarioDAO dao = new FuncionarioDAOImpl();
        Long id;
        float salario;

        Alert alerta;

        try {
            id = Long.parseLong(textId.getText());
            salario = Float.parseFloat(textSalario.getText());

            if (dao.atualizarSalarioFuncionario(id, salario)) {
                alerta = new Alert(Alert.AlertType.CONFIRMATION);
                alerta.setTitle("Confirmação");
                alerta.setHeaderText("Atualização");
                alerta.setContentText("Funcionario atualizado com sucesso");
                alerta.show();
            } else {
                alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Erro na procura");
                alerta.setHeaderText("Funcionario não encontrado");
                alerta.setContentText("Por favor verifique o ID e tente novamente");
                alerta.show();
            }
        } catch (NumberFormatException e) {
            alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Erro");
            alerta.setHeaderText("Erro de digitação");
            alerta.setContentText("Por favor verifique as entradas");
            alerta.show();
        }
    }
}
