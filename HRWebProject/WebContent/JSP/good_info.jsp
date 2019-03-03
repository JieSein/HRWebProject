<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/HRWebProject/CSS/good_info.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="head.jsp"></jsp:include>
	
	<div class="good_info">
		<div class="good_info_left">
			<jsp:include page="index_aside.jsp"></jsp:include>
		</div>
	
		<div class="good_info_right">
			<jsp:include page="goods.jsp"></jsp:include>
		</div>
	
	</div>
	
	<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>