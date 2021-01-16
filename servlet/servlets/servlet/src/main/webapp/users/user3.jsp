<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <body>
        <p>The users are :</p>
        <br/>
        <c:forEach var = "user" items = "${users}">
            <li><c:out value = "${user.name}"/></li>
        </c:forEach>
    </body>
</html>
