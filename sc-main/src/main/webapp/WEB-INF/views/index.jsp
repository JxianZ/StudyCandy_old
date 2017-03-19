<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE HTML>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <title>StudyCandy</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- css -->
    <link href="${__static__}/css/bootstrap-responsive.css" rel="stylesheet">
    <link href="${__static__}/css/style.css" rel="stylesheet">
    <!-- skin color -->
    <link href="${__static__}/color/default.css" rel="stylesheet">

    <!--[if lt IE 7]>
    <link href="${__static__}/css/font-awesome-ie7.css" type="text/css" rel="stylesheet">
    <![endif]-->

    <link rel="shortcut icon" href="${__static__}/img/favicon.ico">
</head>
<body>
<!-- navbar -->
<div class="navbar-wrapper">
    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container">
                <!-- Responsive navbar -->
                <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"><span
                        class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
                </a>
                <h1 class="brand"><a href="index.jsp" tppabs="#">学糖</a></h1>
                <!-- navigation -->
                <nav class="pull-right nav-collapse collapse">
                    <ul id="menu-main" class="nav">
                        <li><a href="/user/mine">个人中心</a></li>
                        <li><a title="team" href="#about">大教室</a></li>
                        <li><a title="services" href="#services">辅导室</a></li>
                        <li><a title="works" href="#works">自习室</a></li>
                        <li><a title="blog" href="#blog">校园广场</a></li>
                        <li><a title="contact" href="#contact">学霸名人堂</a></li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
</div>
<!-- Header area -->
<div id="header-wrapper" class="header-slider">
    <header class="clearfix">
        <div class="logo">
            <img src="${__static__}/img/logo-image.png" alt=""/>
        </div>
        <div class="container">
            <div class="row">
                <div class="span12">
                    <div id="main-flexslider" class="flexslider">
                        <ul class="slides">
                            <li>
                                <p class="home-slide-content">
                                    聚集<strong>闲</strong>的力量
                                </p>
                            </li>
                            <li>
                                <p class="home-slide-content">
                                    打造中国第一家<strong>大学生自主授课平台</strong>
                                </p>
                            </li>
                            <li>
                                <p class="home-slide-content">
                                    <strong>学糖</strong>
                                </p>
                            </li>
                        </ul>
                    </div>
                    <!-- end slider -->
                </div>
            </div>
        </div>
    </header>
</div>
<!-- spacer section -->

