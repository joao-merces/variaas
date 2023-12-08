package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AtualizarFuncionario extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("atualizarfuncionario.fxml"));
        Parent root = loader.load();

        // Criando uma tela
        Scene scene = new Scene(root);

        // Configurandd tela
        stage.setTitle("Variaas-Atualizar Funcionarios");
        stage.setScene(scene);
        stage.setHeight(348);
        stage.setWidth(600);
        stage.setResizable(false);
        stage.show();
    }
}