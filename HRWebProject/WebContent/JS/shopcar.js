function increase(num,id){
	var addr = $("#"+num+"");
	var number = addr.val();
	var artid = id.toString();
	if(number<100){
		number = number*1+1*1;
		$(addr).val(number);
		
	}
	
	$(function(){
		var json = {artId:artid, buyNum:addr.val()};
		$.post("/HRWebProject/ShopCarUpdateAjaxServlet?time="+new Date().getTime(), json, function(data,status){
		});
	});
	
}

function reduce(num,id){
	var addr = $("#"+num+"");
	var number = addr.val();
	var artid = id.toString();
	if(number>1){
		number = number*1-1*1;
		$(addr).val(number);
	}	
	
	$(function(){
		var json = {artId:artid, buyNum:addr.val()};
		$.post("/HRWebProject/ShopCarUpdateAjaxServlet?time="+new Date().getTime(), json, function(data,status){
		});
	});
	
}

$(function(){
	
	$('input[name="whole"]').click(function(){
		if($(this).is(':checked')){
			$('input[name="check"]').each(function(){
				$(this).prop("checked", true);
			});
		} else {
			$('input[name="check"]').each(function(){
				$(this).prop("checked", false);
			});
		}
	});
	
});

function checkClick(id,num){
	var arId = id.toString();
	var flag = $("#"+id+"").is(':checked');
	alert(flag);
	
	$(function(){
		var json = {flag:flag, arId:arId, buyNumb:num};
		$.post("/HRWebProject/ShopCarCheckboxServlet?time="+new Date().getTime(), json, function(data, status){
			alert(data.split(","));
			
		});
			
		
	});
	
	
}



