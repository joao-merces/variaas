package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

public class Login extends Application {
    
    @Override
    public void start(Stage tela) throws Exception {
        
        // Carregando o arquivo FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        Parent root = loader.load();
        
        // Criando uma tela
        Scene scene = new Scene(root);
        
        // Configurandd tela
        tela.setTitle("Variaas-Entre");
        tela.setScene(scene);
        tela.setHeight(600);
        tela.setWidth(400);
        tela.setResizable(false);
        tela.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }   
}
