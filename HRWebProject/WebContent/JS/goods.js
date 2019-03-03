$(function(){
	
	$("#increase").click(function(){
		var gnumber = $("#goodsnum").val();
		if(gnumber<100){
			gnumber = gnumber*1+1*1;
			$("#goodsnum").val(gnumber);
		}
	});
	
	$("#reduce").click(function(){
		var gnumber = $("#goodsnum").val();
		if(gnumber>1){
			gnumber = gnumber*1-1*1;
			$("#goodsnum").val(gnumber);
		}
	});
});