<section id="works" class="section">
    <div class="container clearfix">
        <h4>专业索引</h4>
        <!-- portfolio filter -->
        <div class="row">
            <div id="filters" class="span12">
                <ul class="clearfix">
                    <li><a href="#" data-filter="*" class="active">
                        <h5>全部</h5>
                    </a></li>
                    <li><a href="#" data-filter=".web">
                        <h5>计算机</h5>
                    </a></li>
                    <li><a href="#" data-filter=".print">
                        <h5>金融学</h5>
                    </a></li>
                    <li><a href="#" data-filter=".design">
                        <h5>财务管理</h5>
                    </a></li>
                    <li><a href="#" data-filter=".photography">
                        <h5>产品设计</h5>
                    </a></li>
                </ul>
            </div>
            <!-- END PORTFOLIO FILTERING -->
        </div>
        <div class="row">
            <div class="span12">
                <div id="portfolio-wrap">
                    <!-- portfolio item -->
                    <div class="portfolio-item grid print photography">
                        <div class="portfolio">
                            <a href="${__static__}/img/works/big.jpg" data-pretty="prettyPhoto[gallery1]"
                               class="portfolio-image">
                                <img src="${__static__}/img/works/1.png" alt=""/>
                                <div class="portfolio-overlay">
                                    <div class="thumb-info">
                                        <h5>Portfolio name</h5>
                                        <i class="icon-plus icon-2x"></i>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <!-- end portfolio item -->
                    <!-- portfolio item -->
                    <div class="portfolio-item grid print design web">
                        <div class="portfolio">
                            <a href="${__static__}/img/works/big.jpg" data-pretty="prettyPhoto[gallery1]"
                               class="portfolio-image">
                                <img src="${__static__}/img/works/2.png" alt=""/>
                                <div class="portfolio-overlay">
                                    <div class="thumb-info">
                                        <h5>Portfolio name</h5>
                                        <i class="icon-plus icon-2x"></i>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <!-- end portfolio item -->
                    <!-- portfolio item -->
                    <div class="portfolio-item grid print design">
                        <div class="portfolio">
                            <a href="${__static__}/img/works/big.jpg" data-pretty="prettyPhoto[gallery1]"
                               class="portfolio-image">
                                <img src="${__static__}/img/works/3.png" alt=""/>
                                <div class="portfolio-overlay">
                                    <div class="thumb-info">
                                        <h5>Portfolio name</h5>
                                        <i class="icon-plus icon-2x"></i>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <!-- end portfolio item -->
                    <!-- portfolio item -->
                    <div class="portfolio-item grid photography web">
                        <div class="portfolio">
                            <a href="${__static__}/img/works/big.jpg" data-pretty="prettyPhoto[gallery1]"
                               class="portfolio-image">
                                <img src="${__static__}/img/works/4.png" alt=""/>
                                <div class="portfolio-overlay">
                                    <div class="thumb-info">
                                        <h5>Portfolio name</h5>
                                        <i class="icon-plus icon-2x"></i>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <!-- end portfolio item -->
                    <!-- portfolio item -->
                    <div class="portfolio-item grid photography web">
                        <div class="portfolio">
                            <a href="${__static__}/img/works/big.jpg" data-pretty="prettyPhoto[gallery1]"
                               class="portfolio-image">
                                <img src="${__static__}/img/works/5.png" alt=""/>
                                <div class="portfolio-overlay">
                                    <div class="thumb-info">
                                        <h5>Portfolio name</h5>
                                        <i class="icon-plus icon-2x"></i>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <!-- end portfolio item -->
                    <!-- portfolio item -->
                    <div class="portfolio-item grid photography web">
                        <div class="portfolio">
                            <a href="${__static__}/img/works/big.jpg" data-pretty="prettyPhoto[gallery1]"
                               class="portfolio-image">
                                <img src="${__static__}/img/works/6.png" alt=""/>
                                <div class="portfolio-overlay">
                                    <div class="thumb-info">
                                        <h5>Portfolio name</h5>
                                        <i class="icon-plus icon-2x"></i>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <!-- end portfolio item -->
                    <!-- portfolio item -->
                    <div class="portfolio-item grid photography web">
                        <div class="portfolio">
                            <a href="${__static__}/img/works/big.jpg" data-pretty="prettyPhoto[gallery1]"
                               class="portfolio-image">
                                <img src="${__static__}/img/works/7.png" alt=""/>
                                <div class="portfolio-overlay">
                                    <div class="thumb-info">
                                        <h5>Portfolio name</h5>
                                        <i class="icon-plus icon-2x"></i>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <!-- end portfolio item -->
                    <!-- portfolio item -->
                    <div class="portfolio-item grid photography">
                        <div class="portfolio">
                            <a href="${__static__}/img/works/big.jpg" data-pretty="prettyPhoto[gallery1]"
                               class="portfolio-image">
                                <img src="${__static__}/img/works/8.png" alt=""/>
                                <div class="portfolio-overlay">
                                    <div class="thumb-info">
                                        <h5>Portfolio name</h5>
                                        <i class="icon-plus icon-2x"></i>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <!-- end portfolio item -->
                    <!-- portfolio item -->
                    <div class="portfolio-item grid photography web">
                        <div class="portfolio">
                            <a href="${__static__}/img/works/big.jpg" data-pretty="prettyPhoto[gallery1]"
                               class="portfolio-image">
                                <img src="${__static__}/img/works/9.png" alt=""/>
                                <div class="portfolio-overlay">
                                    <div class="thumb-info">
                                        <h5>Portfolio name</h5>
                                        <i class="icon-plus icon-2x"></i>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <!-- end portfolio item -->
                    <!-- portfolio item -->
                    <div class="portfolio-item grid design web">
                        <div class="portfolio">
                            <a href="${__static__}/img/works/big.jpg" data-pretty="prettyPhoto[gallery1]"
                               class="portfolio-image">
                                <img src="${__static__}/img/works/10.png" alt=""/>
                                <div class="portfolio-overlay">
                                    <div class="thumb-info">
                                        <h5>Portfolio name</h5>
                                        <i class="icon-plus icon-2x"></i>
                                    </div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <!-- end portfolio item -->
                </div>
            </div>
        </div>
    </div>
