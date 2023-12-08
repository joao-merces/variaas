package Controller;

import Model.DAO.ClienteDAOImpl;
import Model.RN.ClienteRN;
import Model.VO.Cliente;
import View.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignUpController {
    @FXML
    private PasswordField textSenha;

    @FXML
    private DatePicker dataNascimento;

    @FXML
    private TextField textCpf;

    @FXML
    private Button botaoCadastrar;

    @FXML
    private TextField textEmail;

    @FXML
    private Button botaoVoltar;

    @FXML
    private TextField textNome;

    @FXML
    public void botaoCadastrarClicked(ActionEvent e) {
        System.out.println("Cadastrar");

        if (textNome != null && textEmail != null && textCpf != null && textSenha != null && dataNascimento != null) {
            ClienteDAOImpl dao = new ClienteDAOImpl();

            Cliente cli = new Cliente();

            cli.setClienteNome(textNome.getText());
            cli.setClienteEmail(textEmail.getText());
            cli.setClienteCPF(textCpf.getText());
            cli.setClienteSenha(textSenha.getText());
            cli.setClienteDataNascimento(dataNascimento.getValue());

            if (ClienteRN.clienteVerificacao(cli)) {
                dao.salvar(cli);
            }
        } else {
            System.out.println("One or more text fields are null.");
        }
    }


    @FXML
    public void botaoVoltarClicked(ActionEvent e) throws Exception {
        // Criando a tela de login
        Login loginTela = new Login();
        Stage stage = new Stage();
        loginTela.start(stage);

        // Fechando a tela atual "de cadastro"
        stage = (Stage) botaoVoltar.getScene().getWindow();
        stage.close();
    }
}
