<%--
  Created by IntelliJ IDEA.
  User: BlackZXK
  Date: 4/9/2017
  Time: 4:12 AM
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
    <link rel="stylesheet" type="text/css" href="${__static__}/css/square/campusSquare.css">
</head>
<body>
<h3 class="text-center">动态</h3>
<div id="post-list" class="post-list list-group">
    <c:forEach items="${allpostlist}" var="post">
        <a class="list-group-item post" href="/square/postview/${post.id}" target="_blank">
            <div class="row">
                <div class="col-xs-12 col-md-8">
                    <h3>${post.postTitle}</h3>
                    <div class="user-details">
                        <img class="img-responsive img-circle user-img" src="${__static__}/img/videotest.png" align="left">
                        <span>${postusername[post.userId]}</span>
                    </div>
                </div>
                <div class="col-xs-12 col-md-4 text-right text-bottom">
                    <small>回复人数</small>&nbsp;&nbsp;<small>发布时间:${post.gmtModified}</small>
                </div>
            </div>
        </a>
    </c:forEach>
</div>
</body>

<script src="${__static__}/js/jquery.js"></script>
<script src="${__static__}/js/bootstrap.min.js"></script>
<script src="${__static__}/js/style-assit.js"></script>
<script>

</script>
</html>
