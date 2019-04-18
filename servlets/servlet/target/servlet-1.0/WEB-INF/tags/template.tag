<%@tag description = "template" %>
<%@taglib prefix = "t" tagdir = "/WEB-INF/tags" %>

<html>
    <body>
        <div align = "right" >
            <t:login />
        </div>
        <div>
            <table>
                <tr>
                    <td style = "vertical-align: top;">
                        <div class = "menu" >
                            Menu
                                <li>
                                    <a href = "${pageContext.request.contextPath}/actions/f" > UserForm </a>
                                </li>
                                <li>
                                    <a href = "${pageContext.request.contextPath}/forms/Cookies.jsp"> Cookies </a>
                                </li>
                        </div>
                    </td>
                    <td class = "content">
                        <jsp:doBody/>
                    </td>
                </tr>
            </table>
        </div>
    </body>
</html>