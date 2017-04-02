<%--
  Created by IntelliJ IDEA.
  User: BlackZXK
  Date: 4/2/2017
  Time: 10.31AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>campusSquare</title>
    <link rel="stylesheet" href="${__static__}/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/common.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/campusSquare.css?v=20161231204509">
</head>
<body>

<%@include file="../include/header.jsp"%>

<content>
    <div class="content">
        <div id="carousel-example-generic" class="carousel slide mycarousel" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                <li data-target="#carousel-example-generic" data-slide-to="3"></li>
                <li data-target="#carousel-example-generic" data-slide-to="4"></li>
                <li data-target="#carousel-example-generic" data-slide-to="5"></li>
            </ol>
            <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img class="img-responsive" src="${__static__}/img/banner/0.jpg">
                    <div class="carousel-caption">
                        testtestetstetstetstetstetst
                    </div>
                </div>
                <div class="item">
                    <img class="img-responsive" src="${__static__}/img/banner/1.jpg">
                    <div class="carousel-caption">
                        ...
                    </div>
                </div>
                <div class="item">
                    <img class="img-responsive" src="${__static__}/img/banner/2.jpg">
                    <div class="carousel-caption">
                        ...
                    </div>
                </div>
                <div class="item">
                    <img class="img-responsive" src="${__static__}/img/banner/3.jpg">
                    <div class="carousel-caption">
                        ...
                    </div>
                </div>
                <div class="item">
                    <img class="img-responsive" src="${__static__}/img/banner/4.jpg">
                    <div class="carousel-caption">
                        ...
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
        <div class="content-main">
            <ul class="nav nav-tabs">
                <li role="presentation" class="active"><a href="#">最新</a></li>
                <li role="presentation"><a href="#">最热</a></li>
            </ul>
            <div class="post-list">
                <div class="row post">
                    <div class="col-xs-12 col-md-3">
                        <a href="/square/post"><img class="img-responsive" src="${__static__}/img/videotest.png"></a>
                    </div>
                    <div class="col-xs-12 col-md-5">
                        <h2><a href="/square/post">标题</a></h2>
                        <small>简介</small>
                    </div>
                    <div class="col-xs-12 col-md-4 text-right text-bottom">
                        回复发布时间
                    </div>
                </div>
                <div class="row post">
                    <div class="col-xs-12 col-md-3">
                        <a href="#"><img class="img-responsive" src="${__static__}/img/videotest.png"></a>
                    </div>
                    <div class="col-xs-12 col-md-5">
                        <h2><a href="#">标题</a></h2>
                        <small>简介</small>
                    </div>
                    <div class="col-xs-12 col-md-4 text-right text-bottom">
                        回复发布时间
                    </div>
                </div>
            </div>
            <nav aria-label="Page navigation" class="text-center">
                <ul class="pagination">
                    <li>
                        <a href="#" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </li>
                    <li class="active"><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li>
                        <a href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>
                </ul>
            </nav>
            <div class="send-post">
                <div class="row">
                    <div class="col-xs-2 col-md-2">
                        <img class="img-responsive" src="${__static__}/img/user-big.jpeg">
                    </div>
                    <div class="col-xs-10 col-md-10">
                        <div class="input-group post-title">
                            <span class="input-group-addon" id="basic-addon1">标题</span>
                            <input id="titlein" type="text" class="form-control" placeholder="标题" aria-describedby="basic-addon1">
                        </div>
                        <div class="input-group">
                            <input id="contentin" type="text" class="form-control" placeholder="请自觉遵守互联网相关的政策法规，严禁发布色情、暴力、反动的言论。">
                            <span class="input-group-btn">
                                    <button id="send" class="btn btn-default" type="button">发帖</button>
                                </span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</content>

<%@include file="../include/footer.jsp"%>

</body>

<!--  js file  -->
<script type="text/javascript" src="${__static__}/js/jquery.js"></script>
<script type="text/javascript" src="${__static__}/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${__static__}/js/carousel.js"></script>
<script type="text/javascript" src="${__static__}/js/style-assit.js"></script>
<script type="text/javascript">
    $(function () {
        $("#send").click(function () {
            var title = $("#titlein").val();
            var content= $("#contentin").val();
            var data = {
                "title":  title,
                "content":content
            };
            $.ajax({
                url: "/square/addpost",
                data: data,
                type: "POST",
                dataType: "json",
                success: function (r) {
                    if(r.status==0) {
                        window.location.reload();
                    }
                    else{
                        alert(r.info);
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    alert(XMLHttpRequest.status);
                    alert(XMLHttpRequest.readyState);
                    alert(textStatus);
                },
            });
        });
    });
</script>
</html>