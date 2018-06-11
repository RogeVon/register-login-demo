<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
	
	  .input-group{
	  margin-top:20px;
	}
	 .form-control{
		height:50px;
	} 
	body{
	    
		background-repeat:no-repeat;
	    background-size:cover;
	}
	.col-lg-6{
		width:60%;
		margin-left:20%;
		margin-top:15px;
	}
	.form-group{
		margin-top:40px;
		margin-left:33%;
	}
	.hint{
		color:red;
		display:none; 
	}
</style>
<title>欢迎注册</title>
</head>
<body style="background-image: url('${pageContext.request.contextPath}/images/regb.jpg');">
	
	<div style="padding: 100px 100px ;">
	    <form class="bs-example bs-example-form" role="form">
	        <div class="row">
	            <div class="col-lg-6">
	                <div class="input-group">
	                    <span class="input-group-addon">
	                        <img height="30px;" width="30px;" src="${pageContext.request.contextPath}/images/user.png"></span>
	                    <input  required="required" type="text" class="form-control" id="uname" name="uname"  placeholder="请输入用户名">
	                </div><!-- /input-group -->
	                <span id="uname_span" class="hint">用户名由3-5个字符组成</span>
	            </div><!-- /.col-lg-6 -->
	            <div class="col-lg-6">
	                <div class="input-group" >
	                    <span class="input-group-addon">
	                        <img height="30px;" width="30px;"src="${pageContext.request.contextPath}/images/phone.png"></span>
	                    <input type="text" required="required" class="form-control" id="phone" name="phone" onblur="checkphone(this)" placeholder="请输入11位手机号">
	                </div><!-- /input-group -->
	                <span id="phone_span" class="hint">手机号码不正确</span>
	            </div><!-- /.col-lg-6 -->
	            <div class="col-lg-6">
	                <div class="input-group">
	                    <span class="input-group-addon">
	                        <img height="30px;" width="30px;" src="${pageContext.request.contextPath}/images/pwd.png"></span>
	                    <input type="text" required="required" class="form-control" id="upwd" name="upwd" onblur="checkpwd(this)" placeholder="请输入6-12位密码">
	                </div><!-- /input-group -->
	                <span id="pwd_span" class="hint">密码由英文字母 数字 常用符号组成</span>
	            </div><!-- /.col-lg-6 -->
	            <div class="col-lg-6">
	                <div class="input-group">
	                    <span class="input-group-addon">
	                        <img height="30px;" width="30px;" src="${pageContext.request.contextPath}/images/pwd.png"></span>
	                    <input type="text" required="required" class="form-control" id="pwds" name="pwds" placeholder="请再次确认密码">
	                </div><!-- /input-group -->
	                <span id="pwds_span" class="hint">两次输入不一致</span>
	            </div><!-- /.col-lg-6 -->
	        </div><!-- /.row -->
	        <div class="form-group">
				    <div class="col-sm-offset-2 col-sm-10">
				      <button type="submit" class="btn-default" style="width:100px;hight:50px;color:blue;font-size:17px;">注册</button>
				    </div>
			</div>
	    </form>
	</div>
	
	
 	
<script>
	
	$(".btn-default").click(function(){
	  
  		$.ajax({
    	    	"url":"${pageContext.request.contextPath}/user/register.do",
    	    	"data":$(".bs-example bs-example-form").serialize(),
    	    	"type":"POST",
    	    	"dataType":"json",
    	    	"success":function(obj){
    	    		alert(obj.state+","+obj.message);
    	    	}
  			});
  		 
        
  })
  
</script>  
</body>
</html>