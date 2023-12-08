package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CadastrarLivro extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("cadastralivro.fxml"));
        Parent root = loader.load();

        // Criando uma tela
        Scene scene = new Scene(root);

        // Configurandd tela
        stage.setTitle("Variaas-Cadastro de Livros");
        stage.setScene(scene);
        stage.setHeight(550);
        stage.setWidth(600);
        stage.setResizable(false);
        stage.show();
    }
}
