<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    	//String id = (String)session.getAttribute("id");
    	String id = "apple";
    	
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="insert.jsp">
게시 제목: <input name="title"><br>
게시 내용: <input name="content"><br>
게시 작성자: <input name="writer" value="<%= session.getAttribute("id") %>"><br>
게시 작성자: <input name="writer" value="${id}"><br>
게시 작성자: <input name="writer" value="<%= id %>"><br>

</form>
</body>
</html>