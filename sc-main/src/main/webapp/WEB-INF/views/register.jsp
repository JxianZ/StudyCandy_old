<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>注册</title>
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

<!-- reg-min start -->

<div class="container-fluid login-wrapper">
    <div class="container reg-body">
        <div class="row hidden-xs">
            <div class="col-md-4 col-sm-4 reg-col">
                <div id="reg-nav1" class="reg-nav  reg-nav-on">1.基本信息</div>
            </div>
            <div class="col-md-4 col-sm-4 reg-col">
                <div id="reg-nav2"class="reg-nav">2.信息完善</div>
            </div>
            <div class="col-md-4 col-sm-4 reg-col">
                <div id="reg-nav3"class="reg-nav">3.注册成功</div>
            </div>
        </div>
        <div class="row reg-form">
            <div class="col-md-6 col-sm-6 col-xs-10 col-xs-offset-1">

                <!--  reg-part1 start -->

                <div class="reg-part1 on">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <label for="inputusername" class="col-sm-2 control-label">用户名</label>
                            <div class="col-md-8 col-sm-10">
                                <input type="text" class="form-control" id="inputusername">
                                <span id="usernamespan" class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputpassword" class="col-sm-2 control-label">密码</label>
                            <div class="col-md-8 col-sm-10">
                                <input type="password" class="form-control" id="inputpassword">
                                <span id="passwordspan" class="help-block">字母，数字或者英文符号，最短8位，区分大小写</span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="confirmpassword" class="col-sm-2 control-label">确认密码</label>
                            <div class="col-md-8 col-sm-10">
                                <input type="password" class="form-control" id="confirmpassword">
                                <span id="cfmpasswordspan" class="help-block">请再次输入密码</span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputemail" class="col-sm-2 control-label">邮箱</label>
                            <div class="col-md-8 col-sm-10">
                                <input type="email" class="form-control" id="inputemail">
                                <span id="emailspan" class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputemail" class="col-sm-2 control-label">验证码</label>
                            <div class="col-md-3 col-sm-4">
                                <input type="text" class="form-control" id="codeinput">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label"></label>
                            <div class="col-md-3 col-sm-4">
                                <div class="code-img"><img src="img/codetest.png"></div>
                            </div>
                        </div>
                        <div class="form-group reg-agree">
                            <div class="col-sm-offset-2 col-sm-10">
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox" id="check-agree"> 我同意并遵守<a href="#">《xxx协议》</a>
                                    </label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <div class="reg-part1-btnarea">
                                    <button type="button" class="btn btn-info disabled" id="part1next">下一步</button>
                                    <button type="button" class="btn btn-info disabled" id="part1now">直接完成</button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>

                <!--  reg-part1 end -->

                <!--  reg-part2 start -->

                <div class="reg-part2 off">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <label for="inputusername" class="col-sm-2 control-label">真实姓名</label>
                            <div class="col-md-8 col-sm-10">
                                <input type="text" class="form-control" id="inputrealname">
                                <span id="realnamespan" class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group reg-sex">
                            <label class="col-sm-2 control-label">性别</label>
                            <div class="col-md-8 col-sm-10">
                                <label class="radio-inline">
                                    <input type="radio" name="usersex" id="inlineRadio1" value="male"> 男
                                </label>
                                <label class="radio-inline">
                                    <input type="radio" name="usersex" id="inlineRadio2" value="female"> 女
                                </label>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputpassword" class="col-sm-2 control-label">身份证号</label>
                            <div class="col-md-8 col-sm-10">
                                <input type="text" class="form-control" id="usercodeinput">
                                <span id="usercodespan" class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="confirmpassword" class="col-sm-2 control-label">手机号</label>
                            <div class="col-md-8 col-sm-10">
                                <input type="email" class="form-control" id="phoneinput">
                                <span id="phonespan" class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">验证码</label>
                            <div class="col-md-3 col-sm-4">
                                <input type="text" class="form-control" id="phonecodeinput">
                            </div>
                            <div class="col-md-2 col-sm-3">
                                <button type="button" id="myButton" class="btn btn-primary" autocomplete="off">
                                    发送验证码
                                </button>
                            </div>
                        </div>
                        <div class="form-group reg-select">
                            <label class="col-sm-2 control-label">学校</label>
                            <div class="col-md-4 col-sm-5">
                                <select class="form-control">
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                    <option>5</option>
                                </select>
                            </div>
                            <div class="col-md-4 col-sm-5">
                                <select class="form-control">
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                    <option>5</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group reg-select">
                            <label class="col-sm-2 control-label"></label>
                            <div class="col-md-8 col-sm-10">
                                <select class="form-control">
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                    <option>5</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputpassword" class="col-sm-2 control-label">专业</label>
                            <div class="col-md-8 col-sm-10">
                                <input type="text" class="form-control" id="">
                                <span id="" class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputpassword" class="col-sm-2 control-label">学号</label>
                            <div class="col-md-8 col-sm-10">
                                <input type="text" class="form-control" id="">
                                <span id="" class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <div class="reg-part1-btnarea">
                                    <button type="button" class="btn btn-info" id="part2re">上一步</button>
                                    <button type="button" class="btn btn-info" id="part2now">完成注册</button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>

                <!--  reg-part2 end -->
                <div class="reg-part3 off">
                    <div class="col-md-8 col-md-offset-2 col-sm-10 col-sm-offset-1">
                        <div class="reg-success">
                            <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>&nbsp;&nbsp;恭喜xxx用户，您已注册成功
                        </div>
                    </div>
                    <div class="col-md-8 col-md-offset-2 col-sm-10 col-sm-offset-1">
                        <div class="reg-login">
                            <button type="button" class="btn btn-info" id="">直接登录</button>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-5 col-sm-5 hidden-xs">
                广告
            </div>
        </div>
    </div>
</div>

<!-- reg-min end -->

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
<script src="${__static__}/js/user.min.js"></script>
</body>
</html>