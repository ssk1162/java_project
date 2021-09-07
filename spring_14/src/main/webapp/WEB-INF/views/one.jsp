<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<h1>검색된 회원 정보</h1>
<hr>
검색된 id: ${dto.id} <br> <!-- dto.getId -->
검색된 pw: ${dto.pw} <br>
검색된 name: ${dto.name} <br>
검색된 tel: ${dto.tel} <br>
</body>
</html>