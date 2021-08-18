<%@page import="search.db.searchDAOsundry"%>
<%@page import="java.util.ArrayList"%>
<%@page import="search.dto.searchBag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!--  양양 리드 불러오는곳  -->
<%
String Break = request.getParameter("Break");

Break = "o";

searchDAOsundry dao = new searchDAOsundry();
ArrayList<searchBag> bag2 = dao.read(Break);
%>
<!--  리드 불러오는곳  -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/searchCSS.css">

</head>
<body>

	<!-- 검색하고 결과값  -->
	<div>
		<jsp:include page="searchMain.jsp"></jsp:include>

	</div>

	<div class="list_wrap">
		<%
		for (searchBag dto : bag2) {
		%>
		<div class="list">
			<div class="list_img">
				<img src="<%=dto.getProimg()%> " width="300" height="500"><br>
				<!-- 이미지 출력 -->
			</div>
			<div class="list_text">
				<span><%=dto.getProid() + " "%></span>
				<!-- 상품아이디 -->
				<span><%=dto.getPronam() + " "%></span><br>
				<!-- 방 이름 -->
				<span><%=dto.getProadd() + " "%></span><br>
				<!-- 주소 -->
				<span><%=dto.getProtel() + " "%></span><br>
				<!-- 전화번호 -->
				<span><%=dto.getProprice()%>원</span><br>
				<!-- 가격 -->
				<span><%=dto.getPropk() + " "%></span>
				<!-- 주차여부 -->
				<span><%=dto.getProwifi() + " "%></span><br>
				<!-- 와이파이여부 -->
				<span><%=dto.getPropet() + " "%></span>
				<!-- 펫여유 -->
				<span><%=dto.getProbk() + " "%></span>
				<!-- 조식여부 -->

			</div>
		</div>
		<%
		}
		%>
	</div>
	<!-- 검색하고 결과값  -->

</body>
</html>