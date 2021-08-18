<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/searchCSS.css">
 
<!-- 검색창에 넣어할것 -->

<script type="text/javascript">
	// 체크인 메뉴바 초기 설정
	function myFunction() {
		document.getElementById("myDropdown").classList.toggle("show");
	}

	// Close the dropdown menu if the user clicks outside of it
	window.onclick = function(event) {
		if (!event.target.matches('.dropbtn')) {
			var dropdowns = document.getElementsByClassName("dropdown-content");
			var i;
			for (i = 0; i < dropdowns.length; i++) {
				var openDropdown = dropdowns[i];
				if (openDropdown.classList.contains('show')) {
					openDropdown.classList.remove('show');
				}
			}
		}
	}
	
	function myFunction2() {
		document.getElementById("myDropdown2").classList.toggle("show");
	}

	// Close the dropdown menu if the user clicks outside of it
	window.onclick = function(event) {
		if (!event.target.matches('.dropbtn')) {
			var dropdowns = document.getElementsByClassName("dropdown-content");
			var i;
			for (i = 0; i < dropdowns.length; i++) {
				var openDropdown = dropdowns[i];
				if (openDropdown.classList.contains('show')) {
					openDropdown.classList.remove('show');
				}
			}
		}
	}
	
	
</script>
<!-- 검색창에 넣어야할것  -->

</head>

<body>

	<!-- 검색창에 넣어야할것  -->
	<div id="total">
		<div id="top">
			<ul>
				<li>
					<div class="dropdown">
						
						<button onclick="myFunction()" class="dropbtn">체크인</button>
						<div id="myDropdown" class="dropdown-content">
							<input id="date_in" type="date">
							
						</div>
						
					</div>
					
					<div class="dropdown">
						
						<button onclick="myFunction2()" class="dropbtn">체크아웃</button>
						<div id="myDropdown2" class="dropdown-content">
							<input id="date_out" type="date">
							
						</div>
						
					</div>

				</li>


				<li>
					<!-- 검색 버튼쪽 -->
					<form action="searchRead.jsp">
						<input type="text" name="word" placeholder="어디로 여행가세요?" size=17>
						<button id="btn">검색</button>

					</form>
				</li>

			</ul>

		</div>

	</div>
	<!-- 검색창에 넣어야할것  -->

</body>



</html>






