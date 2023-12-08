package Controller;

import Model.DAO.LivroDAO;
import Model.DAO.LivroDAOImpl;
import Model.RN.LivroRN;
import Model.VO.Livro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CadastrarLivroController {
    @FXML
    private TextField textPreco;

    @FXML
    private TextField textCaminho;

    @FXML
    private TextField textQuantidade;

    @FXML
    private Button botaoCadastrar;

    @FXML
    private DatePicker textAnoPublicacao;

    @FXML
    private TextField textAutor;

    @FXML
    private TextField textTitulo;

    @FXML
    private Button botaoVoltar;

    @FXML
    private TextField textGenero;

    @FXML
    void botaoVoltarClicked(ActionEvent event) {
        Stage stage = new Stage();
        stage = (Stage) botaoVoltar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void botaoCadastrarClicked(ActionEvent event) {
        System.out.println("Botao cadastrar clicado");

        LivroDAO dao = new LivroDAOImpl();

        Livro livro = new Livro();

        livro.setLivroTitulo(textTitulo.getText());
        livro.setLivroAutor(textAutor.getText());
        livro.setLivroGenero(textGenero.getText());
        livro.setImageSource(textCaminho.getText());
        livro.setLivroPreco(Float.parseFloat(textPreco.getText()));
        livro.setLivroEstoque(Integer.parseInt(textQuantidade.getText()));
        livro.setLivroPublicacao(textAnoPublicacao.getValue());

        if (LivroRN.verificaCadastroLivro(livro)) {

            try {
                dao.salvar(livro);
                Alert alertaInsercao = new Alert(Alert.AlertType.INFORMATION);
                alertaInsercao.setHeaderText("Inserção confirmada");
                alertaInsercao.setContentText("Livro cadastrado com sucesso.");
                alertaInsercao.show();
            } catch (Exception e) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setHeaderText("Erro ao inserir livro");
                alerta.setContentText("Ocorreu um problema ao cadastrar o livro, por favor cheque as inserções e tente novamente. Código do erro: " + e);
                alerta.show();
            }
        }
    }
}
