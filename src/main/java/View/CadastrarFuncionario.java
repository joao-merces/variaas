package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CadastrarFuncionario extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("cadastrarfuncionario.fxml"));
        Parent root = loader.load();

        // Criando uma tela
        Scene scene = new Scene(root);

        // Configurandd tela
        stage.setTitle("Variaas-Cadastro");
        stage.setScene(scene);
        stage.setHeight(500);
        stage.setWidth(600);
        stage.setResizable(false);
        stage.show();
    }
}
