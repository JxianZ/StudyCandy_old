<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/11 0011
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE HTML>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <title>个人中心</title>
    <!-- css -->
    <link rel="stylesheet" type="text/css" href="../static/css/userstyle.css">
    <link href="../static/css/style.css" rel="stylesheet">
    <!-- skin color -->
    <link rel="shortcut icon" href="../static/img/favicon.ico">
</head>
<body>
<div class="navbar-wrapper">
    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container">
                <!-- Responsive navbar -->
                <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"><span
                        class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
                </a>
                <h1 class="brand"><a href="../static/index.jsp" tppabs="#">学糖</a></h1>
                <!-- navigation -->
                <nav class="pull-right nav-collapse collapse">
                    <ul id="menu-main" class="nav">
                        <li><a href="">个人中心</a></li>
                        <li><a title="team" href="#about">我的笔记</a></li>
                        <li><a title="services" href="#services">问答中心</a></li>
                        <li><a title="works" href="#works">自习教室</a></li>
                        <li><a title="blog" href="#blog">教学楼</a></li>
                        <li><a title="contact" href="#contact">私塾</a></li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
</div>
<div class="usermsg">
    <div class="userphoto"><img src="../static/img/userphoto.jpg"></div>
    <div class="usermain">
        <!-- <div class="choose">显示昵称</div> -->
        <div class="uname">这里是用户名</div>
        <div class="ulv">LV.7</div>
    </div>
    <div class="userpro">
        <div class="uschool">浙江杭州某职业技术学院</div>
        <div class="upro">学生</div>
    </div>
    <div class="usersts">这里是个性签名这里是个性签名这里是个性签名</div>
</div>
<div class="tab">
    <div class="tab_menu">
        <ul>
            <li class="on">个人资料</li>
            <li>管理发布</li>
            <li>私人笔记</li>
            <li>课程管理</li>
        </ul>
    </div>
    <div class="tab_box">
        <div>？？？？？？？</div>
        <div>？？？？？？？？？？？？？？？？？</div>
        <div>？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？</div>
        <div>？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？</div>
    </div>
</div>

<div class="footerb">
    <div class="footerlogo">
        <img src="../static/img/logo-image.png">
    </div>
    <div class="footerword">
        &copy;Copyright 2017. yxm. All rights reserved.
    </div>
</div>


<script src="../static/js/jquery.js"></script>
<script type="text/javascript">
    $(function () {
        $(".tab_menu ul li").click(function () {
            $(this).addClass("on").siblings().removeClass("on");
            var index = $(this).index();
            $(".tab_box > div").eq(index).show().siblings().hide();
        });
    })
    $(function () {
        $(".tab_menu ul li").mouseover(function () {
            $(this).css("font-weight", "bold");
            $(this).css("cursor", "pointer");
        });
        $(".tab_menu ul li").mouseout(function () {
            $(this).css("font-weight", "normal");
            $(this).css("cursor", "default");
        });
    })
</script>
</body>
</html>
