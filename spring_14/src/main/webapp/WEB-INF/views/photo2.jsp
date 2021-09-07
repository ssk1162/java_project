<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
사진 및 글작성 성공!
<hr>

사진아이디: ${dto.ph_id}<br>
회원아이디: ${dto.memid}<br>
회원이름: ${dto.mname}<br>
사진: ${dto.ph_photo}<br>
날짜: ${dto.ph_day}<br>
내용: ${dto.ph_content}<br>
제목: ${dto.ph_title}<br>

</body>
</html>