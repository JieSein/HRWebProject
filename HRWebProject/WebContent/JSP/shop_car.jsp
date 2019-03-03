<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/HRWebProject/CSS/shop_car.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/HRWebProject/JS/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/HRWebProject/JS/shopcar.js"></script>
<title>Insert title here</title>
</head>
<jsp:include page="head.jsp"></jsp:include>
<body>
	<div class="shop_car">
		<div class="div1">当前位置&nbsp;>>&nbsp;我的购物车</div>
		<div>
			<table>
				<tr class="trbgcolor">
					<td><input type="checkbox" name="whole" id="whole" value="1">全选</td>
					<td class="center">商品名称</td>
					<td>积分</td>
					<td>疯狂价</td>
					<td>小计</td>
					<td>数量</td>
					<td>操作</td>
				</tr>
				
				<c:forEach var="shopcar" items="${shopcarList}" varStatus="status">
					<tr>
						<td><span>${shopcar.articleId}</span><input type="checkbox" name="check" id="${shopcar.articleId}" value="${shopcar.articleId}" onClick="checkClick(${shopcar.articleId},${shopcar.buyNum})"></td>
						<td>
							<div class="float"><img alt="无法显示图片" src="/HRWebProject/image/${shopcar.image}"></div>
							<div class="float">${shopcar.title}</div>
						</td>
						<td>0</td>
						<td class="color">￥${shopcar.price}（${shopcar.discount}折）</td>
						<td>
							￥<f:formatNumber type="number" value="${shopcar.price*shopcar.discount*shopcar.buyNum}" pattern="0.00" maxFractionDigits="2"></f:formatNumber>
						</td>
						<td>
							<input type="button" value="-" onclick="reduce(${status.count},${shopcar.articleId})">
							<input type="text" size="3" name="${status.count}" id="${status.count}" value="${shopcar.buyNum}">
							<input type="button" value="+" onclick="increase(${status.count},${shopcar.articleId})">
						</td>
						<td>
							<a href="#">移入收藏</a><br>
							<a href="/HRWebProject/ShopCarDeleteServlet">删除</a>
						</td>
					</tr>	
				</c:forEach>
				
			</table>
			
			
			
			<div class="jiesuan">
				<p class="p">数量总计：<span class="color font">4</span>（件）</p>
				<p class="p">金额总计：<span class="color font">￥307.10</span>（折后价）</p>
				<p class="p" style="margin-bottom:10px">
					<a href="/HRWebProject/index.do"><input type="button" value="<&nbsp;&nbsp;继续购物"></a>
					<input type="button" value="结&nbsp;&nbsp;算&nbsp;&nbsp;&nbsp;&nbsp;>" class="settlements">
				</p>
			</div>
				

		</div>
	</div>
</body>
</html>