package login;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName  = req.getParameter("userName");
        String password  = req.getParameter("password");

        LoginUser loginUser = new LoginUser(req.getSession());
        PrintWriter resWriter = resp.getWriter();
        if(loginUser.login(userName, password)){
            //resWriter.println("Welcome " + userName);

            increaseUsage(req,resp);

            String requestedURI = req.getParameter("requestedURI");
            if(requestedURI != null) {
                RequestDispatcher requestDispatcher = req.getRequestDispatcher(requestedURI);
                requestDispatcher.forward(req, resp);
            }
        }else{
            resWriter.println("Could not log in! ");
        }

    }

    private void increaseUsage(HttpServletRequest req , HttpServletResponse resp){
        int count = 1;
        for(Cookie c : req.getCookies()){
            if("loginCount".equals(c.getName())){
                count = Integer.parseInt(c.getValue()) + 1;
                break;
            }
        }

        resp.addCookie(new Cookie("loginCount",Integer.toString(count)));
    }

}
