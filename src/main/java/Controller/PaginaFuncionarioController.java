package Controller;

import Model.VO.Livro;
import View.CadastrarFuncionario;
import View.CadastrarLivro;
import View.RemoverFuncionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class PaginaFuncionarioController {
    @FXML
    private Button botaoRmFuncionario;

    @FXML
    private Button botaoAddFuncionario;

    @FXML
    private Button botaoPedidos;

    @FXML
    private Button botaoPesquisar;

    @FXML
    private Button botaoAddLivro;

    @FXML
    private TableView<Livro> tableView;

    @FXML
    private TableColumn<Livro, Long> tableViewCodigo;

    @FXML
    private TableColumn<Livro, Double> tableViewPreco;

    @FXML
    private TableColumn<Livro, String> tableViewGenero;

    @FXML
    private TableColumn<Livro, String> tableViewAutor;

    @FXML
    private TableColumn<?, ?> tableViewAnoPublicacao;

    @FXML
    private TableColumn<Livro, String> tableViewNome;

    @FXML
    private TableColumn<Livro, Integer> tableViewQtdeEstoque;


    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("2");
    }


    @FXML
    void botaoAddLivroClicked(ActionEvent event) throws Exception {
        CadastrarLivro cadLivro = new CadastrarLivro();
        Stage stage = new Stage();
        cadLivro.start(stage);
    }

    @FXML
    void botaoAddFuncionarioClicked(ActionEvent event) throws Exception {
        CadastrarFuncionario cadFunc = new CadastrarFuncionario();
        Stage stage = new Stage();
        cadFunc.start(stage);
        System.out.println("Botao add funcionario clicado");
    }

    @FXML
    void botaoRmFuncionarioClicked(ActionEvent event) throws Exception {
        RemoverFuncionario rmFunc = new RemoverFuncionario();
        Stage stage = new Stage();
        rmFunc.start(stage);
        System.out.println("Botao rm funcionario clicado");
    }

    @FXML
    void botaoPedidosClicked(ActionEvent event) {
        System.out.println("Botao pedidos confirmados clicado");
    }

    @FXML
    void botaoPesquisarClicked(ActionEvent event) {
        System.out.println("Botao pesquisar clicado");
    }
}
