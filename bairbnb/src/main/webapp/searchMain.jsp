<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/searchCSS.css">
</head>
<body>
	<div id="total">
		<div id="top">
			<ul>
				<li>
				<a href="">체크인</a>
				</li>

				<li>
				<a href="">체크아웃</a>
				</li>

				<li>
					<form action="read.jsp">
<!-- 					<select name="col">
						<option>방 이름</option>
						<option>주소</option>
					</select>
					 -->
						<input type="text" name="title" placeholder="어디로 여행가세요?" size=17>
						<button id="btn">검색</button>
					</form>
				</li>
				
			</ul>
		
		</div>

	</div>
</body>
</html>