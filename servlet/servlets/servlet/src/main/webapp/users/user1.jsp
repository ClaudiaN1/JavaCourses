<%@ page import = "DAO.User" %>
<%@ page import = "facades.UserFacade" %>
<%@ page import = "java.util.List" %>

<%
  List<User> users = new UserFacade().getUsers();
%>
<html>
    <body>
        <p>The users are :</p>
        <br/>
        <% for(User u:users) { %>
            <li><%=u.getName()%></li>
        <% } %>
    </body>
</html>