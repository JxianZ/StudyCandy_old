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
    <link rel="stylesheet" type="text/css" href="${__static__}/css/main/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/main/common.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/square/courseVideo.css">
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
                <form>
                    <div class="input-group">
                        <span class="input-group-addon">
                            匿名&nbsp;<input type="checkbox">
                        </span>
                        <input type="text" class="form-control" placeholder="请自觉遵守互联网相关的政策法规，严禁发布色情、暴力、反动的言论。">
                        <span class="input-group-btn">
                            <button class="btn btn-default" type="submit">发送</button>
                        </span>
                    </div>
                </form>
                <div class="comment-list">
                    <ul class="list-group">
                        <li class="list-group-item">
                            <div class="row comment">
                                <div class="col-md-2">
                                    <a href="#">
                                        <img class="img-responsive img-circle" src="${__static__}/img/user-big.jpeg">
                                    </a>
                                </div>
                                <div class="col-md-7">
                                    <h4>用户名</h4>
                                    <div class="long">很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长</div>
                                </div>
                                <div class="col-md-3 text-right">
                                    <small>发布时间</small>
                                </div>
                            </div>
                        </li>
                        <li class="list-group-item">
                            <div class="row comment">
                                <div class="col-md-2">
                                    <a href="#">
                                        <img class="img-responsive img-circle" src="${__static__}/img/user-big.jpeg">
                                    </a>
                                </div>
                                <div class="col-md-7">
                                    <h4>用户名</h4>
                                    <div class="long">很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长</div>
                                </div>
                                <div class="col-md-3 text-right">
                                    <small>发布时间</small>
                                </div>
                            </div>
                        </li>
                        <li class="list-group-item">
                            <div class="row comment">
                                <div class="col-md-2">
                                    <a href="#">
                                        <img class="img-responsive img-circle" src="${__static__}/img/user-big.jpeg">
                                    </a>
                                </div>
                                <div class="col-md-7">
                                    <h4>用户名</h4>
                                    <div class="long">很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长</div>
                                </div>
                                <div class="col-md-3 text-right">
                                    <small>发布时间</small>
                                </div>
                            </div>
                        </li>
                        <li class="list-group-item">
                            <div class="row comment">
                                <div class="col-md-2">
                                    <a href="#">
                                        <img class="img-responsive img-circle" src="${__static__}/img/user-big.jpeg">
                                    </a>
                                </div>
                                <div class="col-md-7">
                                    <h4>用户名</h4>
                                    <div class="long">很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长</div>
                                </div>
                                <div class="col-md-3 text-right">
                                    <small>发布时间</small>
                                </div>
                            </div>
                        </li>
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
            </div>
            <div class="col-md-4 rightBar">
                <h2>当前视频名称</h2>
                <div class="course-list">
                    <div class="list-group">
                        <li class="list-group-item">
                            第一章节
                            <div class="list-group">
                                <button type="button" class="list-group-item">Cras justo odio</button>
                                <button type="button" class="list-group-item">Dapibus ac facilisis in</button>
                                <button type="button" class="list-group-item">Morbi leo risus</button>
                                <button type="button" class="list-group-item">Porta ac consectetur ac</button>
                                <button type="button" class="list-group-item">Vestibulum at eros</button>
                            </div>
                        </li>
                        <li class="list-group-item">
                            第二章节
                            <div class="list-group">
                                <button type="button" class="list-group-item">Cras justo odio</button>
                                <button type="button" class="list-group-item">Dapibus ac facilisis in</button>
                                <button type="button" class="list-group-item">Morbi leo risus</button>
                                <button type="button" class="list-group-item">Porta ac consectetur ac</button>
                                <button type="button" class="list-group-item">Vestibulum at eros</button>
                            </div>
                        </li>
                        <li class="list-group-item">
                            第三章节
                            <div class="list-group">
                                <button type="button" class="list-group-item">Cras justo odio</button>
                                <button type="button" class="list-group-item">Dapibus ac facilisis in</button>
                                <button type="button" class="list-group-item">Morbi leo risus</button>
                                <button type="button" class="list-group-item">Porta ac consectetur ac</button>
                                <button type="button" class="list-group-item">Vestibulum at eros</button>
                            </div>
                        </li>
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
<script src="${__static__}/js/carousel.js"></script>
<script src="${__static__}/js/style-assit.js"></script>
<script src="http://html5media.googlecode.com/svn/trunk/src/html5media.min.js"></script>
<script>
    $('.rightBar').css("height", $('.video').height() + $('.input-group').height());
</script>

</html>
