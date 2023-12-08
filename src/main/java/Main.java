import Model.DAO.ConexaoDB;
import View.Login;
import javafx.application.Application;
import javax.persistence.EntityManager;

public class Main {
    public static void iniciaHibernate() {
        EntityManager manager;
       
       manager =  ConexaoDB.getInstance();
    }

    public static void main(String[] args) {
        iniciaHibernate();
        Application.launch(Login.class);
    }
}
