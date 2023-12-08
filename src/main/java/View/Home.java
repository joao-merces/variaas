package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

public class Home extends Application {
    @Override
    public void start(Stage tela) throws Exception {
        
        // Carregando o arquivo FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("home.fxml"));
        Parent root = loader.load();
        
        // Criando uma tela
        Scene scene = new Scene(root);
        
        // Configurandd tela
        tela.setTitle("Variaas-Home");
        tela.setScene(scene);
        tela.setMinHeight(720);
        tela.setMinWidth(1280);
        tela.setResizable(false);
        tela.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
