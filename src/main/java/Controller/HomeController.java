package Controller;

import Model.VO.Livro;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class HomeController implements Initializable {

    @FXML
    private Label recomendados;

    @FXML
    private Button botaoCriarEstante;

    @FXML
    private GridPane livroContainer;

    private List<Livro> Lrecomendados;

    @FXML
    void botaoCriarEstanteClicked(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Lrecomendados = new ArrayList<>(livros());
        int coluna = 0;
        int linha = 1;

        try {
            for (Livro livro : Lrecomendados) {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/View/livro.fxml"));
                VBox livroBox = loader.load();
                LivroController livroController = loader.getController();
                livroController.setDados(livro);

                if (coluna == 4) {
                    coluna = 0;
                    ++linha;
                }

                livroContainer.add(livroBox, coluna++, linha);
                GridPane.setMargin(livroBox, new Insets(28));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Livro> livros() {
        List<Livro> ls = new ArrayList<>();
        Livro livro = new Livro();
        livro.setLivroTitulo("O poder do hábito");
        livro.setImageSource("/Capas/o_poder_do_habito.jpg");
        livro.setLivroAutor("Charles Duhigg");
        ls.add(livro);

        livro = new Livro();
        livro.setLivroTitulo("O poder do hábito");
        livro.setImageSource("/Capas/o_poder_do_habito.jpg");
        livro.setLivroAutor("Charles Duhigg");
        ls.add(livro);

        livro = new Livro();
        livro.setLivroTitulo("O poder do hábito");
        livro.setImageSource("/Capas/o_poder_do_habito.jpg");
        livro.setLivroAutor("Charles Duhigg");
        ls.add(livro);

        livro = new Livro();
        livro.setLivroTitulo("O poder do hábito");
        livro.setImageSource("/Capas/o_poder_do_habito.jpg");
        livro.setLivroAutor("Charles Duhigg");
        ls.add(livro);

        livro = new Livro();
        livro.setLivroTitulo("O poder do hábito");
        livro.setImageSource("/Capas/o_poder_do_habito.jpg");
        livro.setLivroAutor("Charles Duhigg");
        ls.add(livro);

        livro = new Livro();
        livro.setLivroTitulo("O poder do hábito");
        livro.setImageSource("/Capas/o_poder_do_habito.jpg");
        livro.setLivroAutor("Charles Duhigg");
        ls.add(livro);

        livro = new Livro();
        livro.setLivroTitulo("O poder do hábito");
        livro.setImageSource("/Capas/o_poder_do_habito.jpg");
        livro.setLivroAutor("Charles Duhigg");
        ls.add(livro);

        livro = new Livro();
        livro.setLivroTitulo("O poder do hábito");
        livro.setImageSource("/Capas/o_poder_do_habito.jpg");
        livro.setLivroAutor("Charles Duhigg");
        ls.add(livro);

        livro = new Livro();
        livro.setLivroTitulo("O poder do hábito");
        livro.setImageSource("/Capas/o_poder_do_habito.jpg");
        livro.setLivroAutor("Charles Duhigg");
        ls.add(livro);

        livro = new Livro();
        livro.setLivroTitulo("O poder do hábito");
        livro.setImageSource("/Capas/o_poder_do_habito.jpg");
        livro.setLivroAutor("Charles Duhigg");
        ls.add(livro);

        return ls;
    }
}
