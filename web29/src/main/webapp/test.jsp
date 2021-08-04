<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function login(id, pass) {

		id = prompt('아이디 입력')
		pass = prompt('패스워드 입력')

		if (id == 'root' && pass == '1234') {
			location.href = 'hppt://wwww.naver.com'
		} else {
			location.href = 'hppt://wwww.daum.net'
		}
	}

	function move() {
		money = 1000
		site = prompt('1)일반, 2)vip')
		if (site == '1') {
			alert(money * 1.1)
		} else (site == '2') {
			alert(money * 0.1)
		}
	}
</script>
</head>
<body>
<button style="background: yellow" onclick="login()">로그인 기능 처리</button>
<button style="background: pink" onclick="move()">결제 기능 처리</button>
</body>
</html>