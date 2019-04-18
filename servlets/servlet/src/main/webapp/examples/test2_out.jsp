<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<%=request.getAttribute("a")%>
<br/>
<c:out value = "${a}"/>
</body>
</html>