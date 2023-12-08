package Controller;

import Model.DAO.ClienteDAOImpl;
import Model.VO.Cliente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class ListaClienteController implements Initializable {
    @FXML
    private TableColumn<Cliente, String> tableViewEmail;

    @FXML
    private TableColumn<Cliente, String> tableViewCPF;

    @FXML
    private TableColumn<Cliente, Date> tableViewDataNascimento;

    @FXML
    private TableColumn<Cliente, Long> tableViewCodigo;

    @FXML
    private TableView<Cliente> tableView;

    @FXML
    private TableColumn<Cliente, String> tableViewNome;

    public void initTable() {
        tableViewCPF.setCellValueFactory(new PropertyValueFactory<>("clienteCPF"));
        tableViewNome.setCellValueFactory(new PropertyValueFactory<>("clienteNome"));
        tableViewDataNascimento.setCellValueFactory(new PropertyValueFactory<>("clienteDataNascimento"));
        tableViewEmail.setCellValueFactory(new PropertyValueFactory<>("clienteEmail"));
        tableViewCodigo.setCellValueFactory(new PropertyValueFactory<>("clienteId"));
        tableView.setItems(atualizaTabelaCliente());
    }

    public ObservableList<Cliente> atualizaTabelaCliente() {
        ClienteDAOImpl clienteDAO = new ClienteDAOImpl();
        return FXCollections.observableArrayList(clienteDAO.listarTodos());
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initTable();
    }
}
