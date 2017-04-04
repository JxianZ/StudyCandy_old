<%--
  Created by IntelliJ IDEA.
  User: BlackZXK
  Date: 4/2/2017
  Time: 1:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>post</title>
    <link rel="stylesheet" href="${__static__}/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/common.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/post.css">
</head>
<body>

<%@include file="../include/header.jsp"%>

<content>
    <div class="content">
        <div class="post">
            <div class="row">
                <div class="col-md-4">
                    <img class="img-responsive center-block" src="${__static__}/img/videotest.png">
                </div>
                <div class="details col-md-8">
                    <h1>${post.postTitle}</h1>
                    <h3>作者：${user.userNickname}</h3>
                    <div class="container-fluid">
                        ${post.postContent}
                    </div>
                    <div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container-fluid comment-list">
            <div class="row comment">
                <div class="col-xs-1 col-md-1">
                    <a href="#"><img class="img-responsive img-circle" src="${__static__}/img/user-big.jpeg"></a>
                </div>
                <div class="col-xs-8 col-md-8">
                    <h3>内容</h3>
                </div>
                <div class="col-xs-3 col-md-3 text-right text-bottom">
                    回复发布时间
                </div>
            </div>
            <div class="row comment">
                <div class="col-xs-1 col-md-1">
                    <a href="#"><img class="img-responsive img-circle" src="${__static__}/img/user-big.jpeg"></a>
                </div>
                <div class="col-xs-8 col-md-8">
                    <h3>内容</h3>
                </div>
                <div class="col-xs-3 col-md-3 text-right text-bottom">
                    回复发布时间
                </div>
            </div>
            <div class="row comment">
                <div class="col-xs-1 col-md-1">
                    <a href="#"><img class="img-responsive img-circle" src="${__static__}/img/user-big.jpeg"></a>
                </div>
                <div class="col-xs-8 col-md-8">
                    <h3>内容</h3>
                </div>
                <div class="col-xs-3 col-md-3 text-right text-bottom">
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
        <div class="send-comment">
            <div class="row">
                <div class="col-xs-2 col-md-1">
                    <img class="img-responsive" src="${__static__}/img/user-big.jpeg">
                </div>
                <div class="col-xs-10 col-md-11">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="请自觉遵守互联网相关的政策法规，严禁发布色情、暴力、反动的言论。">
                        <span class="input-group-btn">
                            <button class="btn btn-default" type="button">回复</button>
                        </span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</content>

<%@include file="../include/footer.jsp"%>

</body>

<script src="${__static__}/js/jquery.js"></script>
<script src="${__static__}/js/bootstrap.min.js"></script>
<script src="${__static__}/js/style-assit.js"></script>

</html>
