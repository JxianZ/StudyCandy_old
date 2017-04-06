<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>登录</title>
    <link href="${__static__}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${__static__}/css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/common.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/user.min.css">
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

<%@include file="include/header.jsp" %>

<!-- login-min start -->

<div class="container-fluid login-wrapper">
    <div class="container login-cd-body">
        <div class="row">
            <div class="col-md-4 col-md-offset-7 col-sm-5 col-sm-offset-6 col-xs-10 col-xs-offset-1 login-main">
                <div class="login-form">
                    <h3>登录</h3>
                    <div class="form-group has-feedback">
                        <span class="glyphicon glyphicon-user form-control-feedback" aria-hidden="true"></span>
                        <input type="text" class="form-control" id="username">
                    </div>
                    <div class="form-group has-feedback">
                        <span class="glyphicon glyphicon-lock form-control-feedback" aria-hidden="true"></span>
                        <input type="password" class="form-control" id="password">
                    </div>
                    <div class="login-assi">
                        <label class="checkbox-inline">
                            <input type="checkbox" id="rememberMe" value=""> 记住我
                        </label>
                        <a class="right" href="/user/reg">注册账号</a>
                        <p class="right">/</p><a class="right" href="#">忘记密码</a>
                    </div>
                    <button type="button" class="btn btn-primary login-btn" id="login-btn">登录</button>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- login-min end -->

<!-- ************************************************************************************************************** -->

<div class="container login-more">

</div>

<!-- ************************************************************************************************************** -->

<%@include file="include/footer.jsp" %>

<!--  js file  -->
<script src="${__static__}/js/jquery.js"></script>
<script src="${__static__}/js/bootstrap.min.js"></script>
<script src="${__static__}/js/carousel.js"></script>
<script src="${__static__}/js/style-assit.js"></script>
<script src="${__static__}/js/user.min.js"></script>

</body>
</html>