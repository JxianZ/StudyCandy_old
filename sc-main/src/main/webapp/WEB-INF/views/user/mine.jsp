<%--
  Created by IntelliJ IDEA.
  User: BlackZXK
  Date: 4/1/2017
  Time: 8:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>mine</title>
    <link rel="stylesheet" href="${__static__}/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/common.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/mine.css">
</head>
<body>

<%@include file="../include/header.jsp"%>

<content>
    <div class="content">
        <div class="container-fluid myuser">
            <div class="row">
                <div class="col-xs-12 col-md-3">
                    <img src="${__static__}/img/user-big.jpeg" class="center-block img-circle user-img" alt="Responsive image">
                </div>
                <div class="col-md-4">
                    <div class="user-details">
                        <h3><strong>用户名:</strong>${user.userNickname}<small>关注 99&nbsp;&nbsp;粉丝 99</small></h3>
                        <div class="row text-left">
                            <div class="col-xs-6">
                                <strong>学校</strong>
                            </div>
                            <div class="col-xs-6">
                                <strong>专业</strong>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4">
                                <strong>经验</strong>
                            </div>
                            <div class="col-xs-4">
                                <strong>等级</strong>
                            </div>
                            <div class="col-xs-4">
                                <strong>排名</strong>
                            </div>
                        </div>
                        <h5><input class="briefing" type="text" name="briefing" placeholder="这个人很懒"></h5>
                    </div>
                </div>
            </div>
        </div>
        <div class="content-main">
            <div class="row">
                <div class="nav-left col-xs-3">
                    <nav class="navbar">
                        <div class="container-fluid">
                            <!-- Brand and toggle get grouped for better mobile display -->
                            <div class="navbar-header navbar-default">
                                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-2" aria-expanded="false">
                                    <span class="sr-only">Toggle navigation</span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button>
                            </div>
                            <!-- Collect the nav links, forms, and other content for toggling -->
                            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-2">
                                <div class="list-group left-list">
                                    <a class="list-group-item active">主页</a>
                                    <a class="list-group-item">课程</a>
                                    <a class="list-group-item">教室</a>
                                    <a class="list-group-item">问答</a>
                                    <a class="list-group-item">笔记</a>
                                    <a class="list-group-item">收藏</a>
                                </div>
                            </div>
                        </div>
                    </nav>
                </div>
                <div class="content-main-inner col-xs-9">
                    <h1 class="text-center">晓明包工头，拖欠工资不给还不让睡觉。T T</h1>
                </div>
            </div>
        </div>
    </div>
</content>

<%@include file="../include/footer.jsp"%>

</body>

<script src="${__static__}/js/jquery.js"></script>
<script src="${__static__}/js/bootstrap.min.js"></script>
<script src="${__static__}/js/style-assit.js"></script>

</html>
