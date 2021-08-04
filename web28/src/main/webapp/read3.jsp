<%@page import="shop.db.ProductDAO"%>
<%@page import="shop.dto.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
		String id = request.getParameter("id");
    	
    	ProductDTO bag = new ProductDTO();
    	bag.setId(id);
    	
    	ProductDAO dao = new ProductDAO();
    	ProductDTO bag2 = dao.read(bag);
    	
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>product 정보 검색 결과입니다</h3>
<hr>
<table border=1>
	<tr>
		<td>아이디</td>
		<td>제목</td>
		<td>내용</td>
		<td>작성자</td>
	</tr>

	<tr bgcolor="pink">
		<td><%= bag2.getId() %></td>
		<td><%= bag2.getName() %></td>
		<td><%= bag2.getContent() %></td>
		<td><%= bag2.getPrice() %></td>
	</tr>

</table>
</body>
</html>