package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class removerLivro extends Application{
    @Override
    public void start(Stage tela) throws Exception {

        // Carregando o arquivo FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("removerLivro.fxml"));
        Parent root = loader.load();

        // Criando uma tela
        Scene scene = new Scene(root);

        // Configurandd tela
        tela.setTitle("Remover Livro");
        tela.setScene(scene);
        tela.setMinHeight(500);
        tela.setMinWidth(400);
        tela.setResizable(false);
        tela.show();
    }
}
