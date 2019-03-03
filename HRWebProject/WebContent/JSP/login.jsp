<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/HRWebProject/CSS/login.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<jsp:include page="head.jsp"></jsp:include>
<body>
	<div class="login">
		<div class="div">
			<form action="/HRWebProject/LoginServlet" method="post">
				<table>
					<tr>
						<td colspan="2" class="td1 font">还不是商城用户？<a href="/HRWebProject/JSP/register.jsp">立即注册</a></td>
					</tr>
					<tr>
						<td class="right">用户名：</td>
						<td class="left">
							<input type="text" size=30 placeholder="请输入登录名" name="logname" id="logname" ><br>
							<span id="s_logname"></span>
						</td>
					</tr>
					<tr>
						<td class="right">密&nbsp;&nbsp;码：</td>
						<td class="left">
							<input type="password" size=31 placeholder="请输入6-16位密码" name="logpwd" id="logpwd" ><br>
							<span id="s_logpwd"></span>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<input id="login" type="submit" value="登&nbsp;&nbsp;录">
						</td>
					</tr>
					<tr>
						<td colspan="2" class="font">疯狂源自梦想，技术成就辉煌&nbsp;&nbsp;<a href="">广州粤嵌</a></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>