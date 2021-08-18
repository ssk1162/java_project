<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	// 쿠키객체를 만든다 2개를 만든다
    	Cookie c1 = new Cookie("cate","운동");
    	Cookie c2 = new Cookie("hobby","축구");
    	// 쿠키를 브라우저에 심는다
    	response.addCookie(c1);
    	response.addCookie(c2);

   	%>
   	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="page02.jsp">쿠키확인하러 가기</a>
</body>
</html>