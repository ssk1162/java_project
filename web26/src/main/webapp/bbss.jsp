<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/out.css">
</head>
<body>
<div id="total">
	<div id="top">
		<jsp:include page="top.jsp"></jsp:include>
	</div>
	<div id="top2">
		<jsp:include page="top2.jsp"></jsp:include>
	</div>
	<div id="center">
		<form action="insert2.jsp">
		   아이디: <input name = "id"><br>
		   제목: <input name = "title"><br>
		   내용: <input name = "content"><br>
		   작성자: <input name = "writer"><br>
		   <button>게시물 처리</button>
		</form>
		<h3>게시판 하나 검색</h3>
			<form action="read2.jsp">
			   ID: <input name = "id">
			   <button>게시판 하나 검색 처리</button>
			</form>
		<hr>
	</div>
</div>


</body>
</html>