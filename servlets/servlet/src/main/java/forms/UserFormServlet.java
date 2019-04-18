package forms;

import facades.ClientFacade;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String insertAttribute = req.getParameter("insert");

        ClientFacade userFacade = new ClientFacade();

        if(insertAttribute != null)
        {
            String userNameAttribute = req.getParameter("userName");
            String emailAttribute = req.getParameter("email");
            userFacade.insert(userNameAttribute, emailAttribute);
        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/forms/UserFrom.jsp");
        requestDispatcher.forward(req,resp);
    }
}