</section>
<div class="content-grids">
    <div class="container">
        <h4>三大入口</h4>
        <div class="wrap">
            <div class="grid">
                <a href="#"><img src="${__static__}/img/grids-img1.jpg" title="image-name"/></a>
                <h3>DESTINATIONS</h3>
                <p>Lorem ipsum dolor sit amet consectetur adiing elit. In volutpat luctus eros ac placerat. Quisque erat
                    metus facilisis non feu,aliquam hendrerit quam. Donec ut lectus vel dolor adipiscing tincnt.</p>
                <a class="button" href="#">More</a>
            </div>
            <div class="grid">
                <a href="#"><img src="${__static__}/img/grids-img2.jpg" title="image-name"/></a>
                <h3>NEWS & EVENTS</h3>
                <p>Lorem ipsum dolor sit amet consectetur adiing elit. In volutpat luctus eros ac placerat. Quisque erat
                    metus facilisis non feu,aliquam hendrerit quam. Donec ut lectus vel dolor adipiscing tincnt.</p>
                <a class="button" href="#">More</a>
            </div>
            <div class="grid last-grid">
                <a href="#"><img src="${__static__}/img/grids-img3.jpg" title="image-name"/></a>
                <h3>SUPPORT</h3>
                <p>Lorem ipsum dolor sit amet consectetur adiing elit. In volutpat luctus eros ac placerat. Quisque erat
                    metus facilisis non feu,aliquam hendrerit quam. Donec ut lectus vel dolor adipiscing tincnt.</p>
                <a class="button" href="#">More</a>
            </div>

            <div class="clear"></div>
        </div>
    </div>
</div>
<section id="work"> <!-- Work Links Section Start -->
    <h4>热门视频</h4>
    <div class="item">
        <a href="work-template.html"><img src="${__static__}/img/work/item.png" alt="image 1"></a>
        <!-- Image must be 400px by 300px -->
        <h3>Skies Of Spain</h3><!--Title-->
        <p>photography</p><!--Category-->
    </div><!--/item-->

    <div class="item">
        <a href="work-template.html"><img src="${__static__}/img/work/item2.png" alt="image 2"></a>
        <!-- Image must be 400px by 300px -->
        <h3>Beautiful Bahrain</h3><!--Title-->
        <p>photography</p><!--Category-->
    </div><!--/item-->

    <div class="item">
        <a href="work-template.html"><img src="${__static__}/img/work/item3.png" alt="image 3"></a>
        <!-- Image must be 400px by 300px -->
        <h3>Wild Stripes</h3><!--Title-->
        <p>photo manipulation</p><!--Category-->
    </div><!--/item-->

    <div class="item">
        <a href="work-template.html"><img src="${__static__}/img/work/item4.png" alt="image 4"></a>
        <!-- Image must be 400px by 300px -->
        <h3>Lazy Days</h3><!--Title-->
        <p>photo manipulation</p><!--Category-->
    </div><!--/item-->

    <div class="item">
        <a href="work-template.html"><img src="${__static__}/img/work/item5.png" alt="image 5"></a>
        <!-- Image must be 400px by 300px -->
        <h3>Trapped</h3><!--Title-->
        <p>photography</p><!--Category-->
    </div><!--/item-->

    <div class="item">
        <a href="work-template.html"><img src="${__static__}/img/work/item6.png" alt="image 6"></a>
        <!-- Image must be 400px by 300px -->
        <h3>Quad-Core</h3><!--Title-->
        <p>photography</p><!--Category-->
    </div><!--/item-->

    <div class="item">
        <a href="work-template.html"><img src="${__static__}/img/work/item7.png" alt="image 7"></a>
        <!-- Image must be 400px by 300px -->
        <h3>Retro Blast</h3><!--Title-->
        <p>illustration</p><!--Category-->
    </div><!--/item-->

    <div class="item">
        <a href="work-template.html"><img src="${__static__}/img/work/item8.png" alt="image 8"></a>
        <!-- Image must be 400px by 300px -->
        <h3>Gates Of The Sun</h3><!--Title-->
        <p>photography</p><!--Category-->
    </div><!--/item-->

    <div class="item">
        <a href="work-template.html"><img src="${__static__}/img/work/item9.png" alt="image 9"></a>
        <!-- Image must be 400px by 300px -->
        <h3>Winter Touch</h3><!--Title-->
        <p>photography</p><!--Category-->
    </div><!--/item-->

    <div class="item">
        <a href="work-template.html"><img src="${__static__}/img/work/item10.png" alt="image 10"></a>
        <!-- Image must be 400px by 300px -->
        <h3>Burn</h3><!--Title-->
        <p>photo manipulation</p><!--Category-->
    </div><!--/item-->

    <div class="clearfix"></div>
