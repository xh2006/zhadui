<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>扎堆吧</title>
<link href="css/base.css" type="text/css" rel="stylesheet" />
<link href="css/head.css" type="text/css" rel="stylesheet" />
<style type="text/css">
	#footer{
		display:block;
		width:1000px;height:60px;margin:0px auto;text-align:center;
		background-color:#EFEFEF;
	}
	.inputStyle{
		width:100px;
		height:22px;
		margin:3px;
	}
	.comment{
		background-color:#EFEFEF;
		display:block;
		padding:2px;
		margin:5px;
	}
	.comment_header{
		width:50px;height:50px;float:left;border:1px solid #EFEFEF;margin:1px;
	}
	.block{
		margin-top:6px;
	}
	.tips{
		margin:5px;
		padding:3px;
		font-size:14px;
		background-color:#90EE90;
	}
	#activityDetail div{
		margin:8px;
	}
</style>
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>

<script type="text/javascript">
	$(document).ready(function(){
		$("#participate").click(function(){
			alert("");
		});
		
		// 评论提交
		$("#toComment").click(function(){
			var duierId = $("#duierId").val();
			var content = $("#commentText").val();
			$.post("comment",
			{	
				duierId:duierId,
				content:content,
				c_type:"1"
			},
			function(data,status){
				if(status == true){
					
				}
			});
		});
	});
</script>

</head>
<body>
<!--网站头部begin-->
<div id="head">
	<div id="head_main">
    	<div id="head_main_left_logo"></div>
        <div id="head_main_left_world"></div>
        <div id="head_main_left_empty"></div>
        <div id="head_main_center_search_input">
        	<input id="search_input" type="text" />
        </div>
        <div id="head_main_center_search_btn">
        	<input id="search_btn" type="button" />
        </div>
        <div id="head_main_right_phone"></div>
        <div id="head_main_right_login">
        	<div id="head_main_right_login_a">
				<s:if test="#session.zhadui_loginStatus!=null">
					<a href="personal/toPersonalCenter">个人主页</a>&nbsp;|&nbsp;<a href="logout_web">退出</a>
				</s:if>
				<s:else>
					<a href="login">登录</a>&nbsp;|&nbsp;<a href="register">注册</a>
				</s:else>
			</div>
        </div>
    </div>
</div>
<!--网站头部end-->
<!--导航栏begin-->
<div id="nav">
	<div id="nav_main">
    	<ul>
			<li><a class="nav_link" href="category?id=1">扎堆</a></li>
			<li><a class="nav_link" href="category?id=2">运动</a></li>
			<li><a class="nav_link" href="category?id=3">任性</a></li>
			<li><a class="nav_link" href="category?id=4">去野</a></li>
			<li><a class="nav_link" href="category?id=5">小聚</a></li>
			<li><a class="nav_link" href="category?id=6">小钱</a></li>
			<li><a class="nav_link" href="category?id=7">二手</a></li>
			<li><a class="nav_link" href="category?id=8">教育</a></li>
			<li><a class="nav_link" href="category?id=9">爱心</a></li>
			<li><a class="nav_link" href="category?id=10">联谊</a></li>
        </ul>
    </div>
