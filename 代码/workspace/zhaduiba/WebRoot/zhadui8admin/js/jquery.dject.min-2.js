(function(b){b.fn.djectDialog=function(c){var d=b.extend({},b.fn.djectDialog.defaults,c);this.each(function(){b(this).click(function(){a(d,b(this))})})};function a(c,e){b("body").append("<div id='djectDialog'><div class='djectDialog_title'><span class='djectDialog_title_h3'>"+c.title+"</span><a class='close' href='javascript:void(0);'>关闭</a></div><div class='djectDialog_content'>"+c.content+"</div><div class='djectDialog_btn'><a href='javascript:void(0);' class='djectDialog_btn_sure'>确定</a><a href='javascript:void(0);' class='djectDialog_btn_cancle'>取消</a></div></div>").append("<div class='overlay'></div>");b("#djectDialog *").not(".djectDialog_content *").css({margin:"0px;",padding:"0px"});b(".overlay *").css({margin:"0px;",padding:"0px"});b(".overlay").css({position:"absolute",width:"100%",height:"100%",opacity:"0.1","-moz-opacity":"0.1",filter:"alpha(opacity=10)",background:"#000",top:"0",left:"0","z-index":"1"});if(c.width<220){c.width=210}b("#djectDialog").css({width:c.width+"px","font-family":"微软雅黑",border:"2px solid #CCC","border-radius":"5px","-moz-border-radius":"5px","-webkit-border-radius":"5px",position:"absolute","z-index":"2"});b(".djectDialog_title").css({width:"100%",height:"35px","line-height":"35px","background-color":"#145895"});b(".djectDialog_title_h3").css({color:"#FFF","float":"left","margin-left":"10px","font-size":"18px","font-weight":"bolder"});b(".djectDialog_title .close").css({"font-size":"16px",color:"#fff","text-decoration":"none","float":"right","margin-right":"10px",display:c.closeDisplay});var d=c.height-80;if(d<100){d=100}b(".djectDialog_content").css({width:"100%",height:d+"px","background-color":"#FFF","line-height":"100px","font-size":"18px",color:"#999","text-align":"center",margin:"0px",padding:"0px;"});b(".djectDialog_btn").css({width:"100%",height:"50px","line-height":"50px","background-color":"#FFF","text-align":"right",display:c.btnDisplay});b(".djectDialog_btn_sure").css({padding:"6px 25px","background-color":"#FB8636",border:"1px solid #CCC","border-radius":"5px","font-size":"16px",color:"#FFF","font-weight":"bolder","text-decoration":"none","margin-right":"20px"});b(".djectDialog_btn_cancle").css({padding:"6px 25px","background-color":"#CFCFCF",border:"1px solid #CCC","border-radius":"5px",color:"#666","font-weight":"bolder","text-decoration":"none","margin-right":"10px"});b(".djectDialog_btn_sure").focus();b(".close").click(function(){b("#djectDialog").remove();b(".overlay").remove();if(c.callback){c.callback("close",e)}});b(".djectDialog_btn_cancle").click(function(){b("#djectDialog").remove();b(".overlay").remove();if(c.callback){c.callback("cancle",e)}});b(".djectDialog_btn_sure").click(function(){b("#djectDialog").remove();b(".overlay").remove();if(c.callback){c.callback("confirm",e)}});f(b("#djectDialog"));b(window).resize(function(g){f(b("#djectDialog"))});function f(m){var k=b(window).height();var h=b(window).width();var j=m.height();var g=m.width();var l=(k-j)/2;var i=(h-g)/2;m.css("top",l+"px");m.css("left",i+"px")}}b.fn.djectDialog.defaults={width:"500",height:"180",title:"提示信息",content:"确定要执行该操作吗？",btnDisplay:"block",closeDisplay:"block",callback:function(c,d){}}})(jQuery);