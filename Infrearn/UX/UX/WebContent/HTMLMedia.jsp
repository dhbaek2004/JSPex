<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>HTML media Test</title>
</head>
<body>
	<audio src="http://localhost:8090/UX/src/music.mp3" autoplay controls></audio> <br>
	
	<audio controls autoplay>
		<source src="music.mp3" type="audio/mp3">
		<source src="music.ogg" type="audio/ogg">
		<source src="music.wav" type="audio/wav">
	</audio> <br>
	
	<video src="/music.mp3" width="640" height="480" autoplay controls></video> <br>
	
	<iframe src="MyHomePage.jsp" width="640" height="240"></iframe> <br>
	
	<iframe src="" name="iframe1" width="640" height="360"></iframe>
	<p><a href="MyHomePage.jsp" target="iframe1">Ŭ���ϸ� MyHomePage</a></p>
	
	<textarea rows="5" cols="50">
		&lt;html&gt;
		 &lt;body&gt;
		 	&lt;h1&gt;This is a header.&lt;h1&gt;
		 &lt;body&gt;
		&lt;html&gt;
		<br>
		<br>
		
		<iframe src="MyHomePage" width="420" height="100"></iframe>
	
	</textarea>
</body>
</html>