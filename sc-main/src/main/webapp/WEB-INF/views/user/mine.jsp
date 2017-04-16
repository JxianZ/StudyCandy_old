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
    <link rel="stylesheet" href="${__static__}/css/main/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/main/common.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/user/mine.css">
</head>
<body>

<%@include file="../include/header.jsp"%>

<content>
    <div class="content">
        <div class="container-fluid myuser">
            <div class="row">
                <div class="col-xs-12 col-md-3">
                    <img src="${__static__}/img/user-big.jpeg" class="center-block img-circle user-img" data-toggle="modal" data-target="#userImg">
                </div>
                <div class="col-md-4">
                    <div class="user-details">
                        <div class="row">
                            <div class="col-md-6 username">${user.userNickname}</div>
                            <div class="col-md-6 follow">关注 99&nbsp;&nbsp;粉丝 99</div>
                        </div>
                        <div class="row">
                            <div class="col-xs-6 left">
                                学校:${school.schoolName}
                            </div>
                            <div class="col-xs-6 right">
                                专业
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-6">
                                金豆豆:${userInfo.userMoney}
                            </div>
                            <div class="col-xs-6">
                                银豆豆:${userInfo.userIntegral}
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
                                    <a id="homepage" class="list-group-item active">主页<span class="glyphicon glyphicon-chevron-right right"></span></a>
                                    <a id="course" class="list-group-item">课程<span class="glyphicon glyphicon-chevron-right right"></span></a>
                                    <a class="list-group-item">教室<span class="glyphicon glyphicon-chevron-right right"></span></a>
                                    <a class="list-group-item">问答<span class="glyphicon glyphicon-chevron-right right"></span></a>
                                    <a id="note" class="list-group-item">笔记<span class="glyphicon glyphicon-chevron-right right"></span></a>
                                    <a class="list-group-item">收藏<span class="glyphicon glyphicon-chevron-right right"></span></a>
                                </div>
                            </div>
                        </div>
                    </nav>
                </div>
                <div class="col-xs-9">
                    <div id="contentMainInner" class="content-main-inner">
                    </div>
                </div>
            </div>
        </div>
        <div id="userImg" class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
            <div class="modal-dialog modal-sm" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h3 class="modal-title text-center">头像修改</h3>
                    </div>
                    <div class="modal-body">
                        <div class="form-group">
                            <label>图片上传</label>
                            <input id="uploadImg" type="file" style="display: none;">
                            <div class="input-group">
                                <span id="showLocation">文件路径</span>
                                <span class="input-group-btn">
                                    <button id="upload" class="btn btn-default" type="button">上传图片</button>
                                </span>
                            </div>
                            <!-- /input-group -->
                        </div>
                    </div>
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
<script src="${__static__}/js/mine.js"></script>

</html>
