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
			�̸��� : <input type="email" name="email"> <br>
			URL : <input type="url" name="url"> <br>
			��ȭ��ȣ : <input type="tel" name="tel"> <br>
			���� : <input type="color" name="color"> <br>
			�� : <input type="month" name="month"> <br>
			��¥ : <input type="date" name="date"> <br>
			�� : <input type="month" name="week"> <br>
			�ð� : <input type="time" name="time"> <br>
			���� �ð� : <input type="datetime-local" name="localdatetime"> <br>
			���� : <input type="number" name="number" min="1" max="10" step="2"> <br>
			���� : <input type="range" name="range" min="1" max="10" step="2"> <br>
		
			<input type="submit" value="�����ϱ� ��ư" name="button1">
		</div>
		
		<br>
		
		<div style="border:3px solid orange;">
			�̸�: <input type="text" name="name"> <br>
			�й�: <input type="text" name="number" size="10"> <br>
			<br>
			��й�ȣ : <input type="password" name="password"> <br>
			<br>
			���� : 
			<input type="radio" name="gender" value="male"> ����
			<input type="radio" name="gender" value="female"> ���� <br>
			<br>
			üũ�ڽ� :
			<input type="checkbox" name="fruits" value="apple" checked> ���
			<input type="checkbox" name="fruits" value="grape" > ����
			<input type="checkbox" name="fruits" value="orange" > ������
			<br>
			<input type="reset" value="�ʱ�ȭ">
			<br>
			<input type="button" value="���â" onclick="alert('���â�� Ŭ���Ͽ����ϴ�.')">
			<br>
			<button type="button" onclick="alert('�ȳ��ϼ���?')">����������!</button>
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