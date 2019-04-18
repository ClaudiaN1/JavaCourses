<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
    <c:forEach var = "i" begin = "1" end = "5">
     Item <c:out value = "${i}"/>
    </c:forEach>
</body>
</html>