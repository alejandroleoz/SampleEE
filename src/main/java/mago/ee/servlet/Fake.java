package mago.ee.servlet;

import mago.ee.Book;
import mago.ee.BookManager;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/fake"}
)
public class Fake extends HttpServlet {

    @EJB
    private BookManager bookManager;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book book = this.bookManager.createBook("El Principito");
        resp.getWriter().print("Creado con id " + book.getId());
    }


}
