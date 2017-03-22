<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE HTML>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>注册</title>
    <!-- css -->
    <link rel="stylesheet" type="text/css" href="${__static__}/css/regstyle.css">
</head>
<body>
<div class="page">
    <div class="header">
        <div><img src="${__static__}/img/logo-image.png"></div>
        <div>学糖</div>
    </div>

    <div class="body">
        <div class="regbody">
            <div class="reg_nav">
                <div id="nav1" class="nav_on" >1.基本信息</div>
                <div id="tri1" class="tri t_on" ></div>
                <div id="nav2">2.信息完善</div>
                <div id="tri2" class="tri t_off"></div>
                <div id="nav3">3.注册成功</div>
            </div>
            <div class="reg_tab">
                <div class="part1 on">
                    <div class="textlabel">
                        <div class="labeltext"><label>用户名</label></div>
                        <div class="labelinput"><input type="text" name="username" id="usernamein"></div>
                    </div>
                    <div class="textlabel_two">
                        <div class="labeltext"><label>密码</label></div>
                        <div class="labelinput"><input type="password" name="password" id="passwordin"></div>
                    </div>
                    <div class="asslabel">
                        字母，数字或者英文符号，最短8位，区分大小写
                    </div>
                    <div class="textlabel_two">
                        <div class="labeltext"><label>确认密码</label></div>
                        <div class="labelinput"><input type="password" name="passwordconfirm" id="password2in"></div>
                    </div>
                    <div class="asslabel">
                        请再次输入密码
                    </div>
                    <div class="textlabel">
                        <div class="labeltext"><label>邮箱</label></div>
                        <div class="labelinput"><input type="text" name="email" id="emailin"></div>
                    </div>
                    <div class="textlabel_two">
                        <div class="labeltext"><label>验证码</label></div>
                        <div class="labelinput"><input type="text" id="codeinput" style="width:118px;"></div>
                    </div>
                    <div class="rightlabel">
                        <div class="canv">
                            <div><canvas id="canvas" width="120" height="40"></canvas></div>
                            <div><a href="#" id="changeImg">换一张</a></div>
                        </div>
                    </div>
                    <div class="agreement">
                        <label id="agr"><input type="checkbox" value="" id="agr2"/>我同意并遵守<a href="#">《xxx协议》</a></label>
                    </div>
                    <div class="part1btn">
                        <div class="part1next" id="regnext">下一步</div>
                        <div class="part1now" id="regsnow">直接完成</div>
                    </div>
                </div>
                <div class="part2 off">
                    <div class="textlabel">
                        <div class="labeltext"><label>真实姓名</label></div>
                        <div class="labelinput"><input type="text" name="realname"></div>
                    </div>
                    <div class="textlabel sexra">
                        <div class="labeltext"><label>性别</label></div>
                        <div class="labelinput">
                            <label><input type="radio" name="usersex" value="male">&nbsp;男</label>
                            <label><input type="radio" name="usersex" value="female">&nbsp;女</label>
                        </div>
                    </div>
                    <div class="textlabel">
                        <div class="labeltext"><label>身份证号</label></div>
                        <div class="labelinput"><input type="text" name="usercode"></div>
                    </div>
                    <div class="textlabel">
                        <div class="labeltext"><label>手机号</label></div>
                        <div class="labelinput"><input type="text" name="phone"></div>
                    </div>
                    <div class="textlabel_two">
                        <div class="labeltext"><label>验证码</label></div>
                        <div class="labelinput" style="width:118px;"><input type="text" id="codeinput" name="username" style="width:118px;"></div>
                        <div class="labelsend">获取验证码</div>
                    </div>
                    <div class="textlabel">
                        <div class="labeltext"><label>学校</label></div>
                        <div class="labelinput">
                            <select></select>
                            <select style="margin-right:0;"></select>
                        </div>
                    </div>
                    <div class="rightlabel">
                        <select></select>
                    </div>
                    <div class="textlabel">
                        <div class="labeltext"><label>专业</label></div>
                        <div class="labelinput"><input type="text" name="major"></div>
                    </div>
                    <div class="textlabel">
                        <div class="labeltext"><label>学号</label></div>
                        <div class="labelinput"><input type="text" name="stdid"></div>
                    </div>
                    <div class="line2"></div>
                    <div class="part1btn">
                        <div class="part1next" id="regreturn">上一步</div>
                        <div class="part1now" id="regcfm">完成注册</div>
                    </div>
                </div>
                <div class="part3 off">
                    <div class="sucre">
                        <div class="srimg"><img src="${__static__}/img/icons/suc.png"></div>
                        <div class="srmsg">恭喜xxx用户，您已注册成功</div>
                    </div>
                    <div class="part3btn">
                        <div><a href="/user/mine">个人主页</a></div>
                    </div>
                    <div class="recom">
                        <div class="retitle">推荐课程</div>
                        <div class="relesson">
                            <div>
                                <div class="relessontitle">XX系</div>
                                <div class="relessons1">课程名</div>
                                <div class="relessons2">简介xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</div>
                            </div>
                            <div></div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="reg_cd">
                &nbsp;&nbsp;这里是广告呀
            </div>
        </div>
    </div>
    <div class="footer">
        企业合作 | 人才招聘 | 联系我们 | 常见问题 | 意见反馈 | Copyright&copy;2017.JxianZ.Company name All Rights Reserved.
    </div>
