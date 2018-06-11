<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>欢迎登陆</title>
</head>
<body>
	<form id="login-form" method="post" name="form1">
				<div class="txt">
					
					<div class="text">
						<input type="text"  name="phone"
							id="phone" > <span><img
							src="${pageContext.request.contextPath}/images/yhm.png"></span>
					</div>

					<div class="text">
						<input type="passWord" id="passWord" 
							name="passWord"  maxlength="15"> <span><img
							src="${pageContext.request.contextPath}/images/mm.png"></span>
					</div>
					<input class="button_login" type="button" value="登录" id="bt-login" />
				</div>
			</form>
			
			
<script>
    $('#bt-login').click(function(){
        //读取用户的输入——表单序列化
        //var inputData = $('#login-form').serialize();
        //异步提交请求，进行验证
        $.ajax({
        	 "url":"${pageContext.request.contextPath}/user/login.do",
        	"data":"phone="+$("#phone").val()+"&passWord="+$("#passWord").val(),
        	"type":	"POST",
        "dataType":"json",
         "success":	function(obj){ 
        	 if(obj.state==1){ 
        	     location.href="${pageContext.request.contextPath}/user/showIndex.do"; 
        	 }else{ alert(obj.message); }
          }
        });
      
    });
</script>			
</body>
</html>