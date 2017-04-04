<%--
  Created by IntelliJ IDEA.
  User: BlackZXK
  Date: 4/3/2017
  Time: 1:50 AM
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
    <title>smallClassroom</title>
    <link rel="stylesheet" type="text/css" href="${__static__}/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/common.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/smallClassroom.css">
</head>
<body>

<%@include file="../include/header.jsp"%>

<content>
    <div class="content">
        <div class="mynav">
            <div class="row">
                <div class="col-md-2">
                    <img src="${__static__}/img/course-test.jpg" class="img-responsive" alt="Responsive image">
                </div>
                <div class="col-md-10">
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
            </div>
        </div>
        <div class="content-main">
            <div class="container-fluid">
                <ul class="nav nav-tabs">
                    <li role="presentation" class="active"><a href="#">最新</a></li>
                    <li role="presentation"><a href="#">最新</a></li>
                </ul>
                <div class="row">
                    <c:forEach items="${courseList}" var="course">
                    <div class="col-xs-12 col-sm-4 col-md-3 img-bottom myImg">
                        <div class="up">
                            <img src="${__static__}/img/course-test.jpg" class="img-responsive" alt="Responsive image">
                        </div>
                        <span class="className"><strong>课程名称</strong>${course.courseTitle}</span>
                        <a class="btn btn-default mybtn" href="/classroom/course/${course.id}" target="_blank">开始学习</a>
                        <img src="${__static__}/img/user-big.jpeg" class="img-circle userImg">
                        <span class="lecturerName"><strong>讲师id</strong>${course.userId}</span>
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
<script src="${__static__}/js/smallClassroom.js"></script>

</html>
