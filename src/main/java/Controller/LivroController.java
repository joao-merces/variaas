package Controller;

import Model.VO.Livro;
import View.ConfirmarCompra;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LivroController {
    @FXML
    private VBox boxLivro;

    @FXML
    private Button btnComprar;

    @FXML
    private ImageView livroCapa;

    @FXML
    private Label livroTitulo;

    @FXML
    private Label livroAutor;
    
    private String[] cores = {
                                    "FFDAB9", // Pêssego
                                    "FFC0CB", // Rosa bebê
                                    "89CFF0", // Azul bebê
                                    "98FB98", // Verde menta
                                    "FFFACD", // Amarelo pastel
                                    "E6E6FA", // Lavanda
                                    "AFEEEE", // Turquesa
                                    "FF6F61", // Coral
                                    "87CEEB", // Azul celeste
                                    "00CED1", // Verde água
                                    "C8A2C8", // Lilás
                                    "FFFFE0", // Amarelo claro
                                    "ADD8E6", // Azul pálido
                                    "32CD32", // Verde limão
                                    "FFB6C1", // Rosa suave
                                    "87CEEB", // Azul-piscina
                                    "FFE5B4", // Pêssego claro
                                    "93C572"  // Verde pistache
                                  };

    @FXML
    void btnComprarClicked(ActionEvent event) throws Exception {
       ConfirmarCompra confirmarcompra = new ConfirmarCompra();
       Stage stage = new Stage();
       confirmarcompra.start(stage);
    }
    
    public void setDados(Livro livro) {
        livroTitulo.setText(livro.getLivroTitulo());
        livroAutor.setText(livro.getLivroAutor());
        String src = livro.getImageSource();
        Image imagem = new Image(src);
        livroCapa.setImage(imagem);
        
        boxLivro.setStyle("-fx-background-color: #" + cores[(int)(Math.random()*cores.length)] + ";"
                + "-fx-background-radius: 15;");
    }
}
