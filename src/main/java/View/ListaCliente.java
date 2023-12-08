package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class ListaCliente extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("listaclientes.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        stage.setTitle("Lista clientes");
        stage.setScene(scene);
        stage.setHeight(400);
        stage.setWidth(600);
        stage.setResizable(false);
        stage.show();
    }
}
