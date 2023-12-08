package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PaginaGerente extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("paginagerente.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        stage.setTitle("Variaas-Gerente");
        stage.setScene(scene);
        stage.setWidth(920);
        stage.setHeight(450);
        stage.setResizable(false);
        stage.show();
    }
}
