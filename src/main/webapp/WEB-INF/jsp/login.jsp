<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE HTML>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- css -->
<link rel="stylesheet" type="text/css" href="../static/css/loginstyle.css">
</head>
<body>
		<div class="loginheader">
			<div class="headerimg">
				<img src="../static/img/logo-image.png">
			</div>
			<div class="brand"><a href="#"><h1 id="h">学糖</h1></a></div>
		</div>
		<div class="loginbody">
			<div class="lg">
				<div class="lghead">
				</br>
				<h1>登录</h1> <br>

				</div>
				<form name="login" method="post" action="/user/login">
				<div class="lgbody">
				用户名：&nbsp;&nbsp;<input type="text" name="username"></br></br>
				密&nbsp;码：&nbsp;&nbsp;<input type="password" name="password"></br></br>
				
				</div>
				<div class="lgfooter">
				图片验证码：<input name="image"></br></br></br>&nbsp;&nbsp;
					<input type="submit" value="提交">
					<input type="reset" value="重置">
					<h5><a href="">&nbsp;忘记密码&nbsp;</a></h5>
				</div>
				</form>
			</div>
		</div>
		<div class="loginfooter">
			<div class="copy">Copyright &copy; 2017.yxm.Company name All rights reserved.</div>
			
		</div>
</body>
</html>
