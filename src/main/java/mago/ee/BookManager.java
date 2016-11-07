package mago.ee;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class BookManager {

    @PersistenceContext(unitName = "books-PU")
    EntityManager entityManager;


    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Book createBook(String name) {
        Book book = new Book();
        book.setName(name);
        book.setDescription("--");

        this.entityManager.persist(book);
        return book;
    }

}
