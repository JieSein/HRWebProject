<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/HRWebProject/CSS/order.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<jsp:include page="head.jsp"></jsp:include>
<body>
	<div class="order">
		<h4>填写核对订单信息</h4>
		<div class="order2">
			<div class="ord01">
				<table class="table1">
					<tr class="tdheight">
						<td colspan="2">收货人信息</td>
					</tr>
					<tr>
						<td class="tdwidth"><span class="red">*</span>收货人姓名：</td>
						<td>
							<input type="text" size="20" name="addressee" id="addressee">
						</td>
					</tr>
					<tr>
						<td class="tdwidth"><span class="red">*</span>地址：</td>
						<td>
							<input type="text" size="40" name="address" id="address">
						</td>
					</tr>
					<tr>
						<td class="tdwidth"><span class="red">*</span>电话号码：</td>
						<td>
							<input type="text" size="20" name="ordertelephone" id="ordertelephone">
							用来接收发货通知短信及送货前确认
						</td>
					</tr>
					<tr>
						<td class="tdwidth">电子邮件：</td>
						<td>
							<input type="email" size="20" name="email" id="email">
							用来接收订单提醒邮件，便于您及时了解订单状态
						</td>
					</tr>
					<tr>
						<td class="tdwidth">邮政编码：</td>
						<td>
							<input type="text" size="10" name="postalcode" id="postalcode">
							有助于快速确定送货地址
						</td>
					</tr>
					<tr>
						<td colspan="2"><a href="#" class="orderindent">[选中常用地址]</a></td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="submit" size="20" value="保存收货人信息" class="ordersub1">
						</td>
					</tr>
				</table>
			</div>
			
			<div class="ord02">
				<table class="table2">
					<tr>
						<td colspan="2">支付及配送方式</td>
					</tr>
					<tr>
						<td class="tdwidth">支付方式：</td>
						<td>在线支付</td>
					</tr>
					<tr>
						<td class="tdwidth">配送方式：</td>
						<td>快递运输</td>
					</tr>
					<tr>
						<td class="tdwidth">运费：</td>
						<td>0.00元<span class="red">（免运费）</span></td>
					</tr>
				</table>
			</div>
			
			<div class="ord03">
				<table class="table3">
					<tr>
						<td colspan="3">商品清单</td>
						<td colspan="3"><div class="ordermargin"><a href="#">返回修改购物车</a></div></td>
					</tr>
					<tr class="tdheight1 border">
						<td>商品名称</td>
						<td>疯狂价</td>
						<td>返现</td>
						<td>小计（元）</td>
						<td>库存</td>
						<td>数量</td>
					</tr>
					<tr class="border">
						<td class="tdheight2">肌御坊竹炭？新汉方七白皂125g*2出黑头克星洗脸手工皂套组&nbsp;竹炭吸黑头+心脑七白紧致美白&nbsp;
							纳米级竹炭请姐姐银子，深入毛孔，吸出黑头&nbsp;中药古方的七白摄取，收敛毛孔，紧致美白
						</td>
						<td>￥169.00（0.7折）</td>
						<td>￥0.00</td>
						<td>￥946.40</td>
						<td>100</td>
						<td>8</td>
					</tr>
				</table>
			</div>
			
			<div class="ord04">
				<span class="spanfont">结算信息</span>
				<div class="orderdiv">
					<p class="p1">商品金额：946.40元+运费：0.00元-优惠券：0.00元-礼品卡：0.00元-返现：0.00元</p>
					<p class="p2">应付总额：<span>￥946.40</span>元</p>
				</div>
			</div>
			
			<div class="ord05">
				<a href="/HRWebProject/JSP/order_query.jsp"><input type="submit" value="提交订单" class="ordersub2"></a>
			</div>
		</div>
	</div>
</body>
</html>