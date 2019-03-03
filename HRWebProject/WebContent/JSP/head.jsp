<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/HRWebProject/CSS/head.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/HRWebProject/JS/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/HRWebProject/JS/register.js"></script>

<title>Insert title here</title>
</head>
<body onload="textLogin()">
	<header>
		<div>
		
			<div>官方网站
				<a href="http://gz.gec-edu.org?qzdqzbdyueqianpc23">http://gz.gec-edu.org?qzdqzbdyueqianpc23</a>
				<c:if test="${!empty login_name}">
				<a href="/HRWebProject/JSP/login.jsp"><span id="login_text">欢迎：${login_name}</span></a>
				</c:if>
					<c:if test="${empty login_name}">
				<a href="/HRWebProject/JSP/login.jsp"><span id="login_text">[登录]</span></a>
				</c:if>
				<a href="/HRWebProject/JSP/register.jsp">[免费注册]</a>
				<a href="/HRWebProject/ShopCarOfUserServlet">[我的购物车]</a>
				<a href="/HRWebProject/JSP/order_query.jsp">[我的订单]</a>
				<a href="#">[设为首页]</a>
				<a href="#">[加入收藏]</a>
			</div>
			
		</div>
		
		<div class="div">
			<div><img src="/HRWebProject/image/logo.gif"></div>
			<div><img src="/HRWebProject/image/banner.gif"></div>
				
			<div class="div1">
				<div>关于我们</div>
				<div>联系方式</div>
			</div>
		</div> 
	
		<nav>
			<table>
				<tr>
					<td><a href="/HRWebProject/index.do">首页</a></td>
					<td><a href="/HRWebProject/index.do?typeCode=0001">护肤</a></td>
					<td><a href="/HRWebProject/index.do?typeCode=0002">彩妆</a></td>
					<td><a href="/HRWebProject/index.do?typeCode=0003">香气</a></td>
					<td><a href="/HRWebProject/index.do?typeCode=0004">身体护理</a></td>
					<td><a href="/HRWebProject/index.do?typeCode=0005">礼盒套装</a></td>
					<td><a href="/HRWebProject/index.do?typeCode=0006">母婴专区</a></td>
					<td><a href="/HRWebProject/index.do?typeCode=0007">男士专区</a></td>
					<td><a href="/HRWebProject/index.do?typeCode=0008">粉底</a></td>
					<td><a href="/HRWebProject/index.do?typeCode=0009">粉饼</a></td>
					<td><a href="/HRWebProject/index.do?typeCode=00010">睫毛膏</a></td>
					<td><a href="/HRWebProject/index.do?typeCode=00011">唇彩</a></td>
					<td><a href="/HRWebProject/index.do?typeCode=00012">腮红</a></td>
					<td><a href="/HRWebProject/index.do?typeCode=00013">食品保健</a></td>
					<td><a href="/HRWebProject/index.do?typeCode=00014">瘦身类</a></td>
					<td><a href="/HRWebProject/index.do?typeCode=00015">美容类</a></td>
				</tr>		
			</table>
		</nav>
	</header>
</body>
</html>