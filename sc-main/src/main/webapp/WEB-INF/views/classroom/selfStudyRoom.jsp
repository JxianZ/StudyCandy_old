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
    <link rel="stylesheet" type="text/css" href="${__static__}/css/bigClassroom.css">
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

<%@include file="../include/header.jsp"%>

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

<div class="container selfroom-wrapper">
    <ul class="nav nav-pills">
        <li role="presentation" id="mynote" class="active"><a href="#">我写的笔记</a></li>
        <li role="presentation" id="othernote"><a href="#">弱智写的笔记</a></li>
    </ul>
    <div class="self-body">
        <div id="masonry">
            <div class="box">
                <div class="box-title">
                    这是一个标题
                </div>
                <div class="box-content">
                    <p>这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容</p>
                </div>
                <div class="box-foot">
                    <span>666</span>浏览数
                </div>
            </div>
            <div class="box">
                <div class="box-title">
                    这是一个标题
                </div>
                <div class="box-content">
                    <p>这里是内容这里这里是内容这里是内容这里是内容这里是内容</p>
                </div>
                <div class="box-foot">
                    <span>666</span>浏览数
                </div>
            </div><div class="box">
            <div class="box-title">
                这是一个标题
            </div>
            <div class="box-content">
                <p>这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容</p>
            </div>
            <div class="box-foot">
                <span>666</span>浏览数
            </div>
        </div><div class="box">
            <div class="box-title">
                这是一个标题
            </div>
            <div class="box-content">
                <p>这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容</p>
            </div>
            <div class="box-foot">
                <span>666</span>浏览数
            </div>

        </div>
            <div class="box">
                <div class="box-title">
                    这是一个标题
                </div>
                <div class="box-content">
                    <p>这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容</p>
                </div>
                <div class="box-foot">
                    <span>666</span>浏览数
                </div>
            </div>
            <div class="box">
                <div class="box-title">
                    这是一个标题
                </div>
                <div class="box-content">
                    <p>这里是内容这里这里是内容这里是内容这里是内容这里是内容</p>
                </div>
                <div class="box-foot">
                    <span>666</span>浏览数
                </div>
            </div><div class="box">
            <div class="box-title">
                这是一个标题
            </div>
            <div class="box-content">
                <p>这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容</p>
            </div>
            <div class="box-foot">
                <span>666</span>浏览数
            </div>
        </div><div class="box">
            <div class="box-title">
                这是一个标题
            </div>
            <div class="box-content">
                <p>这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容</p>
            </div>
            <div class="box-foot">
                <span>666</span>浏览数
            </div>

        </div>
            <div class="box">
                <div class="box-title">
                    这是一个标题
                </div>
                <div class="box-content">
                    <p>这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容</p>
                </div>
                <div class="box-foot">
                    <span>666</span>浏览数
                </div>
            </div>
            <div class="box">
                <div class="box-title">
                    这是一个标题
                </div>
                <div class="box-content">
                    <p>这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容这里是内容</p>
                </div>
                <div class="box-foot">
                    <span>666</span>浏览数
                </div>
            </div>
        </div><!-- my note end -->
        <div></div><!-- other note value="" -->
    </div>
</div>

<!-- content end -->

<%@include file="../include/footer.jsp"%>

<!--  js file  -->
<script src="${__static__}/js/jquery.js"></script>
<script src="${__static__}/js/bootstrap.min.js"></script>
<script src="${__static__}/js/carousel.js"></script>
<script src="${__static__}/js/style-assit.js"></script>
<script src="${__static__}/js/masonry-docs.min.js"></script>
<script src="${__static__}/js/classroom.js"></script>
</body>
</html>
