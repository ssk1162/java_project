<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
		String id = request.getParameter("id");
    	String name = request.getParameter("name");
    	String tel = request.getParameter("tel");
    	// DB처리하는 DAO에게 주면서 탈퇴하는 SQL문을 만들어서 전송    	
    	
    	회원Bag bag = new 회원Bag();
    	bag.setId(id);
    	bag.setName(name);
    	bag.setTel(tel);
    	// 가방을 만들어서 데이터를 넣자
    	
    	회원DAO2 dao = new 회원DAO2();
    	int result = dao.update(bag); // 0 or 1
    	String text = "회원수정 실패 재수정해주세요";
    	if (result == 1) {
    		text = "회원수정 성공";
    	}
    	// DAO를 만들어서 탈퇴요청
    	
    %>
        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	실행 결과는 <%= text  %>
</body>
</html>