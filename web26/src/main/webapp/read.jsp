<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%
		String id = request.getParameter("id");
    	// DB처리하는 DAO에게 주면서 검색하는 SQL문을 만들어서 전송    	
    	
    	회원Bag bag = new 회원Bag();
    	bag.setId(id);
    	// 가방을 만들어서 데이터를 넣자
    	
    	회원DAO2 dao = new 회원DAO2();
    	회원Bag bag2 = dao.read(bag);
    	/* String text = "회원검색 실패 재검색해주세요";
    	if (result == 1) {
    		text = "회원검색 성공";
    	} */
    	// DAO를 만들어서 탈퇴요청
    	
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원 정보 검색 결과입니다</h3>
<hr>
검색된 id는 <%= bag2.getId() %> <br>
검색된 pw는 <%= bag2.getPw() %> <br>
검색된 name는 <%= bag2.getName() %> <br>
검색된 tel는 <%= bag2.getTel() %> <br>

</body>
</html>