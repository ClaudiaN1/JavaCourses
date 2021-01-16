package filters;

import login.LoginUser;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class AuthenticationFilter implements Filter {
    public static final String REQUESTED_PAGE_ATTRIBUTE_NAME = "requestedPage";


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       boolean redirect = false;

        if(servletRequest instanceof HttpServletRequest) {
            HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

            boolean isLoginPage = (httpServletRequest.getParameter("login ") != null);

            LoginUser userLogin = new LoginUser(httpServletRequest.getSession());

            if (!isLoginPage && !userLogin.isLoggendIn()) {
                String relativeURI = httpServletRequest.getRequestURI();
                relativeURI = relativeURI.substring(httpServletRequest.getContextPath().length());
                httpServletRequest.setAttribute(REQUESTED_PAGE_ATTRIBUTE_NAME, relativeURI);

                RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/LoginForm.jsp");
                requestDispatcher.forward(servletRequest, servletResponse);

                redirect = true;
            }
        }
            if(!redirect){
                filterChain.doFilter(servletRequest,servletResponse);

            }
    }

    @Override
    public void destroy() {

    }
}
