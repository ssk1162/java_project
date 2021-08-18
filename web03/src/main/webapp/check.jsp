<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 1.서버로 전송된 데이터를 받아야 함. -->
<%
	//자바 코드 써줌.
	//HttpServletRequest request = new ttpServletRequest();
	String id = request.getParameter("id"); //apple
	String pw = request.getParameter("pw"); //1234
	String id2 = "root";
	String pw2 = "1234";
	String result = "로그인 실패@@@";
	if(id.equals(id2) && pw.equals(pw2)){
		result = "로그인 성공!!!";
	}
%>
<!-- 2.db에 넣어야함. -->
<%-- <%
	MemberDAO db = new MemberDAO();
	int result = db.login(id, pw);
%> --%>

<!-- 3.db처리가 잘 되었는지 확인하는 메시지를 클라이언트에 보내주어야 함. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
로그인 정보가 도착하였음.<br>
서버에 도착한 id는 <%= id %> <br>
서버에 도착한 pw는 <%= pw %> <br>
<hr>
로그인 결과는 <%= result %>
</body>
</html>