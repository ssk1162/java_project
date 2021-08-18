<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="basketC.css">

</head>
<body id="bbb1">
	
	<h3>장바구니 내용 확인</h3>
	<hr>
	내 아이디 :<%= request.getParameter("name")%><br>
	상품 아이디 :<%= request.getParameter("name1") %><br>
	상품 가격 :<%= request.getParameter("name2") %><br>
	상품 수량 :<%= request.getParameter("name3") %><br>
	
	
</body>
</html>