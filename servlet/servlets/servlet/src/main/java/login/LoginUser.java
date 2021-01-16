package login;

import DAO.User;
import facades.UserFacade;


import javax.servlet.http.HttpSession;

public class LoginUser {
    private HttpSession session;
    private static final String USER_ATTRIBUTE_NAME = "user";

    public LoginUser(HttpSession session) {
        this.session = session;
    }

    public boolean login(String userName, String password) {
        UserFacade userFacade = new UserFacade();
        User user = userFacade.login(userName, password);

        if (user != null) {
            session.setAttribute(USER_ATTRIBUTE_NAME, user);
            return true;
        }
        return false;
    }

    public boolean isLoggendIn() {
        return (session.getAttribute(USER_ATTRIBUTE_NAME) != null);
    }

    public void logOut() {
        session.setAttribute(USER_ATTRIBUTE_NAME, null);
    }
}
