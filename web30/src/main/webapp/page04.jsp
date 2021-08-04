<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
		int count = (int)session.getAttribute("count");
    	// Object(big) --- 강제변환 ---> int(small)
    	count++;
    	session.setAttribute("count", count);
    %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	현제 count: <%= session.getAttribute("count") %>
	<hr>
	<a href="page03.jsp">카운트값 초기화</a>
	<a href="page05.jsp">카운트값 확인</a>
</body>
</html>