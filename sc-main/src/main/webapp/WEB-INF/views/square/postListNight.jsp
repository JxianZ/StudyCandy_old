<%--
  Created by IntelliJ IDEA.
  User: BlackZXK
  Date: 4/17/2017
  Time: 8:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link rel="stylesheet" type="text/css" href="${__static__}/css/square/campusSquare.css">

<c:forEach items="${allpostlist}" var="post">
    <a class="list-group-item post" href="/square/postview/${post.id}" target="_blank">
        <div class="row">
            <div class="col-xs-12 col-md-8">
                <h3>${post.postTitle}</h3>
                <div class="user-details">
                    <img class="img-responsive img-circle user-img" src="${__static__}/img/videotest.png" align="left">
                    <span>匿名</span>
                </div>
            </div>
            <div class="col-xs-12 col-md-4 text-right text-bottom">
                <small>回复人数</small>&nbsp;&nbsp;<small>发布时间:${post.gmtModified}</small>
            </div>
        </div>
    </a>
</c:forEach>

<script type="text/javascript">
    $(".post").mouseenter(function () {
        if($("#change").html()=="白天") {
            $(this).css("background", "#444");
        }
    });
    $(".post").mouseleave(function () {
        if($("#change").html()=="白天") {
            $(this).css("background", "#333");
        }
    });
</script>