</div>
<div id="" style="width:1000px;height:1300px;margin:0px auto;">
	<div style="float:left;width:720px;background-color:#FFF;margin-top:10px;">
		<div id="activityDetail" style="padding:5px;">
			<input id="duierId" type="hidden" value="<s:property value='duierInfo.duierInfoId' />"></input>
			<div>
				<b>类别：<s:property value="duierInfo.duierInfoClass.getDuierClassName()" /></b>
			</div>
			<div>
				<!-- 根据有无图片及图片长度设置分隔条的长度 
				<img src="images/football.jpg" style="float:left;border:2px solid #EFEFEF;margin:5px;"/>
				-->
				<div style="margin:5px;">
					<p style="text-align:center;font-size:24px;font-weight:bold;"><s:property value="duierInfo.duierInfoName" /></p>
					<img src="images/dd/splitLine_t.jpg" style="margin-left:22px;margin-top:8px;"/>
					<p style="text-align:right;margin-top:8px;">关注（<s:property value="duierChatInfo_list.size()" />）&nbsp;&nbsp;&nbsp;&nbsp;扎堆（9）</p>
					<p style="text-align:right;margin-top:8px;">发表于：<s:property value="duierInfo.duierInfoCreateTime" /></p>
				</div>
				<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:property value="duierInfo.duierInfoActivityIntroduction" /></p>
				<div style="float:right;margin-right:24px;margin-top:10px;">
					<a id="participate" href="javascript:void(0);"><img src="images/dd/btn_participate.png"></a>
					<a id="undertake" href="javascript:void(0);"><img src="images/dd/btn_undertake.png"></a>
				</div>
			</div>
			<img src="images/dd/splitLine_a.jpg" width="700px">
			<div id="comment_part">	
				<span style="margin-left:20px;font-weight:bold;">留言</span><span style="float:right;margin-right:20px;">0/240</span>
				<div style="width:680px;height:160px;">
					<form action="comment" method="post">
						<textarea id="commentText" style="width:670px;height:100px;resize:none;" placeholder="字数限制在240个以内。" maxlength="240"></textarea><br />
						<a id="toComment" href="javascript:void(0);" style="padding-top:5px;padding-right:20px;padding-bottom:10px;float:right;"><img src="images/dd/btn_comment.png"></a>
						<input id="toWhom" type="hidden" name="toWhom" value=""></input>
						<input id="comment_submit" type="submit" style="display:none;"></input>
					</form>
				</div>
				<img src="images/dd/comment.png" /> 留言(<s:property value="duierChatInfo_list.size()" />)
				<div id="comments">
					<s:iterator value="duierChatInfo_list" var="block">
						<div class="comment">
							<a href="javascript:void(0);"><img class="comment_header" src='<s:property value="#block.getDuierChatInfoTalker().getUserInfoHeadImage()" />'></a>
							<b><s:property value="#block.getDuierChatInfoTalker().getUserInfoName()" /></b>
							<p><s:property value="#block.duierChatInfoPublishContent" /></p>
							<p style="text-align:right;padding:2px;">（<s:date name="#block.duierChatInfoPublishTime" format="yyyy-MM-dd HH:mm" />）<a class="commentTo" href="javascript:void(0);"><img src="images/dd/commentTo.png"/></a></p>
						</div>
					</s:iterator>
				</div>
				<div style="width:680px;height:80px;">
					<!--<p class="tips">(Tips: 只要点击“扎堆”或“承接”按钮参与到这个堆儿中，就可以查看此堆儿的讨论留言，并可以参与讨论。)</p>-->
					<div style="float:right;margin-right:20px;">
						<a href="javascript:void(0);"><img src="images/dd/forward.png"></a>
						<a href="javascript:void(0);"><img src="images/dd/backward.png"></a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div style="float:right;width:260px;">
		<div id="creatorInfo" style="background-color:#FFF;margin-top:10px;">
			<div style="padding:5px;">
				<img src="image_server/headerImg/h2.jpg" style="width:100px;height:100px;border:3px solid #EFEFEF;float:left;" />
				&nbsp;&nbsp;<a href="userInfo?id=3" style="color:#94C945;"><s:property value="userShowInfo.userInfoName"/></a>
				<div style="margin-top:8px;">
					<s:if test="userShowInfo.userInfoSex == 1">
						<p>&nbsp;&nbsp;性别：男 </p>
					</s:if>
					<s:else>
						<p>&nbsp;&nbsp;性别：女 </p>
					</s:else>
					<p>&nbsp;&nbsp;状态：<s:property value="userShowInfo.userInfoDetailVocation" /></p>
					<p>&nbsp;&nbsp;签名：<s:property value="userShowInfo.userInfoDetailSignal" /></p>
				</div>
			</div>
		</div>
		<div style="background-color:#FFF;margin-top:10px;">
			<div style="padding:10px;">最新活动  
				<a href="latest" style="float:right;">更多...</a>
				<img src="images/dd/splitLine_a.jpg" />
				<div class="block">
					<a href="javascript:void(0);">长跑</a>
					<div>发表时间：2015-01-08 11:30</div>
					<div>留言（9）&nbsp;&nbsp;&nbsp;&nbsp;扎堆（7）</div>
					<img src="images/dd/splitLine_b.png" />
				</div>				
			</div>
		</div>
	</div>
</div>
<!--  
<div id="footer">
	<a href="javascript:void(0);">页尾</a>
	<a href="javascript:void(0);">页尾</a>
	<a href="javascript:void(0);">页尾</a>
	<a href="javascript:void(0);">页尾</a>
	<a href="javascript:void(0);">页尾</a>
</div>
-->
</body>
</html>


