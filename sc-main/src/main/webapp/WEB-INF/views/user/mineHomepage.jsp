<%--
  Created by IntelliJ IDEA.
  User: BlackZXK
  Date: 4/9/2017
  Time: 4:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="${__static__}/css/square/campusSquare.css">
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
