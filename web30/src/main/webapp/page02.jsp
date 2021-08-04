<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
	    Cookie[] list = request.getCookies();
		for (Cookie c : list) {
			//out.print(c.getName() + "<br>");
			if (!c.getName().equals("JSESSIONID")) {
				out.print(c.getValue() + "<br>");
			}
		}
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>