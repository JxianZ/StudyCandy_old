<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/3
  Time: 0:45
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link rel="stylesheet" type="text/css" href="${__static__}/css/QA.css">
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

<%@include file="../include/header.jsp"%>

<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">回答悬赏</h4>
            </div>
            <form>
                <div class="modal-body">
                    <div class="form-group">
                        <label>回答内容</label>
                        <textarea id="quescontent" class="form-control" placeholder="请自觉遵守互联网相关的政策法规，严禁发布色情、暴力、反动的言论。"></textarea>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button id="sendques" type="submit" class="btn btn-primary">回答</button>
                </div>
            </form>
        </div>
    </div>
</div>

<!-- banner-html start -->

<div class="container-fluid banner-min">
    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
            <li data-target="#carousel-example-generic" data-slide-to="3"></li>
            <li data-target="#carousel-example-generic" data-slide-to="4"></li>
        </ol>

        <div class="carousel-inner" role="listbox">
            <div class="item active">
                <img src="${__static__}/img/banner/0.jpg" alt="...">
                <div class="carousel-caption">

                </div>
            </div>
            <div class="item">
                <img src="${__static__}/img/banner/1.jpg" alt="...">
                <div class="carousel-caption">

                </div>
            </div>
            <div class="item">
                <img src="${__static__}/img/banner/2.jpg" alt="...">
                <div class="carousel-caption">

                </div>
            </div>
            <div class="item">
                <img src="${__static__}/img/banner/3.jpg" alt="...">
                <div class="carousel-caption">

                </div>
            </div>
            <div class="item">
                <img src="${__static__}/img/banner/4.jpg" alt="...">
                <div class="carousel-caption">

                </div>
            </div>

        </div>

        <!-- Controls -->
        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>

<!-- banner-html end -->

<!-- content -->

<div class="container qa-detail-wrapper">
    <ul class="nav nav-pills">
        <li role="presentation" class="active"><a href="/QARoom">返回</a></li>
        <li role="presentation" id="addans" class="navbar-right active" ><button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-lg">回答</button></li>
    </ul>
    <div class="qa-detail-body">
        <div class="qa-question-body">
            <div class="qa-detail-head">
                <div class="qa-detail-title">
                    <span>50糖豆</span>
                    标题标题标题标题标题标题标题
                </div>
            </div>
            <div class="qa-detail-content">
                <p>你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗你们能吃点屎吗</p>
            </div>
            <div class="qa-detail-user right">
                提问者：<span>林天培</span>
            </div>
        </div>
        <div class="answer-nav">回答：</div>
        <div class="qa-answer-body">
            <div class="qa-answer-content">
                <p>谢邀，不吃</p>
            </div>
            <div class="qa-answer-user">
                <div class="right">
                    回答者：<span>徐建国</span>
                </div>
            </div>
        </div>

        <div class="qa-answer-body">
            <div class="qa-answer-content">
                <p>谢邀，不吃</p>
            </div>
            <div class="qa-answer-user">
                <div class="right">
                    回答者：<span>徐建国</span>
                </div>
            </div>
        </div>
        <div class="qa-answer-body">
            <div class="qa-answer-content">
                <p>谢邀，不吃</p>
            </div>
            <div class="qa-answer-user">
                <div class="right">
                    回答者：<span>徐建国</span>
                </div>
            </div>
        </div>
        <div class="qa-answer-body">
            <div class="qa-answer-content">
                <p>谢邀，不吃</p>
            </div>
            <div class="qa-answer-user">
                <div class="right">
                    回答者：<span>徐建国</span>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- content end -->

<%@include file="../include/footer.jsp"%>

<!--  js file  -->

<script src="${__static__}/js/jquery.js"></script>
<script src="${__static__}/js/masonry-docs.min.js"></script>
<script src="${__static__}/js/bootstrap.min.js"></script>
<script src="${__static__}/js/carousel.js"></script>
<script src="${__static__}/js/style-assit.js"></script>
<script src="${__static__}/js/masonry-docs.min.js"></script>
<script src="${__static__}/js/qa.js"></script>
</body>
</html>
