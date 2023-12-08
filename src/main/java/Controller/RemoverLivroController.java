package Controller;

import Model.DAO.LivroDAO;
import Model.DAO.LivroDAOImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RemoverLivroController {
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
        LivroDAO dao = new LivroDAOImpl();
        Alert alerta;

        if (dao.removerLivro(Long.parseLong(textCodigo.getText()))) {
            alerta = new Alert(Alert.AlertType.CONFIRMATION);
            alerta.setHeaderText("Remoção");
            alerta.setContentText("Livro removido com sucesso!");
            alerta.show();
        } else{
           alerta = new Alert(Alert.AlertType.ERROR);
           alerta.setHeaderText("Remoção");
           alerta.setContentText("Erro: livro não encontrado, por favor verificar o ID do livro ");
           alerta.show();
        }
    }
}
