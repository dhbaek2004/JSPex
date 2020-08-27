<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="input.jsp" method="post">
		<div style="border:3px solid red;">
			이메일 : <input type="email" name="email"> <br>
			URL : <input type="url" name="url"> <br>
			전화번호 : <input type="tel" name="tel"> <br>
			색상 : <input type="color" name="color"> <br>
			월 : <input type="month" name="month"> <br>
			날짜 : <input type="date" name="date"> <br>
			주 : <input type="month" name="week"> <br>
			시간 : <input type="time" name="time"> <br>
			지역 시간 : <input type="datetime-local" name="localdatetime"> <br>
			숫자 : <input type="number" name="number" min="1" max="10" step="2"> <br>
			범위 : <input type="range" name="range" min="1" max="10" step="2"> <br>
		
			<input type="submit" value="제출하기 버튼" name="button1">
		</div>
		
		<br>
		
		<div style="border:3px solid orange;">
			이름: <input type="text" name="name"> <br>
			학번: <input type="text" name="number" size="10"> <br>
			<br>
			비밀번호 : <input type="password" name="password"> <br>
			<br>
			성별 : 
			<input type="radio" name="gender" value="male"> 남성
			<input type="radio" name="gender" value="female"> 여성 <br>
			<br>
			체크박스 :
			<input type="checkbox" name="fruits" value="apple" checked> 사과
			<input type="checkbox" name="fruits" value="grape" > 포도
			<input type="checkbox" name="fruits" value="orange" > 오렌지
			<br>
			<input type="reset" value="초기화">
			<br>
			<input type="button" value="경고창" onclick="alert('경고창을 클릭하였습니다.')">
			<br>
			<button type="button" onclick="alert('안녕하세요?')">눌러보세요!</button>
		</div>
	</form>
	
	<br>
	<form name="input" action="getfeedback.jsp" method="get">
		<textarea name="feedback" rows="5" cols="50"></textarea>
	</form>
	<br>
	
	<form action="">
		<select name="cars">
			<option value="bmw">BMW</option>
			<option value="benz">Benz</option>
			<option value="hyundai" selected>Hyundai</option>
			<option value="kia">KIA</option>		
		</select>
		
		
	</form>
	<br>
	

</body>
</html>