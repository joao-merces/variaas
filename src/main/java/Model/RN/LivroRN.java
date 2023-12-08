package Model.RN;

import Model.VO.Livro;
import javafx.scene.control.Alert;

public abstract class LivroRN {
    public static boolean verificaCadastroLivro(Livro liv){
        
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setHeaderText("Erro de cadastro");
        
        if(liv.getLivroTitulo().isEmpty()){
            alerta.setContentText("Por favor insira um titulo.");
            alerta.show();
            return false;
        } else if(liv.getLivroAutor().isEmpty()){
            alerta.setContentText("Por favor insira o autor do livro.");
            alerta.show();
            return false;
        } else if(null == liv.getLivroEstoque()){
            alerta.setContentText("Por favor insira a quantidade de livros no estoque.");
            alerta.show();
            return false;
        } else if(liv.getLivroGenero().isEmpty()){
            alerta.setContentText("Por favor insira o gênero textual do livro.");
            alerta.show();
            return false;
        } else if(liv.getLivroPublicacao() == null){
            alerta.setContentText("Por favor escolha a data de publicação do livro.");
            alerta.show();
            return false;
        } else if (liv.getImageSource().isEmpty()){
            alerta.setContentText("Por favor insira o caminho para a capa do livro.");
        }   
        return true;
    }
}
