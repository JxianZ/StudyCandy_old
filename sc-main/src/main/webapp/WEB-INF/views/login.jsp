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

<!-- nav-html start -->

<nav class="navbar navbar-inverse navbar-cover">
    <div class="container-fluid">
        <div class="navbar-wrapper">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand navbar-logo" href="#"><img src="${__static__}/img/logo.png"></a>
                <a class="navbar-brand navbar-logo" href="#">学糖</a>
            </div>
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-ul">
                    <li><a href="#">大教室</a></li>
                    <li><a href="#">辅导室</a></li>
                    <li><a href="#">自习室</a></li>
                    <li><a href="#">校园广场</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <form class="navbar-form navbar-left">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="搜索...">
                        </div>
                        <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
                    </form>

                    <li><a id="haha" href="#" class="navbar-head haha"  data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><img class="img-circle" src="${__static__}/img/user-test.jpg"></a>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                            <li><a href="#">消息</a></li>
                            <li><a href="#">个人中心</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">退出登录</a></li>
                        </ul>
                    </li>
                    <!--<li><a class="navbar-login" href="user/login">登录</a></li>-->
                    <!--<li><a class="navbar-login" href="user/register">注册</a></li>-->
                </ul>
            </div>
        </div>
    </div>
</nav>

<!-- nav-html end -->

<!-- ************************************************************************************************************** -->

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
                        <input type="text" class="form-control" id="password">
                    </div>
                    <div class="login-assi">
                        <label class="checkbox-inline">
                            <input type="checkbox" id="" value=""> 记住我
                        </label>
                        <a class="right" href="#">忘记密码</a>
                    </div>
                    <button type="button" class="btn btn-primary login-btn">登录</button>
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

<!-- footer-html start -->

<footer>
    <div class="copyright">
        <span>Copyright © <a href="http://expo.bootcss.com">学糖</a></span> |
        <span><a href="http://www.miibeian.gov.cn/" target="_blank">京ICP备11008151号</a></span> | 聚Xian庄 版权所有
    </div>
</footer>

<!-- footer-html end -->

<!-- ************************************************************************************************************** -->

<!--  js file  -->
<script src="${__static__}/js/jquery.js"></script>
<script src="${__static__}/js/bootstrap.min.js"></script>
<script src="${__static__}/js/carousel.js"></script>
<script src="${__static__}/js/style-assit.js"></script>

</body>
</html>