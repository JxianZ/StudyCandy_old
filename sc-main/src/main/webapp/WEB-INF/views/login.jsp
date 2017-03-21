<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE HTML>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <title>Login</title>
    <!-- css -->
    <link rel="stylesheet" type="text/css" href="${__static__}/css/loginstyle.css">
</head>
<body>
<div class="page">
    <div class="header">
        <div><img src="${__static__}/img/logo-image.png"></div>
        <div>学糖</div>
        <div class="l-r">注册</div>
    </div>
    <div class="lrbody">
        <div class="bodymain">
            <div class="loginbody">
                <div class="lgform">
                    <div class="lgword">登录</div>
                    <div class="lginput">
                        <div class="lglogo">
                            <img src="${__static__}/img/userlogo.gif">
                        </div>
                        <div class="lgtext">
                            <input type="text" name="username" value="请输入用户名" id="userinput">
                        </div>
                    </div>
                    <div class="lginput">
                        <div class="lglogo">
                            <img src="${__static__}/img/passwordlogo.gif">
                        </div>
                        <div class="lgtext" id="lgpswd">
                            <input type="text" name="password" value="请输入密码" id="passwordinput">
                        </div>
                    </div>
                    <div class="lgasi">
                        <div class="rmb">
                            <label id="rmblabel1"><input type="checkbox" value="" id="rmblabel2"/>记住账号</label>
                        </div>
                        <div class="found">忘记密码</div>
                    </div>
                    <div class="lgconfirm">
                        <div class="confirmbtn" id="lgsubmit">登录</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="cd">
        <div class="more">
            <div class="moreleft">推荐课程：</div>
            <div class="moreright">查看更多<span>>>></span></div>
        </div>
    </div>
    <div class="footer">
        企业合作 | 人才招聘 | 联系我们 | 常见问题 | 意见反馈 | Copyright&copy;2017.JxianZ.Company name All Rights Reserved.
    </div>
</div>
<script type="text/javascript" src="${__static__}/js/jquery.js"></script>
<script type="text/javascript">

    //登录功能 start

    $(function () {
        $("#lgsubmit").click(function () {
            var username = $("#userinput").val();
            var password = $("#passwordinput").val();
            if (check(username, password)) {
                var data = {
                    "username": username,
                    "password": password
                };
                $.ajax({
                    url: "/user/login",
                    data: data,
                    type: "POST",
                    dataType: "json",
                    success: function () {
                        alert("success");
                    },
                    error: function (XMLHttpRequest, textStatus, errorThrown) {
                        alert(XMLHttpRequest.status);
                        alert(XMLHttpRequest.readyState);
                        alert(textStatus);
                    },
                });
            }
            else {
                alert("用户名或密码不合法");
            }
        });
    });
    //检查用户名密码是否合法
    function check(username, password) {
        if (username.length > 0 && password.length > 5)return true;
        else return false;
    }
    //登录功能 end

    //登录框清除文字 start

    $(function () {
        var text = "请输入用户名";
        $("#userinput").focus(function () {
            $(this).val() != text || $(this).val("");
        });
        $("#userinput").blur(function () {
            $(this).val() != "" || $(this).val(text);
        });
    });
    $(function () {
        var text = "请输入密码";
        $("#passwordinput").focus(function () {
            $(this).val("");
            $(this).attr('type', 'password');
        });
        $("#passwordinput").blur(function () {
            $(this).val() != "" || $(this).val(text);
            $(this).val() != text || $(this).attr('type', 'text');
        });
    });
    //登录框清除文字 end

    //登录框一些按钮，手型的效果 start
    $(function () {
        $("#lgsubmit").mouseover(function () {
            $(this).css("background-color", "#0c6271");
            $(this).css("cursor", "pointer");
        });
        $("#lgsubmit").mouseout(function () {
            $(this).css("background-color", "#1498b0");
            $(this).css("cursor", "default");
        });
        $("#rmblabel1").mouseover(function () {
            $(this).css("cursor", "pointer");
        });
        $("#rmblabel1").mouseout(function () {
            $(this).css("cursor", "default");
        });
        $("#rmblabel2").mouseover(function () {
            $(this).css("cursor", "pointer");
        });
        $("#rmblabel2").mouseout(function () {
            $(this).css("cursor", "default");
        });
    })
    //登录框一些按钮，手型的效果 end
</script>
</body>
</html>