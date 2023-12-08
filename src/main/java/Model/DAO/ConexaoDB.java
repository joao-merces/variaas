package Model.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.HibernateError;

public class ConexaoDB {

    private static EntityManagerFactory factory;
    private static EntityManager manager;

    public static EntityManager getInstance() {

        if (manager == null) {
            try {
                factory = Persistence.createEntityManagerFactory("Biblioteca");
                manager = factory.createEntityManager();
            } catch (HibernateError he) {
                System.err.println(he.getMessage());
            }
        }

        return manager;
    }

    public static void close() {
        manager.close();
        factory.close();
    }
}
