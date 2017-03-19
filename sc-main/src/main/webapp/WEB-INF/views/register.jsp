<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE HTML>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <title>Register</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- css -->
    <link rel="stylesheet" type="text/css" href="../static/css/registerstyle.css">
</head>
<body>
<div class="registerheader">
    <div class="headerimg">
        <img src="../static/img/logo-image.png">
    </div>
    <div class="brand"><a href="#"><h1 id="h">学糖</h1></a></div>
</div>
<div class="registerbody">
    <div class="rs">
        <div class="rshead">
            </br>
            <h1>注册</h1> <br>

        </div>
        <form name="register" action="/user/register" method="post">
            <div class="rsbody">
                用户名：&nbsp;&nbsp;<input name="username" type="text"></br></br>
                密&nbsp;码：&nbsp;&nbsp;<input name="password" type="password"></br></br>
                确认密码：&nbsp;<input name="passwordAgain" type="password"></br></br>
            </div>
            <div class="rsfooter">
                手机验证码：<input name="phone"></br></br></br>&nbsp;&nbsp;
                <input type="submit" value="提交">
                <input type="reset" value="重置">
                <h5><a href="">&nbsp;返回&nbsp;</a></h5>

            </div>
        </form>
    </div>
</div>
<div class="registerfooter">
    <div class="copy">Copyright &copy; 2017.yxm.Company name All rights reserved.</div>

</div>
</body>
</html>
