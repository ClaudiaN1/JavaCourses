

<html>
    <body>
        <form action = "${pageContext.request.contextPath}/login" method = "POST">
            <input type = "hidden" name = "requestedURI" value = "${requestedPage}" />
            <table>
                <tr>
                    <td>
                         Username
                    </td>
                    <td>
                         <input type = "text" name = "userName" />

                    </td>
                </tr>
                <tr>
                     <td>
                         Password
                     </td>
                     <td>
                         <input type = "text" name = "password" />
                     </td>
                </tr>
                <tr>
                     <td>
                     </td>
                     <td>
                           <input name = "login" type ="submit" value = "Log in" />
                     </td>
                </tr>
            </table>
        </form>
    </body>
</html>
