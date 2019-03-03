<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/HRWebProject/CSS/register.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/HRWebProject/JS/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/HRWebProject/JS/register.js"></script>

<title>Insert title here</title>
</head>

<jsp:include page="head.jsp"></jsp:include>

<body>
	<section>
	<div>
		<div class="div1">注册新用户</div>
		<div class="div2">我已经注册，现在就&nbsp;<a href="/HRWebProject/JSP/login.jsp">登录</a></div>
	</div>
	
	<div class="div3">
		<form action="/HRWebProject/RegisterServlet" method="post" onsubmit="return check()">
			<table>
				<tr>
					<td colspan="3"><span>个人用户信息</span></td>
				</tr>
				<tr>
					<td class="right">*用户名：</td>
					<td class="left">
						<input type="text" size=30 name="uname" id="uname" >
					</td>
					<td class="left"><span id="s_uname"></span></td>
				</tr>
				<tr>
					<td class="right">*密码：</td>
					<td class="left">
						<input type="password" size=30 name="pwd" id="pwd" >
					</td>
					<td class="left"><span id="s_pwd"></span></td>
				</tr>
				<tr>
					<td class="right">*确认密码：</td>
					<td class="left">
						<input type="password" size=30 name="pwds" id="pwds" >
					</td>
					<td class="left"><span id="s_pwds"></span></td>
				</tr>
				<tr>
					<td class="right">*真实姓名：</td>
					<td colspan="2" class="left">
						<input type="text" size=30 name="realname" id="realname" >
					</td>
				</tr>
				<tr>
					<td class="right">*性别：</td>
					<td colspan="2" class="left">
						<input type="radio" name="sex" id="man" checked value="1" >男&nbsp;&nbsp;
						 <input type="radio" name="sex" id="female" value="0" >女
					</td>			
				</tr>
				<tr>
					<td class="right">*详细地址：</td>
					<td colspan="2" class="left">
						<input type="text" size=30 name="address" id="address" >
					</td>
				</tr>
				<tr>
					<td class="right">*联系电话:</td>
					<td class="left">
						<input type="text" maxlength=11 size=30 name="telephone" id="telephone" >
					</td>
					<td class="left"><span id="s_telephone"></span></td>
				</tr>
				<tr>
					<td class="right">*验证码：</td>
					<td class="left">
						<input type="text" size=30 maxlength=4 name="velidate" id="velidate" >
					</td>
					<td class="left">
						<a href="javascript:show()"><img alt="无法显示图片" src="/HRWebProject/CheckCoed" name="imgveli" id="imgveli"></a>
						看不清？<a href="javascript:show()">换一张</a>
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<input id="register" type="submit" value="同意一下协议，提交">
					</td>
				</tr>
				<tr>
					<td colspan="3">
					</td>
				</tr>
			</table>
			</form>
		</div>
	</section>
</body>
</html>