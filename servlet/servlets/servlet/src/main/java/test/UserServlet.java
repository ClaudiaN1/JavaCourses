package test;

import DAO.Client;
import facades.ClientFacade;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class UserServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClientFacade userFacade = new ClientFacade();
        List<Client> users = userFacade.getUsers();

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<p>The users are: </p>");
        users.forEach( u -> {
            writer.println("<li>");
            writer.println(u.getName());
            writer.println("</li>");
        });
        writer.println("</body>");
        writer.println("</html>");
    }
}
