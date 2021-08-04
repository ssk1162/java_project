<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    	String id = request.getParameter("id");
    
    	session.setAttribute("id2",id);
    	
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

세션값은 <%= session.getAttribute("id2") %>

<form action="cafe.jsp"><button>cafe</button></form>
<form action="news.jsp"><button>news</button></form>
<form action="mail.jsp"><button>mail</button></form>

</body>
</html>