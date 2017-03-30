<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>StudyCandy</title>
    <link href="${__static__}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${__static__}/css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/common.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/index.min.css">
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

<!-- nav-html start -->

<nav class="navbar navbar-inverse navbar-cover">
    <div class="container-fluid">
        <div class="navbar-wrapper">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand navbar-logo" href="#"><img src="${__static__}/img/logo.png"></a>
                <a class="navbar-brand navbar-logo" href="#">学糖</a>
            </div>
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-ul">
                    <li><a href="#">大教室</a></li>
                    <li><a href="#">辅导室</a></li>
                    <li><a href="#">自习室</a></li>
                    <li><a href="#">校园广场</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <!-- TODO replace -->
                    <form class="navbar-form navbar-left">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="搜索...">
                        </div>
                        <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
                    </form>

                    <li><a id="haha" href="#" class="navbar-head haha"  data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><img class="img-circle" src="${__static__}/img/user-test.jpg"></a>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                            <li><a href="#">消息</a></li>
                            <li><a href="#">个人中心</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">退出登录</a></li>
                        </ul>
                    </li>
                    <!-- TODO replace -->

                    <!--<li><a class="navbar-login" href="user/login">登录</a></li>-->
                    <!--<li><a class="navbar-login" href="user/register">注册</a></li>-->
                </ul>
            </div>
        </div>
    </div>
</nav>

<!-- nav-html end -->

<!-- ************************************************************************************************************** -->

<!-- xs-download-html start -->

    <!--<div class="container-fluid visible-xs navbar-fixed-bottom">-->
        <!--快来下载APP呀,点击就送-->
    <!--</div>-->

<!-- xs-download-html start -->

<!-- ************************************************************************************************************** -->

<!-- banner-html start -->

<div class="container-fluid banner-min">
    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
            <li data-target="#carousel-example-generic" data-slide-to="3"></li>
            <li data-target="#carousel-example-generic" data-slide-to="4"></li>
        </ol>

        <div class="carousel-inner" role="listbox">
            <div class="item active">
                <img src="${__static__}/img/banner/0.jpg" alt="...">
                <div class="carousel-caption">

                </div>
            </div>
            <div class="item">
                <img src="${__static__}/img/banner/1.jpg" alt="...">
                <div class="carousel-caption">

                </div>
            </div>
            <div class="item">
                <img src="${__static__}/img/banner/2.jpg" alt="...">
                <div class="carousel-caption">

                </div>
            </div>
            <div class="item">
                <img src="${__static__}/img/banner/3.jpg" alt="...">
                <div class="carousel-caption">

                </div>
            </div>
            <div class="item">
                <img src="${__static__}/img/banner/4.jpg" alt="...">
                <div class="carousel-caption">

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
</div>

<!-- banner-html end -->

<!-- ************************************************************************************************************** -->

<!-- entry-html start -->

<div class="container">
    <div class="entry-wrapper">
        <h1 class="mod-title">三大入口</h1>
        <div class="row entry-inner">

            <div class="col-md-4 col-sm-4 entry-item">
                <div class="entry-img">
                    <img src="${__static__}/img/entry-test.jpg">
                </div>
                <h3>haha</h3>
                <p>hahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahaha</p>
                <a class="entry-button" href="#">More</a>
            </div>

            <div class="col-md-4 col-sm-4 entry-item">
                <div class="entry-img">
                    <img src="${__static__}/img/entry-test.jpg">
                </div>
                <h3>haha</h3>
                <p>hahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahaha</p>
                <a class="entry-button" href="#">More</a>
            </div>

            <div class="col-md-4 col-sm-4 entry-item">
                <div class="entry-img">
                    <img src="${__static__}/img/entry-test.jpg">
                </div>
                <h3>haha</h3>
                <p>hahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahaha</p>
                <a class="entry-button" href="#">More</a>
            </div>

        </div>
    </div>
</div>

<!-- entry-html end -->

<!-- ************************************************************************************************************** -->

<!-- video-html end -->

