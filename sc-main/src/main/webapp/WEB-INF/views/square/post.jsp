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
    <title>${post.postTitle}</title>
    <link rel="stylesheet" href="${__static__}/css/main/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/main/common.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/square/wangEditor.min.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/square/post.css">
</head>
<body>

<%@include file="../include/header.jsp"%>
<!--传递PostId -->
<textarea id="postId" style="display: none">${post.id}</textarea>
<content>
    <div class="content container">
        <div class="btn-group-vertical mybtn">
    <c:choose>
        <c:when test="${userId==post.userId}">
            <button type="button" class="btn btn-primary mybtn2" data-toggle="modal" data-target=".bs-example-modal-lg">修改</button>
        </c:when>
    </c:choose>
            <button type="button" class="btn btn-primary mybtn1" data-toggle="modal" data-target=".bs-example-modal-lg">评论</button>
        </div>
        <div class="post">
            <h1>${post.postTitle}</h1>
            <div class="row">
                <div id="describe" class="col-md-8 col-xs-12 describe">${post.postContent}</div>
                <div class="col-md-4 hidden-xs user-details text-center">
                    <div class="user-img"><img class="img-responsive center-block" src="${__static__}/img/videotest.png" alt="none"></div>
                    <h3 class="text-center">${user.userNickname}</h3>
                    <button class="btn btn-default" type="button"><span class="glyphicon glyphicon-plus"></span>&nbsp;关注</button>
                    <button class="btn btn-default" type="button"><span class="glyphicon glyphicon-envelope"></span>&nbsp;私信</button>
                    <h4>关注&nbsp;&nbsp;粉丝</h4>
                    <h5>学校</h5>
                    <h5>专业</h5>
                </div>
            </div>
        </div>
        <div class="comment-list container">
            <ul class="list-group">
                <c:forEach items="${postComments}" var="comment">
                <li class="list-group-item">
                    <div class="row comment">
                        <div class="col-md-1">
                            <a href="#">
                                <img class="img-responsive img-circle" src="${__static__}/img/videotest.png">
                            </a>
                        </div>
                        <div class="col-md-7">
                            <h4>${postCommentsUserName[comment.userId]}</h4>
                            <div class="long">${comment.commentContent}</div>
                        </div>
                        <div class="col-md-4 text-right">
                            <small>发布时间:${comment.gmtCreate}</small>
                        </div>
                    </div>
                </li>
                </c:forEach>
            </ul>
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
        <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">发表评论</h4>
                    </div>
                    <form>
                        <div class="modal-body">
                            <div class="form-group">
                                <label>内容</label>
                                <div id="contentin" class="form-control contentin"></div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            <button id="publish" type="button" class="btn btn-primary">发表</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</content>

<%@include file="../include/footer.jsp"%>
</body>

<script type="text/javascript" src="${__static__}/js/jquery.js"></script>
<script type="text/javascript" src="${__static__}/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${__static__}/js/style-assit.js"></script>
<script type="text/javascript" src="${__static__}/js/wangEditor.min.js"></script>
<script type="text/javascript" src="${__static__}/js/myWangEditor.js"></script>
<script type="text/javascript" src="${__static__}/js/post.js"></script>
</html>
