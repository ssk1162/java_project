<%-- <%@page import="search.dto.searchBag"%>
<%@page import="java.util.ArrayList"%>
<%@page import="search.db.searchDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<%
		searchDAO dao = new searchDAO();
		ArrayList<searchBag> list = dao.read();
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
				<li><a>체크인</a></li>

				<li><a>체크아웃</a></li>

				<li>
					<form action="read.jsp">
						<select name="col">
							<option>전체 목록</option>
							<option>방 이름</option>
							<option>주소</option>
						</select> <input type="text" name="proid" placeholder="어디로 여행가세요?" size=17>
						<button id="btn">검색</button>
					</form>
				</li>

				<li>
					<form action="searchAll.jsp">
						<button id="btn1">전체 검색</button>
					</form>
				</li>

			</ul>
			<br>
			<br>
			<br>
			<table>
						<%
						for (searchBag dto : list) {
						%>
				<tr>
					<td>
						
						<img src="img/<%=dto.getProimg()%> " width="350" height="350"><br>

						<hr>
						<%=dto.getProid() + " "%>
						<%=dto.getPronam() + " "%>
						<%=dto.getProadd() + " "%>
						<%=dto.getProtel() + " "%>
						<%=dto.getPropic()%>

					</td>

				</tr>
				<%}%>

			</table>
		</div>

	</div>

</body>
</html> --%>