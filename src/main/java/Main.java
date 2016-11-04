import mago.ee.Book;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by aleoz on 11/2/16.
 */
public class Main {

    public static void main(String[] args) throws NamingException {

//        InitialContext context = new InitialContext();
//        DataSource ds = (DataSource) context.lookup("jdbc/mysql");
//
//        Map props = new HashMap<>();
//        props.put("javax.persistence.nonJtaDataSource", ds);

//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("books-PU", props);
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        Book book = new Book();
//        book.setName("El Principito");
//        book.setDescription("--");
//
//        entityManager.getTransaction().begin();
//        entityManager.persist(book);
//        entityManager.getTransaction().commit();
//        entityManager.close();

    }
}
