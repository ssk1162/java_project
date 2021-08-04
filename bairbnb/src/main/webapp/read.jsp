<%@page import="search.dto.searchBag"%>
<%@page import="java.util.ArrayList"%>
<%@page import="search.db.searchDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<%
		String title = request.getParameter("title");
		String keyword = request.getParameter("keyword");
		
		searchDAO dao = new searchDAO();
		ArrayList<searchBag> list = dao.read(title, keyword);
		
		for (int i = 0; i < list.size(); i++) {
			searchBag bag = new searchBag();
			bag = list.get(i);
			
			
			
		}
		
	%>

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
					</select> -->
					
						<input type="text" name="title" placeholder="어디로 여행가세요?" size=17>
						<button id="btn">검색</button>
					</form>
				</li>
				
			</ul>
			<br>
			<br>
			<br>
			<table>
				<tr>
					<td>
					<img src="img/<%=bag %> " width="350" height="350"><br>
					<hr>
					<%=bag.getProid() + " "%>
					<%=bag.getPronam() + " "%>
					<%=bag.getProadd() + " "%>
					<%=bag.getProtel() + " "%>
					<%=bag.getPropic() %>
					
					</td>
					
				</tr>
				
			</table>

		</div>

	</div>
</body>
</html>