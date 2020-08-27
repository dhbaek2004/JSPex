<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	
	
	<!--선언태그 : JSP 페이지에서 Java 멤버변수 또는 메서드 선언 가능-->
	<%!
		int num = 10;
		String str = "hello jsp!";
		ArrayList<String> list = new ArrayList<String>();
		
		public void jspMethod() {
			System.out.println("--jspMethod()--");
		}
	%>
	
	<!-- html 주석표시입니다. -->
	<%-- JSP 주석표시입니다. --%>
	
	
	<!-- 스크립트릿 태그 : JSP 페이지에서 Java 코드를 넣기 위한 태그. -->
	<%
	if(num > 0) {
	%>
	<p> num > 0 </p>
	<%
	} else {
	%>
	<p> num <= 0 </p>
	<%
	}
	%>	
	
	<!-- 표현식 태그 : java의 변수 및 메서드 반환값을 출력하는 태그 -->
	num is <%= num %>
	
	<%@ include file="footer.jsp" %>
	
</body>
</html>