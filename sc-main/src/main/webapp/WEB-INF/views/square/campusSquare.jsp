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
	<title>校园广场</title>
    <link rel="stylesheet" href="${__static__}/css/main/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/main/common.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/square/wangEditor.min.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/square/campusSquare.css">
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
        <div class="content-main container">
            <ul class="nav nav-pills">
                <li role="presentation"><button type="button" class="btn btn-primary">最新</button></li>
                <li role="presentation"><button type="button" class="btn btn-default">最热</button></li>
                <li role="presentation" class="navbar-right">
                    <div id="change" class="btn change">黑夜</div>
                    <button type="button" class="btn btn-default" data-toggle="modal" ${userId!=null?'data-target="#sendPost"':'data-target="#gologin"'} >发帖</button>
                    <div id="random" class="btn random" data-toggle="modal" data-target="#randomModal">偶遇</div>
                </li>
            </ul>
            <div id="postList" class="post-list list-group">

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
            <c:choose>
                <c:when test="${userId!=null}">
                <div id="sendPost" class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
                    <div class="modal-dialog modal-lg" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title">发表评论</h4>
                            </div>
                            <form>
                                <div class="modal-body">
                                    <div class="form-group">
                                        <label>标题</label>
                                        <input id="titlein" type="text" class="form-control" placeholder="标题">
                                    </div>
                                    <div class="form-group">
                                        <label>内容</label>
                                        <div id="contentin" class="form-control contentin"></div>
                                    </div>
                                    <div class="form-group">
                                        <label>图片上传</label>
                                        <input id="uploadImg" type="file" style="display: none;">
                                        <div class="input-group">
                                            <span id="showLocation">文件路径</span>
                                            <span class="input-group-btn">
                                                    <button id="upload" class="btn btn-default" type="button">上传图片</button>
                                                </span>
                                        </div>
                                        <!-- /input-group -->
                                    </div>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                                    <button id="send" type="submit" class="btn btn-primary">发表</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                </c:when>
                <c:otherwise>
                    <div id="gologin" class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
                        <div class="modal-dialog modal-lg" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                    <h1 class="modal-title text-center">滚去登陆</h1>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:otherwise>
            </c:choose>
            <div id="randomModal" class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
                <div class="modal-dialog modal-xs" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 class="text-center">偶遇</h4>
                        </div>
                        <div class="modal-body">
                            <div class="chat-list">
                                <div class="chat row">
                                    <div class="col-xs-2 col-md-2">
                                        <img src="${__static__}/img/user-big.jpeg" class="img-responsive img-circle">
                                    </div>
                                    <div class="col-xs-10 col-md-10">
                                        <span>很高兴见到你</span>
                                    </div>
                                </div>
                                <div class="chat row text-right">
                                    <div class="col-xs-10 col-md-10">
                                        <span>玛德，给我滚</span>
                                    </div>
                                    <div class="col-xs-2 col-md-2">
                                        <img src="${__static__}/img/user-big.jpeg" class="img-responsive img-circle">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <div class="input-group">
                                <input id="msg" type="text" class="form-control" placeholder="请自觉遵守互联网相关的政策法规，严禁发布色情、暴力、反动的言论。">
                                <span class="input-group-btn">
                                    <button id="send-msg" class="btn btn-default" type="button">发送</button>
                                </span>
                            </div>
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
<script type="text/javascript" src="${__static__}/js/wangEditor.min.js"></script>
<script type="text/javascript" src="${__static__}/js/myWangEditor.js"></script>
<script type="text/javascript" src="${__static__}/js/campusSquare.js"></script>

</html>