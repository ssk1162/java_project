<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	// $() : body태그 안을 ram에 dom tree로 읽어들여라 (loading)
	// $(function () { } ) : body를 다 읽어들인 후, 입력값으로 넣은 이름없는 함수부분을 실행해주세요
	$(function() {
		//	alert('dom tree를 모두 일어들였음')
		$('#b1').click(function() {
			location.href = "domTree.jsp"
		})

		$('#b2').click(function() {
			// 1, 2, 3입력값 가지고 와야함
			in1Value = $('#in1').val()
			alert(in1Value)
			// 사이트를 찾아서 조건에 따라 사이트로 전환
		})

		$('#b3').click(function() {
			in2Tag = $('#in2')
			in2Value = in2Tag.val()
			in3Tag = $('#in3')
			in3Value = in3Tag.val()
			result1Tag = $('#result1')
			if (in2Value == 1 && in3Value == 1) { // 논리연산
				//alert('우산가지고가자')
				//result1Tag.text('우산가지고가자')
				result1Tag.append('<font color=blue>우산가지고가자</font><br>')

			} else {
				//alert('우산가지고가지말자')
				//result1Tag.html('<font color=red>우산가지고가지말자</font>')
				result1Tag.append('<font color=red>우산가지고가지말자</font><br>')
			}
			in2Tag.val('')
			in3Tag.val('')
		})

	})
	
</script>

</head>
<body>
	<button id=b1>사이트 이동</button>
	<br>
	<hr>
	먹고 싶은 음식 1)커피 2)자장면 3)짬뽕밥 :
	<input id='in1'>
	<button id=b2>입력값 읽어서 처리</button>
	<br>
	<hr>
	비가 오나요 1) 온다 2) 안온다
	<input id='in2'>
	<br> 구름이 많은가 1) 많다 2) 없다
	<input id='in3'>
	<button id=b3>입력값 읽어서 처리2</button>
	<hr color=red>
	<div id='result1'>결과가 나타나는 부분</div>
</body>
</html>