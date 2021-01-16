<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix = "t" tagdir = "/WEB-INF/tags" %>

<t:template>
    <jsp:body>
        Cookies:
        <table>
            <c:forEach var = "c" items = "${pageContext.request.cookies}">
                <tr>
                    <td align = "right">
                        <c:out value = "${c.name}"/>
                    </td>
                    <td>
                        <c:out value = "${c.value}"/>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </jsp:body>
</t:template>