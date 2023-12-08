package Controller;

import Model.DAO.LivroDAOImpl;
import Model.VO.Livro;
import View.AtualizarLivro;
import View.CadastrarFuncionario;
import View.CadastrarLivro;
import View.ListaCliente;
import View.RemoverFuncionario;
import View.removerLivro;
import View.AtualizarFuncionario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class PaginaGerenteController implements Initializable {
    @FXML
    private Button btnAtualizarFuncionario;

    @FXML
    private Button btnListaCliente;

    @FXML
    private Button btnRemoveLivro;

    @FXML
    private Button btnAddLivro;

    @FXML
    private Button btnAdicionarFuncionario;

    @FXML
    private Button btnAtualizarLivro;

    @FXML
    private Button btnRemoveFuncionario;

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
    private TableColumn<Livro, Date> tableViewAnoPublicacao;

    @FXML
    private TableColumn<Livro, String> tableViewNome;

    @FXML
    private TableColumn<Livro, Integer> tableViewQtdEstoque;

    public void initTable() {
        tableViewCodigo.setCellValueFactory(new PropertyValueFactory<>("livroId"));
        tableViewNome.setCellValueFactory(new PropertyValueFactory<>("livroTitulo"));
        tableViewGenero.setCellValueFactory(new PropertyValueFactory<>("livroGenero"));
        tableViewAutor.setCellValueFactory(new PropertyValueFactory<>("livroAutor"));
        tableViewPreco.setCellValueFactory(new PropertyValueFactory<>("livroPreco"));
        tableViewAnoPublicacao.setCellValueFactory(new PropertyValueFactory<>("livroPublicacao"));
        tableViewQtdEstoque.setCellValueFactory(new PropertyValueFactory<>("livroEstoque"));
        tableView.setItems(atualizaTabela());
    }

    public ObservableList<Livro> atualizaTabela() {
        LivroDAOImpl livroDAO = new LivroDAOImpl();
        return FXCollections.observableArrayList(livroDAO.listarTodos());
    }

    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initTable();
    }

    @FXML
    void btnAddLivroClicked(ActionEvent event) throws Exception {
        CadastrarLivro cadastrarLivro = new CadastrarLivro();
        Stage stage = new Stage();
        cadastrarLivro.start(stage);
    }

    @FXML
    void btnRemoveLivroClicked(ActionEvent event) throws Exception {
        removerLivro removerLivro = new removerLivro();
        Stage stage = new Stage();
        removerLivro.start(stage);
    }

    @FXML
    void btnAtualizarLivroClicked(ActionEvent event) throws Exception {
        AtualizarLivro atualizarLivro = new AtualizarLivro();
        Stage stage = new Stage();
        atualizarLivro.start(stage);

    }

    @FXML
    void btnAdicionarFuncionarioClicked(ActionEvent event) throws Exception {
        CadastrarFuncionario cadastrarFuncionario = new CadastrarFuncionario();
        Stage stage = new Stage();
        cadastrarFuncionario.start(stage);
    }

    @FXML
    void btnRemoveFuncionarioClicked(ActionEvent event) throws Exception {
        RemoverFuncionario removerFuncionario = new RemoverFuncionario();
        Stage stage = new Stage();
        removerFuncionario.start(stage);
    }

    @FXML
    void btnAtualizarFuncionarioClicked(ActionEvent event) throws Exception {
        AtualizarFuncionario atualizarFuncionario =  new AtualizarFuncionario();
        Stage stage = new Stage();
        atualizarFuncionario.start(stage);
    }

    @FXML
    void btnListaClienteClicked(ActionEvent event) throws Exception {
        ListaCliente listaCliente = new ListaCliente();
        Stage stage = new Stage();
        listaCliente.start(stage);
    }

}
