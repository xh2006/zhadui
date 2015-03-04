<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link type="text/css" rel="stylesheet" href="css/jquery.Jcrop.min.css" />
<link type="text/css" rel="stylesheet" href="css/personal_content.css" />
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="js/uploadPreview.js"></script>
<script type="text/javascript" src="js/jquery.Jcrop.min.js"></script>
<script type="text/javascript">
$(function(){
	var imageW,imageH;
	var jcrop_api=0,
	boundx,
	boundy,
	
	// Grab some information about the preview pane
	$preview = $('#upImage_right'),
	$pcnt = $('#upImage_right #headImageShowDiv'),
	$pimg = $('#upImage_right #headImageShowDiv img'),
	
	xsize = $pcnt.width(),
	ysize = $pcnt.height();
	$("#yulantupian_file").uploadPreview({ 
		Img: "yulanImage",
		divHeight:380,
		divWidth:590,
		Callback:function (width,height){
			imageW=width;
			imageH=height;
			$("input[name='imageWidth']").val(width);
			$("input[name='imageHeight']").val(height);
			$("#headImageShow").attr("src",$("#yulanImage").attr("src"));
			$("#headImageShow").height(imageH);
			$("#headImageShow").width(imageW);
			
			if(jcrop_api != 0){
					jcrop_api.destroy();
			}
			$('#yulanImage').Jcrop({
				onChange: updatePreview,
				onSelect: updatePreview,
				aspectRatio: xsize / ysize
			},function(){
				var bounds = this.getBounds();
				boundx = bounds[0];
				boundy = bounds[1];
				jcrop_api = this;
			});
			
			function updatePreview(c){
				if (parseInt(c.w) > 0) {
					var rx = xsize / c.w;
					var ry = ysize / c.h;
					$pimg.css({
						width: Math.round(rx * boundx) + 'px',
						height: Math.round(ry * boundy) + 'px',
						marginLeft: '-' + Math.round(rx * c.x) + 'px',
						marginTop: '-' + Math.round(ry * c.y) + 'px'
					});
					$("input[name='imageX']").val(c.x);
					$("input[name='imageY']").val(c.y);
					$("input[name='cutW']").val(c.w);
					$("input[name='cutH']").val(c.h);
					
				}
			};
		}
	});
	$("#uploadHeadImageBtn").click(function(e) {
        if($("#yulantupian_file").val()==''){
        	$("#uploadEmptyDiv").append("<br/><span style='color:red;'>请选择上传图片</span>");
        }else if($("input[name='imageX']").val()==''){
        	$("#uploadEmptyDiv").append("<br/><span style='color:red;'>请裁剪该图片</span>");
        }else{
        	$("#uploadEmptyDiv").children().remove();
        	$("#updateHeadForm").submit();
        }
    });
});
</script>
</head>
<body>
<div id="main_all">
	<div id="main_title">&nbsp;更换头像</div>
    <div id="main_center">
    	<div style="height:10px; width:600px;"></div>
        <div id="upImage_all">
        	<div id="upImage_left">
            	<div id="upImage_yulan">
                	<img id="yulanImage" />
                </div>
            </div>
            <div style="width:15px; height:390px; float:left; border-right:1px solid #999;"></div>
            <div id="upImage_right">
            	<div id="headImageShowDiv">
                	<img src="images/header.jpg" id="headImageShow" style="width:150px; height:150px;" />
                </div>
                <div id="uploadEmptyDiv">
                	头像预览图
                </div>
                <div id="uploadBtnDiv">
                	<a id="uploadHeadImageBtn" href="javascript:void(0)">上传</a>
                </div>
            </div>
        </div>
        <div style="height:10px; width:600px;"></div>
        <form action="updateHeadImage" method="post" enctype="multipart/form-data" id="updateHeadForm">
        <input type="hidden" name="imageWidth" />
        <input type="hidden" name="imageHeight" />
        <input type="hidden" name="imageX" />
        <input type="hidden" name="imageY" />
        <input type="hidden" name="cutW" />
        <input type="hidden" name="cutH" />
        <div id="xiabian">
        	<input name="headImage" type="file" id="yulantupian_file" />
        </div>
        </form>
	</div>
</div>
<s:fielderror></s:fielderror>
</body>
</html>
