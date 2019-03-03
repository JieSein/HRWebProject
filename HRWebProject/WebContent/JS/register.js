var name_flag = "";
var pwd_flag = "";
var pwds_flag = "";
var realName_flag = "";
var email_flag = "";
var address_flag = "";
var telephone_flag = "";


/**
 * 验证码功能
 * @returns
 */
function show(){
	$("#imgveli").attr("src","/HRWebProject/CheckCoed?time="+new Date().getTime());
}

/**
 * 验证输入信息是否符合格式
 * @returns
 */
$(function(){
	/**
	 * 验证用户名是否符合格式
	 */
	$("#uname").blur(function(){
		var reg_email=/^([0-9A-Za-z\-_\.]+)@([0-9a-z]+\.[a-z]{2,3}(\.[a-z]{2})?)$/;
		var email=$("#uname").val();
		var result="";
		var flag=false;
		if(!reg_email.test(email)){
			result="你输入的邮箱格式不合法！";
			name_flag="NotNull";
		}else{
			result="√";
			name_flag = "";
			flag=true;
		}
		if(flag){
			$("#s_uname").text(result).css('color',"#43FC0D");
		}else{
			$("#s_uname").text(result).css('color',"#FF0000").css('font-size',"13px");
			return ;
		}
		
		var json = {uname:$("#uname").val()};
		$.get("/HRWebProject/RegAjaxServlet?time"+new Date().getTime(),json, function(data,status){
			if(data == "true"){
				$("#s_uname").text("此账号已存在！").css("color","#FF0000").css('font-size',"13px");
			}else{
				$("#s_uname").text("√").css("color","#43FC0D");
			}
			
		});
		
	});
	
	
	/**
	 * 验证密码是否符合格式
	 */
	$("#pwd").blur(function(){
		var reg_pwd=/^(\w){6,20}$/;
		var pwd=$("#pwd").val();
		var result="";
		var flag=false;
		if(!reg_pwd.test(pwd)){
			result="请输入6-20位的数字、字母或下划线！";
			pwd_flag = "NotNull";
		}else{
			result="√";
			pwd_flag = "";
			flag=true;
		}
		if(flag){
			$("#s_pwd").text(result).css('color',"#43FC0D");
		}else{
			$("#s_pwd").text(result).css('color',"#FF0000").css('font-size',"13px");
		}
		
	});
	
	
	/**
	 * 验证密码是否与第一次输入的密码一致
	 */
	$("#pwds").blur(function(){
		var pwd = $("#pwd").val();
		var pwds = $("#pwds").val();
		var result="";
		var flag=false;
		
		if(pwd.length!=0){
			if(pwd!=pwds){
				result="两次输入的密码不一致！";
				pwds_flag = "NotNull";
			}else{
				result="√";
				pwds_flag = "";
				flag=true;
			}
			
			if(flag){
				$("#s_pwds").text(result).css('color',"#43FC0D");
			}else{
				$("#s_pwds").text(result).css('color',"#FF0000").css('font-size',"13px");
			}
		}
		
	});
	
	
	/**
	 * 验证电话号码格式是否符合
	 */
	$("#telephone").blur(function(){
		var reg_telephone=/^[1][3,4,5,7,8][0-9]{9}$/;
		var telephone=$("#telephone").val();
		
		var result="";
		var flag=false;
		if(!reg_telephone.test(telephone)){
			result="格式错误，请输入11位数字！";
			telephone_flag = "NotNull";
		}else{
			result="√";
			telephone_flag = "";
			flag=true;
		}
		if(flag){
			$("#s_telephone").text(result).css('color',"#43FC0D");
		}else{
			$("#s_telephone").text(result).css('color',"#FF0000").css('font-size',"13px");
		}
		
	});
	
});

/**
 * 判断注册的信息是否为空
 * @returns
 */
function check(){
	if(name_flag == "NotNull"){
		alert("用户名信息不正确！");
		return false;
	}
	
	if(pwd_flag == "NotNull"){
		alert("密码信息不正确！");
		return false;
	}
	
	if(pwds_flag == "NotNull"){
		alert("两次密码不一致！");
		return false;
	}
	
	if(telephone_flag == "NotNull"){
		alert("电话信息不正确！");
		return false;
	}
	
	return true;
	
}

























