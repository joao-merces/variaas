package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ConfirmaCompraController {

    @FXML
    private Button botaoVoltar;

    @FXML
    private Button botaoComprar;

    @FXML
    void botaoVoltarClicked(ActionEvent event) {
        Stage stage = new Stage();
        stage = (Stage) botaoVoltar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void botaoComprarClicked(ActionEvent event) {
        Alert alerta =  new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Compra Confirmada");
        alerta.setHeaderText("Obrigado por sua compra!");
        alerta.setContentText("A equipe Variaas agradece a sua confiança!");
        alerta.show();
        
        Stage stage = new Stage();
        stage = (Stage) botaoComprar.getScene().getWindow();
        stage.close();
    }

}