</section>
<!-- Work Links Section End -->

<!-- square start -->

<h4>校园广场</h4>
<div class="container">
    <div class="square">
        <div class="word">
            <li>
                <div class="word1">活动</div>
                <div class="word2">【好声音】第四届信工好声音冠军之战</div>
                <div class="word3">288</div>
                <div class="word4">1个月前</div>
            </li>
            <li>
                <div class="word1">活动</div>
                <div class="word2">【杂谈】现如今你还期待暑假吗？</div>
                <div class="word3">330</div>
                <div class="word4">1个月前</div>
            </li>
            <li>
                <div class="word1">活动</div>
                <div class="word2">【星青年】第七届星青年主题征集</div>
                <div class="word3">1,000+</div>
                <div class="word4">1个月前</div>
            </li>
            <li>
                <div class="word1">活动</div>
                <div class="word2">【说吧骚年】现如今你还期待过年吗？</div>
                <div class="word3">330</div>
                <div class="word4">1个月前</div>
            </li>
        </div>
        <div class="ad"><img src="${__static__}/img/landp_banner.jpg"></div>
        <div class="wdbtn">查看全部帖子</div>

    </div>
</div>

<!-- square end -->

<footer>
    <div class="container">
        <div class="row">
            <div class="span6 offset3">
                <ul class="social-networks">
                    <li><a href="#"><i class="icon-circled icon-bgdark icon-instagram icon-2x"></i></a></li>
                    <li><a href="#"><i class="icon-circled icon-bgdark icon-twitter icon-2x"></i></a></li>
                    <li><a href="#"><i class="icon-circled icon-bgdark icon-dribbble icon-2x"></i></a></li>
                    <li><a href="#"><i class="icon-circled icon-bgdark icon-pinterest icon-2x"></i></a></li>
                </ul>
                <p class="copyright">Copyright &copy; 2017.yxm.Company name All rights reserved.</p>
            </div>
        </div>
    </div>

</footer>
-->
<a href="#" class="scrollup"><i class="icon-angle-up icon-square icon-bgdark icon-2x"></i></a>
<!-- jQuery -->
<script src="${__static__}/js/jquery.js"></script>
<script src="${__static__}/js/jquery.carouFredSel-5.5.2.js"></script>
<script src="${__static__}/js/jquery.easing.1.3.js"></script>
<script src="${__static__}/js/jquery.form.js"></script>
<script src="${__static__}/js/scripts.js"></script>
<!-- nav -->
<script src="${__static__}/js/jquery.scrollTo.js"></script>
<script src="${__static__}/js/jquery.nav.js"></script>
<!-- localScroll -->
<script src="${__static__}/js/jquery.localscroll-1.2.7-min.js"></script>
<!-- bootstrap -->
<script src="${__static__}/js/bootstrap.js"></script>
<!-- prettyPhoto -->
<script src="${__static__}/js/jquery.prettyPhoto.js"></script>
<!-- Works scripts -->
<script src="${__static__}/js/isotope.js"></script>
<!-- flexslider -->
<script src="${__static__}/js/jquery.flexslider.js"></script>
<!-- inview -->
<script src="${__static__}/js/inview.js"></script>
<!-- animation -->
<script src="${__static__}/js/animate.js"></script>
<!-- twitter -->
<script src="${__static__}/js/jquery.tweet.js"></script>
<!-- contact form -->
<script src="${__static__}/js/validate.js"></script>
<!-- custom functions -->
<script src="${__static__}/js/custom.js"></script>

</body>
</html>