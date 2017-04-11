<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/3
  Time: 0:45
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>登录</title>
    <link href="${__static__}/css/main/bootstrap.min.css" rel="stylesheet">
    <link href="${__static__}/css/main/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/main/common.css">
    <link rel="stylesheet" type="text/css" href="${__static__}/css/classroom/QA.css">
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

<%@include file="../include/header.jsp"%>
<!--传递QuestionId -->
<textarea id="questionId" style="display: none">${question.id}</textarea>
<textarea id="questionUserId" style="display: none">${question.userId}</textarea>
<textarea id="bestanswer" style="display: none">${question.questionAnswerId}</textarea>
<textarea id="status" style="display: none">${question.questionStatus}</textarea>
<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">回答悬赏</h4>
            </div>
            <form>
                <div class="modal-body">
                    <div class="form-group">
                        <label>回答内容</label>
                        <textarea id="answercontent" class="form-control" placeholder="请自觉遵守互联网相关的政策法规，严禁发布色情、暴力、反动的言论。"></textarea>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button id="sendanswer" type="submit" class="btn btn-primary">回答</button>
                </div>
            </form>
        </div>
    </div>
</div>

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

<!-- content -->

<div class="container qa-detail-wrapper">
    <ul class="nav nav-pills">
        <li role="presentation" class="active"><a href="/QARoom">返回</a></li>
        <c:choose>
            <c:when test="${question.userId!=userId&&question.questionStatus==0}">
                <li role="presentation" id="addans" class="navbar-right active" ><button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-lg">回答</button></li>
            </c:when>
        </c:choose>
    </ul>
    <div class="qa-detail-body">
            <div class="qa-question-body">
                <div class="qa-detail-head">
                <div class="qa-detail-title">
                    <span>${question.questionReward}糖豆</span>
                    ${question.questionTitle}
                </div>
            </div>
            <div class="qa-detail-content">
                <p>${question.questionContent}</p>
            </div>
            <div class="qa-detail-user right">
                提问者：<span>${question.userId}</span>
            </div>
        </div>
                <div class="answer-nav" id="showallans">点击显示其他回答↓</div>
                    <div class="questioncontrol">

        <c:forEach items="${answerList}" var="answer">
                        <c:choose>
                            <c:when test="${question.questionStatus==1&&answer.id==question.questionAnswerId}">
                                <div class="qa-answer-body">
                                    <div class="qa-answer-content">
                                        <p>${answer.answerContent}</p>
                                    </div>
                                    <div class="qa-answer-user">
                                        <div class="right">
                                            回答者：<span>${userList[answer.userId].userNickname}</span>
                                        </div>
                                    </div>
                                </div>
                                <div class="answer-nav">所有回答</div>
                            </c:when>
                        </c:choose>
                    </c:forEach>
                        <c:forEach items="${answerList}" var="answer">
                            <c:choose>
                                <c:when test="${answer.id!=question.questionAnswerId}">
                                    <div class="qa-answer-body">
                                        <div class="qa-answer-content">
                                            <p>${answer.answerContent}</p>
                                        </div>
                                        <div class="qa-answer-user">
                                            <div class="right ans-accept hide">
                                                采纳回答<span style="display:none;">${answer.id}</span>
                                            </div>
                                            <div class="right">
                                                回答者：<span>${userList[answer.userId].userNickname}</span>
                                            </div>
                                        </div>
                                    </div>
                                </c:when>
                            </c:choose>
                        </c:forEach>
                    </div>
    </div>
</div>

<!-- content end -->

<%@include file="../include/footer.jsp"%>

<!--  js file  -->

<script src="${__static__}/js/jquery.js"></script>
<script src="${__static__}/js/masonry-docs.min.js"></script>
<script src="${__static__}/js/bootstrap.min.js"></script>
<script src="${__static__}/js/carousel.js"></script>
<script src="${__static__}/js/style-assit.js"></script>
<script src="${__static__}/js/masonry-docs.min.js"></script>
<script src="${__static__}/js/qa.js"></script>
<script type="text/javascript">
    $(function () {
        $("#addans").click(function () {
            if($("#useridtmp").html()==""){
                var c = confirm("登录后才能回答问题，是否现在登录？")
                if(c==true)
                    $(location).attr('href',"/user/login");
                else {
                    window.location.reload();
                }
            }
        });
        $("#sendanswer").click(function () {
            var content = $("#answercontent").val();
            var questionId = $("#questionId").val();
            var data = {
                "answerContent":content,
                "questionId":questionId
            };
            $.ajax({
                url:"/QARoom/addAnswer",
                data:data,
                type:"POST",
                dataType:"json",
                async: false,
                success:function (r) {
                    window.location.reload();
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    alert(XMLHttpRequest.status);
                    alert(XMLHttpRequest.readyState);
                    alert(textStatus);
                },
            });
        });
    })

$(function () {
   $(".ans-accept").click(function () {
       var answerId = $(this).children("span").html();
       var questionid=$("#questionId").html();
       var data={
           "answerId":answerId
       };
       $.ajax({
           url:"/QARoom/setBestAnswer/"+questionid,
           data:data,
           type:"POST",
           dataType:"JSON",
           success:function (r) {
               alert("ok "+r.info);
               window.location.reload();
           },
           error:function (r) {
               alert("error "+r.info);
           }
       });
   }) ;
});
</script>
</body>
</html>
