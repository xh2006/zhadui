<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link type="text/css" rel="stylesheet" href="css/personal_content.css" />
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="js/Validform_v5.3.2_min.js"></script>
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
</head>
<body>
<div id="main_all">
	<div id="main_title">&nbsp;修改资料</div>
	<form action="updateInfo" id="updateInfoForm" method="post">
	<s:hidden name="userInfo.userInfoId"></s:hidden>
	<s:hidden name="userInfoDetail.userInfoDetailId"></s:hidden>
	<s:hidden name="userInfo.userInfoEmail"></s:hidden>
    <div id="main_center">
    	<div class="position_div">
        	<ul class="update_ul">
            	<li class="update_title">昵称：</li>
                <li style="width:250px;"><s:textfield datatype="*" nullmag="昵称不能为空" name="userInfo.userInfoName" cssStyle="width:240px; height:26px;"></s:textfield></li>
                <li class="error" ></li>
                <li class="update_title">性别：</li>
                <li style="width:100px; text-align:center;"><s:radio name="userInfo.userInfoSex" list="#{0:'女',1:'男'}"></s:radio></li>
            </ul>
        </div>
        <div class="position_div">
        	<ul class="update_ul">
            	<li class="update_title">出生日期：</li>
                <li style="width:250px;"><s:textfield cssClass="Wdate" name="userInfoDetail.userInfoDetailBornTime" cssStyle="width:240px; height:26px;" onFocus="WdatePicker({maxDate:'%y-%M-%d'})"></s:textfield></li>
                <li class="error" ></li>
                <li class="update_title">学历：</li>
                <li style="width:100px;">
                	<s:select cssStyle="width:90px; height:26px; text-align:center; font-size:16px; font-family:'微软雅黑';" name="userInfoDetail.userInfoDetailEducationStatus" list="#{'本科':'本科','研究':'研究','博士':'博士'}"></s:select>
                </li>
            </ul>
        </div>
        <div class="position_div">
        	<ul class="update_ul">
            	<li class="update_title">职业：</li>
                <li style="width:250px;"><s:textfield name="userInfoDetail.userInfoDetailVocation" cssStyle="width:240px; height:26px;"></s:textfield></li>
                <li class="error" ></li>
                <li class="update_title">婚姻状况：</li>
                <li style="width:160px; text-align:center;"><s:radio name="userInfoDetail.userInfoDetailMarriageStatus" list="#{0:'未婚',1:'已婚'}"></s:radio></li>
            </ul>
        </div>
        
        <%-- <div class="position_div">
        	<ul class="update_ul">
            	<li class="update_title">常用邮箱：</li>
                <li style="width:350px;"><s:textfield datatype="e" errormsg="请输入正确的邮箱" name="userInfo.userInfoEmail" cssStyle="height:26px; width:340px;"></s:textfield></li>
                <li class="error"></li>
            </ul>
        </div> --%>
        <div class="position_div">
        	<ul class="update_ul">
            	<li class="update_title">家乡：</li>
                <li style="width:460px;"><s:textfield name="userInfoDetail.userInfoDetailHometown" cssStyle="height:26px; width:450px;"></s:textfield></li>
                <li class="error"></li>
            </ul>
        </div>
        <div class="position_div">
        	<ul class="update_ul">
            	<li class="update_title">签名：</li>
                <li style="width:460px;"><s:textfield name="userInfoDetail.userInfoDetailSignal" cssStyle="height:26px; width:450px;"></s:textfield></li>
                <li class="error"></li>
            </ul>
        </div>
        <div class="position_div">
        	<ul class="update_ul">
            	<li class="update_title">爱好：</li>
                <li style="width:460px; height:80px;"><s:textarea name="userInfoDetail.userInfoDetailHobby" cssStyle="width:450px; height:70px;"></s:textarea></li>
                <li class="error"></li>
            </ul>
        </div>
        <div class="position_div">
        	<ul class="update_ul">
            	<li class="update_title">自我介绍：</li>
                <li style="width:460px; height:100px;"><s:textarea name="userInfoDetail.userInfoDetailSelfIntroduction" cssStyle="width:450px; height:90px;"></s:textarea></li>
                <li class="error"></li>
            </ul>
        </div>
        <div class="position_div">
        	<ul class="update_ul">
            	<li style="width:700px; height:40px; line-height:40px; text-align:right;"><a id="updateInfoBtn" style="padding:5px 25px; text-decoration:none; border-radius:5px; color:#FFF; background-color:#66CC33; " href="javascript:void(0);">修改</a></li>
            </ul>
        </div>
    </div>
    </form>
</div>
<script type="text/javascript">
$(function(){
	$("#updateInfoForm").Validform({
		btnSubmit:"#updateInfoBtn",
		tiptype:2,
		tipSweep:true
	});
});
</script>
</body>
</html>

