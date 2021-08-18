<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">

h3 {
	background: pink;
	width: 400px;
	height: 100px;
	font-family: "궁서";
	font-size: 70px;
	font-style: inherit;
	font-weight: bold;
}

#result {
	background: pink;
	width: 400px;
	height: 100px;
	font-family: "궁서";
	font-size: 70px;
	font-style: inherit;
	font-weight: bold;
	text-align: center;
}

.c1 {
	background: lime;
}

body ul {	/* body아래의 자손 중에서 ul을 찾아라 */
	color: red;
}

body > ul {	/* body 바로 아래의 자식 중에서 ul을 찾아라 */
	list-style: square;
}

body > #result1 > ul {
	list-style: decimal;
}

</style>

</head>
<body>

	<h3>좋아하는 과목</h3>

	<ul>

		<li class="c1">컴퓨터</li>
		<li class="c1">게임</li>
		<li class="c1">오락실</li>

	</ul>

	<div id=’result’>결과가 보여지는 부분</div>

	<div id=‘result2’>

		<span>결과1</span>

		<ul>

			<li>오늘은 목요알</li>
			<li>내일은 금요일</li>

		</ul>

	</div>

</body>
</html>