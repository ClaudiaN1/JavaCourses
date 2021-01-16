<%
request.setAttribute("a",1);
RequestDispatcher rd = request.getRequestDispatcher("test2_out.jsp");
rd.forward(request,response);
%>