<div class="container">
    <div class=" video-wrapper">
        <h1 class="mod-title">热门视频</h1>
        <div class="row">
            <div class="col-md-2 col-sm-2 col-xs-6">
                <div class=" video-item">
                    <a href="#"><img src="${__static__}/img/video/item.png"></a>
                    <h3>cls的python课堂</h3>
                </div>
            </div>
            <div class="col-md-2 col-sm-2 col-xs-6">
                <div class=" video-item">
                    <a href="#"><img src="${__static__}/img/video/item6.png"></a>
                    <h3>wyf的c++课堂</h3>
                </div>
            </div>
            <div class="col-md-2 col-sm-2 col-xs-6">
                <div class=" video-item">
                    <a href="#"><img src="${__static__}/img/video/item2.png"></a>
                    <h3>yxm的吹比课堂</h3>
                </div>
            </div>
            <div class="col-md-2 col-sm-2 col-xs-6">
                <div class=" video-item">
                    <a href="#"><img src="${__static__}/img/video/item3.png"></a>
                    <h3>haha</h3>
                </div>
            </div>
            <div class="col-md-2 col-sm-2 col-xs-6">
                <div class=" video-item">
                    <a href="#"><img src="${__static__}/img/video/item4.png"></a>
                    <h3>haha</h3>
                </div>
            </div>
            <div class="col-md-2 col-sm-2 col-xs-6">
                <div class=" video-item">
                    <a href="#"><img src="${__static__}/img/video/item5.png"></a>
                    <h3>haha</h3>
                </div>
            </div>
        </div>
        <div class="row hidden-xs">
            <div class="col-md-2 col-sm-2 col-xs-6">
                <div class=" video-item">
                    <a href="#"><img src="${__static__}/img/video/item.png"></a>
                    <h3>haha</h3>
                </div>
            </div>
            <div class="col-md-2 col-sm-2 col-xs-6">
                <div class=" video-item">
                    <a href="#"><img src="${__static__}/img/video/item6.png"></a>
                    <h3>haha</h3>
                </div>
            </div>
            <div class="col-md-2 col-sm-2 col-xs-6">
                <div class=" video-item">
                    <a href="#"><img src="${__static__}/img/video/item2.png"></a>
                    <h3>haha</h3>
                </div>
            </div>
            <div class="col-md-2 col-sm-2 col-xs-6">
                <div class=" video-item">
                    <a href="#"><img src="${__static__}/img/video/item3.png"></a>
                    <h3>haha</h3>
                </div>
            </div>
            <div class="col-md-2 col-sm-2 col-xs-6">
                <div class=" video-item">
                    <a href="#"><img src="${__static__}/img/video/item4.png"></a>
                    <h3>haha</h3>
                </div>
            </div>
            <div class="col-md-2 col-sm-2 col-xs-6">
                <div class=" video-item">
                    <a href="#"><img src="${__static__}/img/video/item5.png"></a>
                    <h3>haha</h3>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- video-html end -->

<!-- ************************************************************************************************************** -->

<!-- square-html start -->

<div class="square-wrapper">
    <div class="container">
        <h1 class="mod-title">校园广场</h1>
        <div class="row">
            <div class="col-md-8 col-xs-12 square-body">
                <ul>
                    <li class="topli">
                        <div class="navbar-left">
                            <h6>活动</h6>
                            <h5>【说吧骚年】</h5>
                            <h5>春节期间你都打算为大家做点啥</h5>
                        </div>
                        <div class="navbar-right">
                            <h6>288</h6>
                            <h6>一个月前</h6>
                        </div>
                    </li>
                    <li>
                        <div class="navbar-left">
                            <h6>活动</h6>
                            <h5>【说吧骚年】</h5>
                            <h5>春节期间你都打算为大家做点啥</h5>
                        </div>
                        <div class="navbar-right">
                            <h6>288</h6>
                            <h6>一个月前</h6>
                        </div>
                    </li>
                    <li>
                        <div class="navbar-left">
                            <h6>活动</h6>
                            <h5>【说吧骚年】</h5>
                            <h5>春节期间你都打算为大家做点啥</h5>
                        </div>
                        <div class="navbar-right">
                            <h6>288</h6>
                            <h6>一个月前</h6>
                        </div>
                    </li>
                    <li>
                        <div class="navbar-left">
                            <h6>活动</h6>
                            <h5>【说吧骚年】</h5>
                            <h5>春节期间你都打算为大家做点啥</h5>
                        </div>
                        <div class="navbar-right">
                            <h6>288</h6>
                            <h6>一个月前</h6>
                        </div>
                    </li>
                    <li>
                        <div class="navbar-left">
                            <h6>活动</h6>
                            <h5>【说吧骚年】</h5>
                            <h5>春节期间你都打算为大家做点啥</h5>
                        </div>
                        <div class="navbar-right">
                            <h6>288</h6>
                            <h6>一个月前</h6>
                        </div>
                    </li>
                    <li>
                        <div class="navbar-left">
                            <h6>活动</h6>
                            <h5>【说吧骚年】</h5>
                            <h5>春节期间你都打算为大家做点啥</h5>
                        </div>
                        <div class="navbar-right">
                            <h6>288</h6>
                            <h6>一个月前</h6>
                        </div>
                    </li>
                    <li>
                        <div class="navbar-left">
                            <h6>活动</h6>
                            <h5>【说吧骚年】</h5>
                            <h5>春节期间你都打算为大家做点啥</h5>
                        </div>
                        <div class="navbar-right">
                            <h6>288</h6>
                            <h6>一个月前</h6>
                        </div>
                    </li>
                    <li>
                        <div class="square-button-wrapper" id="square-more">查看全部帖子</div>
                    </li>
                </ul>
            </div>
            <div class="col-md-4 hidden-xs hidden-sm square-ad">
                广告位招租
            </div>
        </div>
    </div>
</div>

<!-- square-html end -->

<!-- ************************************************************************************************************** -->

<!-- footer-html start -->

<footer>
    <div class="copyright">
        <span>Copyright © <a href="http://expo.bootcss.com">学糖</a></span> |
        <span><a href="http://www.miibeian.gov.cn/" target="_blank">京ICP备11008151号</a></span> | 聚Xian庄 版权所有
    </div>
</footer>

<!-- footer-html end -->

<!-- ************************************************************************************************************** -->

<!--  js file  -->
<script src="${__static__}/js/jquery.js"></script>
<script src="${__static__}/js/bootstrap.min.js"></script>
<script src="${__static__}/js/carousel.js"></script>
<script src="${__static__}/js/style-assit.js"></script>

</body>
</html>