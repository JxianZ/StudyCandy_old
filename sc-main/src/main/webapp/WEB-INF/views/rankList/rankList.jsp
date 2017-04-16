<%--
  Created by IntelliJ IDEA.
  User: BlackZXK
  Date: 4/9/2017
  Time: 1:52 AM
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
    <title>RankList</title>
    <link rel="stylesheet" href="${__static__}/css/main/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/main/common.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/rank/rankList.css">
</head>
<body>

<%@include file="../include/header.jsp"%>

<content>
    <div class="content container">
        <img class="center-block" src="${__static__}/img/rankList.png" alt="">
        <div class="row">
            <div class="col-md-10">
                <ul class="nav nav-tabs">
                    <li role="presentation" class="active"><a href="#">综合</a></li>
                    <li role="presentation"><a href="#">课程学习</a></li>
                    <li role="presentation"><a href="#">问答</a></li>
                    <li role="presentation"><a href="#">笔记</a></li>
                    <li role="presentation" class="navbar-right"><a href="#">周排名</a></li>
                    <li role="presentation" class="active navbar-right"><a href="#">日排名</a></li>
                </ul>
                <div class="rank-list list-group">
                    <c:forEach items="${rankList}" var="userInfo" varStatus="st">
                    <a id="${st.count}" class="list-group-item" href="/square/postview/" target="_blank">
                        <div class="row">
                            <div class="col-xs-1 col-md-1">
                                <h1>${st.count}</h1>
                            </div>
                            <div class="col-xs-1 col-md-1">
                                <img class="img-responsive img-circle user-img" src="${__static__}/img/videotest.png">
                            </div>
                            <div class="col-xs-6 col-md-6">
                                <h4 id="${userInfo.id}">${userList[userInfo.id].userNickname}</h4>
                                <p>${userInfo.userMotto}</p>
                            </div>
                            <div class="col-xs-4 col-md-4 text-right text-bottom">
                                <small>学校:${school[userInfo.userSchoolId]}</small>
                            </div>
                            <div class="col-xs-4 col-md-4 text-right text-bottom">
                                <small>积分</small>&nbsp;&nbsp;<small>${userInfo.userIntegral+userInfo.userMoney*10}</small>
                            </div>
                        </div>
                    </a>
                    </c:forEach>
                </div>
            </div>
            <div class="col-md-2">
                <div class="navbar-rank">
                    <div class="input-group">
                        <input id="searchUsername" type="text" class="form-control" placeholder="用户名">
                        <span class="input-group-btn">
                            <button id="search" class="btn btn-default" type="button">查找</button>
                        </span>
                    </div>
                    <nav id="navbar">
                        <ul class="nav nav-pills nav-stacked">
                            <li><a href="#1">1-10</a></li>
                            <li><a href="#11">11-50</a></li>
                            <li><a href="#51">51-100</a></li>
                            <li><a href="#101">101-200</a></li>
                            <li><a href="#201">201-300</a></li>
                            <li><a href="#301">301-400</a></li>
                            <li><a href="#401">401-500</a></li>
                        </ul>
                    </nav>
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
<script type="text/javascript" src="${__static__}/js/rankList.js"></script>
</html>
