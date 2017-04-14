<%--
  Created by IntelliJ IDEA.
  User: BlackZXK
  Date: 4/1/2017
  Time: 4:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>bigClassroom</title>
    <link rel="stylesheet" type="text/css" href="${__static__}/css/main/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/main/common.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/classroom/bigClassroom.css">
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
        <div class="mynav">
            <ul class="nav nav-tabs">
                <li role="presentation" class="active"><a href="#">系别分类</a></li>
                <li role="presentation"><a href="#">系别1</a></li>
                <li role="presentation"><a href="#">系别2</a></li>
                <li role="presentation"><a href="#">系别3</a></li>
                <li role="presentation"><a href="#">系别4</a></li>
                <li role="presentation"><a href="#">系别5</a></li>
                <li role="presentation"><a href="#">系别6</a></li>
            </ul>
            <ul class="nav nav-tabs">
                <li role="presentation" class="active"><a href="#">课程分类</a></li>
                <li role="presentation"><a href="#">课程1</a></li>
                <li role="presentation"><a href="#">课程2</a></li>
                <li role="presentation"><a href="#">课程3</a></li>
                <li role="presentation"><a href="#">课程4</a></li>
                <li role="presentation"><a href="#">课程5</a></li>
                <li role="presentation"><a href="#">课程6</a></li>
            </ul>
        </div>
        <div class="mynav">
            <ul class="nav nav-tabs">
                <li role="presentation" class="active"><a href="#">最新</a></li>
                <li role="presentation"><a href="#">最新</a></li>
            </ul>
        </div>
        <div class="content-main">
            <div class="container-fluid">
                <h1>${info}</h1>
                <div class="row">
                    <c:forEach items="${classRoomList}" var="classRoom">
                    <div class="col-xs-12 col-sm-4 col-md-3 img-bottom myImg">
                        <div class="up">
                            <img src="${__static__}/img/course-test.jpg" class="img-responsive" alt="Responsive image">
                        </div>
                        <span class="className"><strong>教室名称:</strong>${classRoom.className}</span>
                        <a class="btn btn-default mybtn" href="smallClassroom/${classRoom.id}" target="_blank">进入教室</a>
                        <img src="${__static__}/img/user-big.jpeg" class="img-circle userImg">
                        <span class="lecturerName"><strong>管理员名称:</strong>${classRoom.classAdminId}</span>
                        <img src="${__static__}/img/course-test2.jpg" class="img-responsive" alt="Responsive image">
                    </div>
                    </c:forEach>
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
        </div>
    </div>
</content>

<%@include file="../include/footer.jsp"%>

</body>

<script src="${__static__}/js/jquery.js"></script>
<script src="${__static__}/js/bootstrap.min.js"></script>
<script src="${__static__}/js/carousel.js"></script>
<script src="${__static__}/js/style-assit.js"></script>
<script src="${__static__}/js/bigClassroom.js"></script>

</html>
