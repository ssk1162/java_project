<%@page import="java.util.ArrayList"%>
<%@page import="shop.db.ProductDAO"%>
<%@page import="shop.dto.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	
   		ProductDAO dao = new ProductDAO();
   		ArrayList<ProductDTO> list = dao.read(); //ArrayList<게시판BBag>
    	
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border=1>
<tr bgcolor="yellow">
	<th>아이디</th>
	<th>제목</th>
	<th>내용</th>
	<th>작성자</th>
</tr>
	<%
		for (ProductDTO dto : list) {
		
	%>
	<tr bgcolor="pink">
		<td><%= dto.getId() %></td>
		<td>
			<a href="http://localhost:8080/web28/read2.jsp?id=<%= dto.getId() %>">
			<%= dto.getName() %>
			</a>
			
		</td>
			
		<td><%= dto.getContent() %></td>
		<td><%= dto.getPrice() %></td>
	</tr>
		
	<%} %>
</table>
</body>
</html>