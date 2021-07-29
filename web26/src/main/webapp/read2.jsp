<%@page import="shop.dto.게시판BBag"%>
<%@page import="shop.db.게시판DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%
		String id = request.getParameter("id");
    	// DB처리하는 DAO에게 주면서 검색하는 SQL문을 만들어서 전송    	
    	
    	게시판BBag bag = new 게시판BBag();
    	bag.setId(id);
    	// 가방을 만들어서 데이터를 넣자
    	
    	게시판DAO dao = new 게시판DAO();
    	게시판BBag bag2 = dao.read(bag);
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
<h3>게시판 정보 검색 결과입니다</h3>
<hr>
검색된 id는 <%= bag2.getId() %> <br>
검색된 title는 <%= bag2.getTitle() %> <br>
검색된 content는 <%= bag2.getContent() %> <br>
검색된 writer는 <%= bag2.getWriter() %> <br>

</body>
</html>