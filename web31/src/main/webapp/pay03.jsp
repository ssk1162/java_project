<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>주문 정보입니다</h3>
<hr color="pink">
<form action="pay04.jsp">
주문 물건 id: <input type="text" name="productId"><br>
주문 물건 name: <input type="text" name="productname"><br>
주문 총 금액: <input type="text" name="total"><br>
주문한 사람 id: <input type="text" name="uId" value="summer"><br>
<button>결제하기</button>
</form>
</body>
</html>