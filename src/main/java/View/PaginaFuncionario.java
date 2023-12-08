package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PaginaFuncionario extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("paginafuncionario.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        stage.setTitle("Variaas-Funcionário");
        stage.setScene(scene);
        stage.setWidth(698);
        stage.setHeight(400);
        stage.setResizable(false);
        stage.show();
    }
}