</div>
<script type="text/javascript" src="${__static__}/js/jquery.js"></script>
<script>
    var code="";
    /**生成一个随机数**/
    function randomNum(min,max){
        return Math.floor( Math.random()*(max-min)+min);
    }
    /**生成一个随机色**/
    function randomColor(min,max){
        var r = randomNum(min,max);
        var g = randomNum(min,max);
        var b = randomNum(min,max);
        return "rgb("+r+","+g+","+b+")";
    }
    drawPic();
    document.getElementById("changeImg").onclick = function(e){
        e.preventDefault();
        drawPic();
    }

    /**绘制验证码图片**/
    function drawPic(){
        var canvas=document.getElementById("canvas");
        var width=canvas.width;
        var height=canvas.height;
        var ctx = canvas.getContext('2d');
        ctx.textBaseline = 'bottom';

        /**绘制背景色**/
        ctx.fillStyle = randomColor(180,240); //颜色若太深可能导致看不清
        ctx.fillRect(0,0,width,height);
        /**绘制文字**/
        code="";
        var str = 'ABCEFGHJKLMNPQRSTWXY123456789';
        for(var i=0; i<4; i++){
            var txt = str[randomNum(0,str.length)];
            ctx.fillStyle = randomColor(50,160);  //随机生成字体颜色
            ctx.font = randomNum(15,40)+'px SimHei'; //随机生成字体大小
            var x = 10+i*25;
            var y = randomNum(25,45);
            var deg = randomNum(-45, 45);
            //修改坐标原点和旋转角度
            ctx.translate(x,y);
            ctx.rotate(deg*Math.PI/180);
            ctx.fillText(txt, 0,0);
            //恢复坐标原点和旋转角度
            ctx.rotate(-deg*Math.PI/180);
            ctx.translate(-x,-y);
            code=code+txt;
        }
        /**绘制干扰线**/
        for(var i=0; i<8; i++){
            ctx.strokeStyle = randomColor(40,180);
            ctx.beginPath();
            ctx.moveTo( randomNum(0,width), randomNum(0,height) );
            ctx.lineTo( randomNum(0,width), randomNum(0,height) );
            ctx.stroke();
        }
        /**绘制干扰点**/
        for(var i=0; i<100; i++){
            ctx.fillStyle = randomColor(0,255);
            ctx.beginPath();
            ctx.arc(randomNum(0,width),randomNum(0,height), 1, 0, 2*Math.PI);
            ctx.fill();
        }
    }
    /** 注册按钮 **/

    $(function(){
        $("#regnext").click(function(){
            var username = $("#usernamein").val();
            var password = $("#passwordin").val();
            var passwordconfirm = $("#password2in").val();
            var email = $("#emailin").val();
            if($("#codeinput").val().toUpperCase()!=code){
                alert("验证码错误，请重试");
            }
            else if(!$("#agr2").is(':checked')){
                alert("您必须先同意我们的协议方可注册");
            }
            else if(password!=passwordconfirm){
                alert("密码不一致");
            }
            else if(username==""||password==""||passwordconfirm==""||email==""){
                alert("请江信息填写完整");
            }
            else if(password.length<8||passwordconfirm.length<8){
                alert("密码长度过短");
            }
            else{
                $(".part1").removeClass("on");
                $(".part1").addClass("off");
                $(".part2").removeClass("off");
                $(".part2").addClass("on");
                $("#nav1").removeClass("nav_on");
                $("#nav2").addClass("nav_on");
                $("#tri1").removeClass("t_on");
                $("#tri2").removeClass("t_off");
                $("#tri2").addClass("t_on");
            }
        });
    });
    $(function(){
        $("#regreturn").click(function(){
            $(".part1").removeClass("off");
            $(".part1").addClass("on");
            $(".part2").removeClass("on");
            $(".part2").addClass("off");
            $("#nav1").addClass("nav_on");
            $("#nav2").removeClass("nav_on");
            $("#tri1").addClass("t_on");
            $("#tri2").removeClass("t_on");
            $("#tri2").addClass("t_off");
        });
    });
    $(function(){
        $("#regsnow").click(function(){
            var username = $("#usernamein").val();
            var password = $("#passwordin").val();
            var passwordconfirm = $("#password2in").val();
            var email = $("#emailin").val();
            if($("#codeinput").val().toUpperCase()!=code){
                alert("验证码错误，请重试");
            }
            else if(!$("#agr2").is(':checked')){
                alert("您必须先同意我们的协议方可注册");
            }
            else if(password!=passwordconfirm){
                alert("密码不一致");
            }
            else if(username==""||password==""||passwordconfirm==""||email==""){
                alert("请江信息填写完整");
            }
            else if(password.length<9||passwordconfirm<9){
                alert("密码长度过短");
            }
            else{
                var data = {
                    "username": username,
                    "password": password,
                    "email":email
                };
                $.ajax({
                    url: "/user/register",
                    data: data,
                    type: "POST",
                    dataType: "json",
                    success: function (r) {
                        if(r.status==0) {
                            $(".part1").removeClass("on");
                            $(".part1").addClass("off");
                            $(".part3").removeClass("off");
                            $(".part3").addClass("on");
                            $("#nav1").removeClass("nav_on");
                            $("#nav3").addClass("nav_on");
                            $("#tri1").removeClass("t_on");
                            $("#tri2").removeClass("t_off");
                        }
                        else{
                            alert(r.info);
                        }
                    },
                    error: function (XMLHttpRequest, textStatus, errorThrown) {
                        alert(XMLHttpRequest.status);
                        alert(XMLHttpRequest.readyState);
                        alert(textStatus);
                    },
                });
            }
        });
    });
    $(function(){
        $("#regcfm").click(function(){
            $(".part2").removeClass("on");
            $(".part2").addClass("off");
            $(".part3").removeClass("off");
            $(".part3").addClass("on");
            $("#nav2").removeClass("nav_on");
            $("#nav3").addClass("nav_on");
            $("#tri2").removeClass("t_on");
        });
    });
</script>
</body>
</html>
