package Controller;

import Model.DAO.FuncionarioDAO;
import Model.DAO.FuncionarioDAOImpl;
import Model.VO.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CadastrarFuncionarioController {
    @FXML
    private Button botaoCadastrar;

    @FXML
    private DatePicker textDataNascimento;

    @FXML
    private TextField textSalario;

    @FXML
    private Button botaoVoltar;

    @FXML
    private TextField textEmailFuncionario;

    @FXML
    private TextField textNomeFuncionario;

    @FXML
    void botaoVoltarClicked(ActionEvent event) {
        Stage stage = new Stage();
        stage = (Stage) botaoVoltar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void botaoCadastrarClicked(ActionEvent event) {
        System.out.println("Botao cadastrar clicado");
        
        FuncionarioDAO dao = new FuncionarioDAOImpl();
        
        Funcionario func = new Funcionario();
        
        func.setFuncionarioEmail(textEmailFuncionario.getText());
        func.setFuncionarioNome(textNomeFuncionario.getText());
        func.setFuncionarioDataNascimento(textDataNascimento.getValue());
        func.setFuncionarioSalario(Float.parseFloat(textSalario.getText()));
        
        try{
             dao.salvar(func);
        }catch(Error e){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText("Erro de inserção!");
            alerta.setContentText("Ocorreu um erro ao salvar o funcionário \n código do erro: " + e);
            
        } 
    }
}
