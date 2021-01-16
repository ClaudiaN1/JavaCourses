<%@taglib prefix = "t" tagdir = "/WEB-INF/tags" %>

<t:template>
    <jsp:body>
        <p>Add new user: </p>
        <br/>
        <form action = "${pageContext.request.contextPath}/actions/f" method = "POST">
            UserName: <input type = "text" name = "userName"/>
            Email: <input type = "text" name = "email"/>
            <input name = "insert" type = "submit" value = "Add user"/>
        </form>

    </jsp:body>
</t:template>