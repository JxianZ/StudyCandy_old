<%--
  Created by IntelliJ IDEA.
  User: BlackZXK
  Date: 4/3/2017
  Time: 2:06 AM
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
    <link rel="stylesheet" type="text/css" href="${__static__}/css/course.css">
</head>
<body>

<%@include file="../include/header.jsp"%>

<content>
    <div class="content">
        <div class="row">
            <div class="col-md-8">
                <div class="video">
                    <!-- 16:9 aspect ratio -->
                    <div class="embed-responsive embed-responsive-16by9">
                        <video src="http://www.zhangxinxu.com/study/media/cat.mp4" controls autobuffer></video>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <h2>999w<small>人在看，99w条评论</small></h2>
            </div>
        </div>
    </div>
</content>

<%@include file="../include/footer.jsp"%>

</body>

<script src="${__static__}/js/jquery.js"></script>
<script src="${__static__}/js/bootstrap.min.js"></script>
<script src="${__static__}/js/carousel.js"></script>
<script src="${__static__}/js/style-assit.js"></script>
<script src="http://html5media.googlecode.com/svn/trunk/src/html5media.min.js"></script>

</html>
