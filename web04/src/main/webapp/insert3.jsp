<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String sub = request.getParameter("sub");
    String wri = request.getParameter("wri");
    String cont = request.getParameter("cont");
    String caa = request.getParameter("caa");
    String dep = request.getParameter("dep");
    String daya = request.getParameter("daya");    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
제목: <%= sub %><br>
글쓴이: <%= wri %><br>
내용: <%= cont %><br>
종류: <%= caa %><br>
부서: <%= dep %><br>
날짜: <%= daya %>
</body>
</html>