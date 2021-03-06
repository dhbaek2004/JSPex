<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Web 커피 메뉴</title>
</head>

<body>

	<a id="section1">시작 지점</a>	
	<h1>Web 커피 메뉴</h1>
	<h2>아메리카노 5000원</h2>
	<p>에스프레소에 물을 추가한 것입니다.</p>
	
	<h2>카페오레 6000원</h2>
	<p>에스프레소에 우유를 넣은 커피입니다.</p>
	
	<h2>카푸치노 6000원</h2>
	<p>커피 위에 우유거품을 얹은 커피 입니다.</p>
	
	<ul>
		<li>에스프레소</li>
		<li>아메리카노</li>
		<li>카페라떼</li>
	</ul>
	 
	<ol>
		<li>에스프레소</li>
		<li>아메리카노</li>
		<li>카페라떼</li>
	</ol>
	
	<a href="http://www.google.com/" target="_blank">추가 정보는 여기를 클릭!</a>
	<p>target 속성이 _blank이므로 링크는 새 탭에서 열립니다.</p>
	<a href="http://www.google.com/" target="_self">추가 정보는 여기를 클릭!</a>
	<p>target 속성이 _self이므로 링크는 현재 탭에서 열립니다.</p>
	<a href="http://www.google.com/" target="_parent">추가 정보는 여기를 클릭!</a>
	<p>target 속성이 _parent이므로 링크는 부모 프레임에서 열립니다.</p>
	<a href="http://www.google.com/" target="_top">추가 정보는 여기를 클릭!</a>
	<p>target 속성이 _top이므로 현재 윈도우에 새로운 페이지가 열리고 모든 프레임을 취소합니다.</p>
	
	<a href="#section1">시작 지점으로 가려면 여기를 클릭.</a>
	
	<p> Hello HTML!</p>
	<p> Hello HTML!</p>
	<p> Hello HTML!</p>
	<p> Hello HTML!</p>
	<p> Hello HTML!</p>
	<p> Hello HTML!</p>
	<p> Hello HTML!</p>
	<p> Hello HTML!</p>
	<p> Hello HTML!</p>

	
	<a href="mailto:dhbaek2004@naver.com?subject=Feedback">메일 보내기</a> <br>
	
	<a href="http://www.company.com/data.zip">다운로드 링크</a> <br>
	
	<p> <img src="americano.png" alt="아메리카노 사진" width="300" height="300"> </p>
	
	<table border="1">
	
	<tr>
		<td>홍길동</td>
		<td>90</td>
	</tr>
	
	<tr>
		<td>김철수</td>
		<td>80</td>
	</tr>
	
	</table> <br>
	
	<table border="1">
	<tr>
		<th>영화제목</th>
		<th>연도</th>
		<th>감독</th>
		<th>평가</th>
	</tr>
	<tr>
		<td>신세계</td>
		<td>2013</td>
		<td>안재영</td>
		<td>8.5</td>
	</tr>
	
	<tr>
		<td>회사원</td>
		<td>2012</td>
		<td>소지섭</td>
		<td>7.5</td>
	</tr>
	
	<tr>
		<td>황해</td>
		<td>2014</td>
		<td>하정우</td>
		<td>8.8</td>
	</tr>
	</table>
	
	<br>
	
	<table border="1">
		<caption>
			행열span테스트
		</caption>
		<tr>
			<td>1행1열</td>
			<td>1행2열</td>
			<td>1행3열</td>
		</tr>
		<tr>
			<td rowspan="2">2행1열</td>
			<td>2행2열</td>
			<td>2행3열</td>
		</tr>
		<tr>
			<td>3행2열</td>
			<td>3행3열</td>
		</tr>
		<tr>
			<td colspan="3">4행1열</td>
		</tr>
	
	</table>
	
	<table>
		<tr>
			<td width="50%">
				<ul>
					<li>리스트 항목 1</li>
					<li>리스트 항목 2</li>
					<li>리스트 항목 3</li>
				</ul>
			</td>
			<td>
				<ul>
					<li>리스트 항목 4</li>
					<li>리스트 항목 5</li>
					<li>리스트 항목 6</li>
				</ul>
			</td>
		</tr>
		
		<tr>
			<td>
				<p>테이블 셀 안에는 어떤 요소던 넣을 수 있습니다.</p>
			</td>
			
			<td>
				<img src="americano.png" width="100" height="50">
			</td>		
		</tr>
	</table>
	
	
	<table border="1">
		<tr>
			<th colspan="5">평생교육원 강좌 소개 - 2013년도 2학기</th>
		</tr>
		<tr>
			<th>강좌 이름</th>
			<th>강의자</th>
			<th>소개</th>
			<th>강좌 코드</th>
			<th>실습비</th>
		</tr>
		<tr>
			<td>뎃생과 유화</td>
			<td>김철수</td>
			<td>모든 미술영역의 뼈대를 이루는 뎃셍의 기본실력을 체계적으로 다루며, 유화에서는 재료를 다루는 방법에서부터 다양한 표현 기법에 이르기까지 전문적인 미술인으로 입문할 수 잇또록 각 개인의 수준에 맞춰 개인별 단계별 지도합니다.</td>
			<td>H27</td>
			<td>100,000원</td>
		</tr>
		<tr>
			<td>바이올린</td>
			<td>홍길동</td>
			<td>전반적인 현악기의 특성을 파악하며 기초를 다지고, 에뛰드와 곡을 접하면서 아름다운 음색의 바이올린을 연주할 수 있다.</td>
			<td>H28</td>
			<td>200,000원</td>
		</tr>
		<tr>
			<td>성악아카데미</td>
			<td>김호성</td>
			<td>대충 성악관련 설명</td>
			<td>H30</td>
			<td>300,000원</td>
		</tr>
	
	</table>
</body>


</html>