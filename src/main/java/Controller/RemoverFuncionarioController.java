package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RemoverFuncionarioController {
    @FXML
    private TextField textCodigo;

    @FXML
    private Button botaoRemover;

    @FXML
    private Label textFunc;

    @FXML
    private Button botaoVoltar;

    @FXML
    void botaoVoltarClicked(ActionEvent event) {
        Stage stage = new Stage();
        stage = (Stage) botaoVoltar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void botaoRemoverClicked(ActionEvent event) {
        String codigo = textCodigo.getText();
        textFunc.setText("O funcionário de código: " + codigo + " foi removido com sucesso.");
        textFunc.setVisible(true);
    }
}
