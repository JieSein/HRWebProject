<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/HRWebProject/CSS/goods.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/HRWebProject/JS/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/HRWebProject/JS/goods.js"></script>

<title>Insert title here</title>
</head>
<body>
	<div class="goods01">
		<div class="div1"><span>${art.title}</span></div>
			<figure>
				<img alt="无法显示图片" src="/HRWebProject/image/${art.image}">
				<figcaption>
					<p>评分：<span class="color">★★★★★</span>
						<a href="">（已有51人评价）</a>
					</p>
					<p class="center"><a href="">该商品支持全国购买</a></p>
				</figcaption>
			</figure>
		
		<div class="div2">
		<form action="/HRWebProject/ShopCarServlet" method="get">
				<table>
					<tr>
						<td>供应商：</td>
						<td>${art.supplier}</td>
					</tr>
					<tr>
						<td>出产地：</td>
						<td>${art.locality}</td>
					</tr>
					<tr>
						<td>定价：</td>
						<td>￥${art.price}</td>
					</tr>
					<tr class="fcolor">
						<td>疯狂价：</td>
						<td>￥<f:formatNumber type="number" value="${art.price*art.discount}" pattern="0.00" maxFractionDigits="2"></f:formatNumber>
						（${art.discount}折）
						</td>
					</tr>
					<tr>
						<td>库存：</td>
						<td>${art.storage}&nbsp;&nbsp;&nbsp;&nbsp;下单后立即发货</td>
					</tr>
					<tr class="fcolor">
						<td>促销信息：</td>
						<td>该商品参加满减活动，购买活动商品每满300元，可减100元现金</td>
					</tr>
					<tr class="margin">
						<td>我要买：</td>
						<td>
							<input type="button" size="1" value="-" name="reduce" id="reduce">
							<input type="text" size="2" value="1" class="a1" name="goodsnum" id="goodsnum">
							<input type="button" size="1" value="+" name="increase" id="increase">
						</td>
					</tr>
					<tr class="style">
						<td colspan="2">
							<input type="image" src="/HRWebProject/image/add_car.png" class="img">
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>	

</body>
</html>