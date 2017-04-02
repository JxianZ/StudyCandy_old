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
	<title>campusSquare</title>
    <link rel="stylesheet" href="${__static__}/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/common.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/campusSquare.css?v=20161231204509">
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
        <div class="content-main">
            <ul class="nav nav-tabs">
                <li role="presentation" class="active"><a href="#">最新</a></li>
                <li role="presentation"><a href="#">最热</a></li>
                <li role="presentation" class="navbar-right"><button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-lg">发帖</button></li>
            </ul>
            <div class="post-list">
                <c:forEach items="${allpostlist}" var="post">
                <div class="row post">
                    <div class="col-md-1">
                        <a href="campusSquare/post">
                            <img class="img-responsive img-circle" src="${__static__}/img/videotest.png">
                            <span>${postusername[post.userId]}</span>
                        </a>
                    </div>
                    <div class="col-xs-12 col-md-7">
                        <h5><a href="campusSquare/post">${post.postTitle}</a></h5>
                        <div class="long">${post.postContent}</div>
                    </div>
                    <div class="col-xs-12 col-md-4 text-right text-bottom">
                        <small>回复人数</small>&nbsp;&nbsp;<small>发布时间:${post.gmtModified}</small>
                    </div>
                </div>
                </c:forEach>
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
                                    <label>标题</label>
                                    <input id="titlein" type="text" class="form-control" placeholder="标题">
                                </div>
                                <div class="form-group">
                                    <label>内容</label>
                                    <textarea id="contentin" class="form-control" placeholder="请自觉遵守互联网相关的政策法规，严禁发布色情、暴力、反动的言论。"></textarea>
                                </div>
                                <div class="form-group">
                                    <label for="uplodeImg">图片上传</label>
                                    <input id="uplodeImg" type="file" style="display: none;">
                                    <div class="input-group">
                                        <input id="showLocation" type="text" class="form-control" placeholder="文件路径" disabled="disabled">
                                        <span class="input-group-btn">
                                                <button class="btn btn-default" type="button" onclick="$('#uplodeImg').click();">上传图片</button>
                                            </span>
                                    </div>
                                    <!-- /input-group -->
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox">匿名发表
                                    </label>
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
<script type="text/javascript">
    $(function () {
        $("#send").click(function () {
            var title = $("#titlein").val();
            var content= $("#contentin").val();
            var data = {
                "title":  title,
                "content":content
            };
            $.ajax({
                url: "/square/addpost",
                data: data,
                type: "POST",
                dataType: "json",
                success: function (r) {
                    if(r.status==0) {
                        window.location.reload();
                    }
                    else{
                            alert(r.info);
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    if(XMLHttpRequest.status==0){
                        alert("请先登录");
                    }
                },
            });
        });
    });

    $("#uplodeImg").change(function(){
        $("#showLocation").val($(this).val());
    });
</script>
</html>