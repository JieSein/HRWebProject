<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/HRWebProject/CSS/index_section.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/HRWebProject/JS/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/HRWebProject/JS/index_section.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div id="index_section">	
		<div class="div1">
		<form action="">
			物品类型：
			<select name="type">
				<option value="1">护肤</option>
				<option value="2">-----洁面</option>
				<option value="3">-----化妆水</option>
				<option value="4">-----喷雾</option>
				<option value="5">-----美容液</option>
				<option value="6">-----眼霜</option>
				<option value="7">-----面膜</option>
				<option value="8">-----精华</option>
				<option value="9">-----精油</option>
			</select>
			<input type="search" size=50 name="keyWord" id="keyWord">
			<input type="submit" value="搜索" >
		</form>
		</div>
		
		<div class="div2">
			<div class="title">${typeName}</div>
		</div>
		
		<div>
			
			<table class="table">
				<tr>
				<c:forEach var="article" items="${artList}" varStatus="status">
					<td>
						<a href="/HRWebProject/GoodInfoServlet?articleId=${article.id}">
							<img src="/HRWebProject/image/${article.image}"><br>
						</a>
							<p class="center">
								<span class="font">￥${article.price}</span>&nbsp;&nbsp;&nbsp;&nbsp;
								<span class="price">
									￥<f:formatNumber type="number" value="${article.price*article.discount}" pattern="0.00" maxFractionDigits="2"></f:formatNumber>
								</span>
							</p>
						<p><a href="/HRWebProject/GoodInfoServlet?articleId=${article.id}"  id="box" onMouseOver="javascript:shows(this,'mydiv1');" onMouseOut="hide(this,'mydiv1')">
						${article.title}
						</a></p>
					</td>
					
					<div id="mydiv1" style="position:absolute; display:none; border:1px solid silver; background:silver;">
						${article.title}
					</div>
					
					<c:if test="${status.count%4==0}">
						<tr>
					
					</c:if>		
									
				</c:forEach>
				</tr>

			</table>
		
		
		</div>
		
	</div>
</body>
</html>