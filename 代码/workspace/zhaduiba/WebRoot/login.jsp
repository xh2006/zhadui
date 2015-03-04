<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

	<title>扎堆吧-登录</title>
	<meta name="description" content="">
	<meta name="author" content="">
	<meta name="viewport" content="">
	
	<link href="css/base.css" type="text/css" rel="stylesheet" />
	<link href="css/style.css" type="text/css" rel="stylesheet" />
	
	<style type="text/css">
	
	body{
		background-image:url('images/reg/bg_body.jpg');
	}
	#page{
		margin:0px auto;
		width:1000px;
		position:relative;
	}
	#pageHeader{
		height:100px;
		padding:10px;
	}
	#pageBody{
		height:450px;
		padding:10px;
	}
	#pageFooter{
		
	}
	#showImg{
		width:500px;
		height:450px;
		padding-top:30px;
		padding-left:10px;
		float:left;
	}
	#loginBlock{
		background-image:url('images/reg/bg_regBlock1.jpg');
		width:400px;
		height:450px;
		float:right;
		padding-right:30px;
	}
	#loginNowBtn{
		float:right;
		margin-right:100px;
		margin-top:20px;
		border:none;
	}
	.inputStyle{
		width:200px;
		height:26px;
		margin-top:8px;
	}
	.verifyCode{
		width:100px;
		font-size:12px;
	}
	
	</style>
	<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
	<script type="text/javascript" src="js/Validform_v5.3.2.js"></script>
	<script type="text/javascript" src="js/jquery.md5.js"></script>
	
	<script type="text/javascript">
		$(document).ready(function(){
			$("#regItem").Validform({
				btnSubmit:"#loginNowBtn",
				tiptype:4,
				beforeSubmit:function(curform){
					$("#pwdInput").val($.md5($("#pwdInput").val()));
				}
			});
			if(window.top.location!=window.location){
				window.top.location=window.location;
			}	
		});
		
		// 清空错误信息
		$("#pwdInput").blur(function(){
			alert("");
			$(".errorMessage").remove();
		});
		
		function removeError(){
			$(".errorMessage").remove();
		}
	</script>
	
	<script type="text/javascript">
	    function refresh(obj) {    	
	        obj.src = "<% out.print(basePath); %>/getRandomCode?"+Math.random();
	        $("#vc").val("");
	    }
	</script>
</head>

<body>
<div id="page">
	<div id="pageHeader">
		<img src="images/logo.png"><span style="font-size:22px;color:#006600;">扎堆儿</span></img>
	</div>
	<div id="pageBody">
		<div id="showImg">
			<img src="images/reg/imgDisplay001.jpg"></img>
		</div>
		<div id="loginBlock">
			<div style="font-size:32px;color:#B3B3B3;">欢迎登录扎堆儿！</div>
			<div><img src="images/reg/splitLine.png" /></div>
			<form id="regItem" action="login_web" method="post"> 
				<div>
					&nbsp;&nbsp;&nbsp;&nbsp;手机号:
					<input id="phoneNumberInput" class="inputStyle" type="text" name="phoneNumber" datatype="/^1[3,4,5,7,8][0-9]{9}/i" errormsg="手机号码格式不正确！" nullmsg="请填写手机号！" sucmsg="手机号格式正确"></input><br />
				</div>
				<div>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;密码: 
					<input id="pwdInput" class="inputStyle" type="password" name="pwd" onfocus="javascript:removeError();"></input>&nbsp;&nbsp;<a href="forgetPwd">忘记密码？</a><br />				
				</div>
				<div class="error" style="margin-left:80px;">
					<s:fielderror fieldName="loginError"></s:fielderror>
				</div><br />
				<div>
					&nbsp;&nbsp;&nbsp;&nbsp;验证码: <input id="vc" class="inputStyle verifyCode" type="text" name="verifyCode" onfocus="javascript:removeError();"></input>
					<img style="vertical-align:middle;" title="点击切换" onclick="javascript:refresh(this);" src="getRandomCode"></img><br />
				</div>
				<div class="error" style="margin-left:80px;">
					<s:fielderror fieldName="vcError"></s:fielderror>
				</div>
				<a id="loginNowBtn" href="#"><img src="images/login/login.png" style="border:none;"></img></a>
			</form>
			<img src="images/login/split_line2.png" />
			<div style="float:right;margin-right:40px;">没有扎堆账号？<a href="register">立即注册</a></div>
		</div>
	</div>
</div>
</body>
</html>


