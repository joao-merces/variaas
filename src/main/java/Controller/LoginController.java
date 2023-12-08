package Controller;

import Model.DAO.ClienteDAO;
import Model.DAO.ClienteDAOImpl;
import View.Home;
import View.HomeFuncionario;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import View.SignUp;
import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    @FXML
    private Button botaoEntrar;
    @FXML
    private Button botaoCadastrar;
    @FXML
    private TextField textUsuario;
    @FXML
    private PasswordField textSenha;
    
    @FXML
    public void botaoCadastrarClicked(ActionEvent event) throws Exception {
        // Criando a tela de cadastro
        SignUp cadastroTela = new SignUp();
        Stage stage = new Stage();
        cadastroTela.start(stage);
        
        // Fechando a tela atual (de login)
        stage = (Stage) botaoCadastrar.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void botaoEntrarClicked () throws Exception {
        ClienteDAO dao =  new ClienteDAOImpl();
        
        String usuario = textUsuario.getText();
        String senha = textSenha.getText();

        if("adm".equals(usuario) && "adm".equals(senha)){
            // Criando a tela home
            HomeFuncionario homeTela = new HomeFuncionario();
            Stage stage = new Stage();
            homeTela.start(stage);

            // Fechando a tela atual (de login)
            stage = (Stage) botaoEntrar.getScene().getWindow();
            stage.close();
        } else if(dao.logarCliente(usuario, senha)){
            // Criando a tela home
            Home homeTela = new Home();
            Stage stage = new Stage();
            homeTela.start(stage);

            // Fechando a tela atual (de login)
            stage = (Stage) botaoEntrar.getScene().getWindow();
            stage.close();
        }
    } 
}
