<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="basketC.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
// $: document
	$(function () { // document를 ram에 dom tree로 다 읽어들였으면 document.ready()
		$('#btn').click(function () {
			inValue = $('#in').val()
			alert(inValue + '아이디 입력을 확인했습니다')
		})
		
	})
</script>
</head>
<body id="bbb">

	
	<h3>장바구니</h3>
	<br>
	<form action="basket2.jsp">
	내 아이디 : <input name="name" id="in" type="text">
	<button id="btn">아이디 입력 확인</button>
	<br>
	상품 아이디 : <input name="name1" id="in1" type="text"><br>
	상품 가격 : <input name="name2" id="in2" type="text"><br>
	상품 수량 : <input name="name3" id="in3" type="text"><br>
	<button id="btn1">장바구니로 저장</button></form>
</body>
</html>