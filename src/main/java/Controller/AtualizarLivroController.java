package Controller;

import Model.DAO.LivroDAO;
import Model.DAO.LivroDAOImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AtualizarLivroController {
    @FXML
    private TextField textPreco;

    @FXML
    private TextField textId;

    @FXML
    private TextField textQuantidade;

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
        LivroDAO dao = new LivroDAOImpl();
        Alert alerta;
        
        Long id;
        float preco;
        int quantidade;
        
        try{
            id = Long.parseLong(textId.getText());
            preco = Float.parseFloat(textPreco.getText());
            quantidade = Integer.parseInt(textQuantidade.getText());
        }catch(NumberFormatException e){
            alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText("Erro");
            alerta.setContentText("Valor inserido não suportado, por favor cheque as entradas");
            alerta.show();
        }

        if (dao.atualizarLivro(Long.parseLong(textId.getText()), Float.parseFloat(textPreco.getText()), Integer.parseInt(textQuantidade.getText()))) {
            alerta = new Alert(Alert.AlertType.CONFIRMATION);
            alerta.setHeaderText("Confirmação");
            alerta.setContentText("Livro atualizado com sucessso!");
            alerta.show();
        } else {
            alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText("Erro");
            alerta.setContentText("Nenhum livro encontrado, por favor verifique o ID do livro");
            alerta.show();
        }
    }
}
