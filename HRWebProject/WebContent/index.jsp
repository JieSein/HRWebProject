<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/HRWebProject/CSS/index.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="JSP/head.jsp"></jsp:include>
	<div class="index">
	
		<div class="index_left">
			<jsp:include page="JSP/index_aside.jsp"></jsp:include>
		</div>
		<div class="index_right">
			<jsp:include page="JSP/index_section.jsp"></jsp:include>
		</div>	
	</div>
	
	<jsp:include page="JSP/foot.jsp"></jsp:include>
</body>
</html>