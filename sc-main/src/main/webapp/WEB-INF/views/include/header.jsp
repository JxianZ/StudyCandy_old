<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/30 0030
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
                <a class="navbar-brand navbar-logo" href="/index"><img src="${__static__}/img/logo.png"></a>
                <a class="navbar-brand navbar-logo" href="/index">学糖</a>
            </div>
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-ul">
                    <li><a href="/classroom/">大教室</a></li>
                    <li><a href="/QARoom">辅导室</a></li>
                    <li><a href="/selfstudy">自习室</a></li>
                    <li><a href="/square">校园广场</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <form class="navbar-form navbar-left">
                        <div class="row">
                            <div class="col-xs-9">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="搜索...">
                                </div>
                            </div>
                            <div class="col-xs-2">
                                <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
                            </div>
                        </div>
                    </form>
                    <!--
                    TODO check and replace -->
                    <c:choose>
                        <c:when test="${userId!=null}">
                            <li><a id="haha" href="#" class="navbar-head haha"  data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><img class="img-circle" src="${__static__}/img/user-test.jpg"></a>
                                <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                                    <li><a href="#">消息</a></li>
                                    <li><a href="/user">个人中心</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="/user/logout">退出登录</a></li>
                                </ul>
                            </li>
                        </c:when>
                        <c:otherwise>
                            <li><a class="navbar-login" href="user/login">登录</a></li>
                            <li><a class="navbar-login" href="user/register">注册</a></li>
                        </c:otherwise>
                    </c:choose>
                </ul>
            </div>
        </div>
    </div>
</nav>