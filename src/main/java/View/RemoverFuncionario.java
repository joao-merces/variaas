package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RemoverFuncionario extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("removerfuncionario.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        stage.setTitle("Variaas-Remover Funcionarios");
        stage.setScene(scene);
        stage.setWidth(500);
        stage.setHeight(400);
        stage.setResizable(false);
        stage.show();
    }
}
