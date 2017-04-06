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
    <link rel="stylesheet" type="text/css" href="${__static__}/css/selfStudyRoom.css">
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
                <h4 class="modal-title">添加笔记</h4>
            </div>
            <form>
                <div class="modal-body">
                    <div class="form-group">
                        <label>标题</label>
                        <input id="notetitle" type="text" class="form-control" placeholder="标题">
                    </div>
                    <div class="form-group">
                        <label>内容</label>
                        <textarea id="notecontent" class="form-control" placeholder="请自觉遵守互联网相关的政策法规，严禁发布色情、暴力、反动的言论。"></textarea>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button id="sendnote" type="submit" class="btn btn-primary">发表</button>
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

<div class="container selfroom-wrapper">
    <ul class="nav nav-pills">
        <li role="presentation" id="othernote" class="active"><a href="#">所有笔记</a></li>
        <li role="presentation" id="addnote" class="navbar-right active" ><button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-lg">添加笔记</button></li>
        <li role="presentation" id="mynote"><a href="#">我的笔记</a></li>
    </ul>
    <div class="self-body">
        <div id="masonry"><!-- masonry -->
            <c:forEach items="${allnotelist}" var="note">
            <div class="box">
                <div class="box-title">
                    ${note.noteTitle}
                </div>
                <div class="box-content">
                    <p>${note.noteContent}</p>
                </div>
                <div class="box-foot">
                    作者：<span>${noteusername[note.userId]}</span>
                </div>
            </div>
            </c:forEach>
        </div><!-- my note end --><!-- other note value="" -->
        <div></div><!-- my note end -->
    </div>
</div>

<!-- content end -->

<%@include file="../include/footer.jsp"%>

<!--  js file  -->
<script src="${__static__}/js/jquery.js"></script>
<script src="${__static__}/js/bootstrap.min.js"></script>
<script src="${__static__}/js/carousel.js"></script>
<script src="${__static__}/js/style-assit.js"></script>
<script src="${__static__}/js/classroom.js"></script>
<script src="${__static__}/js/masonry-docs.min.js"></script>
<script type="text/javascript">
    $(function () {
        $(".box").mouseover(function () {
            $(this).css("border","solid #FFFFFF 0");
            $(this).find('.box-title').css("background-color","#f38094");
        });
        $(".box").mouseout(function () {
            $(this).css("border","solid #c8c5ca 1px");
            $(this).find('.box-title').css("background-color","#ce8483");
        });
    });
    $(function () {
        $("#mynote").click(function () {
            if ($(".self-body>div:last-child").html()==""){
                $.ajax({
                    type:"post",
                    url:"/selfstudy/mine",
                    dataType:"json",
                    success:function (myNotes) {
                        alert("success");
                        $(".self-body>div:first-child").removeAttr("id");
                      //  $(".self-body>div:last-child").attr("id","masonry");
                        $(".nav-pills>li:first-child").removeClass("active");
                        $(".nav-pills>li:last-child").addClass("active");
                        $(".self-body>div:first-child").hide();
                        $(".self-body>div:last-child").show();
                        heightListener();
                        var append = '<div id="masonry">'+
                            '<c:forEach items="${myNotes}" var="unote">'+
                       ' <div class="box">'+
                            '<div class="box-title">'+
                           ' ${unote.noteTitle}'+
                           ' </div>'+
                          '  <div class="box-content">'+
                           ' <p>${unote.noteContent}</p>'+
                            '</div>'+
                            '<div class="box-foot">'+
                            '作者：<span>${userId}</span>'+
                        '</div>'+
                        '</div>'+
                        '</c:forEach>'+
                                '</div>'
                        $(".self-body>div:last-child").html(append);
                    },
                    error:function(XMLHttpRequest, textStatus, errorThrown) {
                        alert(XMLHttpRequest.status);
                        alert(XMLHttpRequest.readyState);
                        alert(textStatus);
                    }
                });
            }
            else {
                $(".nav-pills>li:first-child").removeClass("active");
                $(".nav-pills>li:last-child").addClass("active");
                $(".self-body>div:first-child").hide();
                $(".self-body>div:last-child").show();
                heightListener();
            }
        });
        $("#othernote").click(function () {
            $(".self-body>div:last-child").removeAttr("id");
            $(".self-body>div:first-child").attr("id","masonry");
            $(".nav-pills>li:first-child").addClass("active");
            $(".nav-pills>li:last-child").removeClass("active");
            $(".self-body>div:first-child").show();
            $(".self-body>div:last-child").hide();
            heightListener()();
        });
    });

</script>
</body>
</html>
