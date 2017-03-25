<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" type="text/css" href="${__static__}/css/campusSquare.css">
</head>
<body>
	<div class="header">
		<div class="navbar1">
			<div class="logo">
				<ul>
					<li><img src="${__static__}/img/logo.png">&nbsp;</li>
					<li>学糖</li>
				</ul>
			</div>
			<div class="navbar1_inner">
				<ul>
					<li><a href="#">大教室</a>&nbsp;&nbsp;</li>
					<li><a href="#">辅导室</a>&nbsp;&nbsp;</li>
					<li><a href="#">校园广场</a>&nbsp;&nbsp;</li>
					<li><a href="#">学霸名人堂</a>&nbsp;&nbsp;</li>
					<li><a href="#"><img src="logo.png"></a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="content">
		<div class="ad"></div>
		<div class="switch">
			<a href="#">最新</a>&nbsp;&nbsp;
			<a href="#">最热</a>
		</div>
		<div class="content_inner">
			<div class="post">
				<h2>题目</h2>
				<h5>标签</h5>
				<h6 style="margin-right: 20px;">发布时间</h6>
				<h6>回复&nbsp;</h6>
				<h6>00&nbsp;</h6>
			</div>
			<div class="post">
				<h2>题目</h2>
				<h5>标签</h5>
				<h6 style="margin-right: 20px;">发布时间</h6>
				<h6>回复&nbsp;</h6>
				<h6>00&nbsp;</h6>
			</div>
			<div class="post">
				<h2>题目</h2>
				<h5>标签</h5>
				<h6 style="margin-right: 20px;">发布时间</h6>
				<h6>回复&nbsp;</h6>
				<h6>00&nbsp;</h6>
			</div>
		</div>
		<div class="pageNavbar">
			<ul class="pageNavbar_inner">
				<li><a href="#">首页</a></li>
				<li>&nbsp;&nbsp;</li>
				<li><a href="#">上一页</a></li>
				<li>&nbsp;&nbsp;</li>
				<li>
					<ul class="pageList">
						<li><a href="#">1</a></li>
						<li>&nbsp;&nbsp;</li>
						<li><a href="#">2</a></li>
						<li>&nbsp;&nbsp;</li>
						<li><a href="#">3</a></li>
						<li>&nbsp;&nbsp;</li>
						<li><a href="#">4</a></li>
						<li>&nbsp;&nbsp;</li>
						<li><a href="#">5</a></li>
					</ul>
				</li>
				<li>&nbsp;&nbsp;</li>
				<li><a href="#">下一页</a></li>
				<li>&nbsp;&nbsp;</li>
				<li><a href="#">尾页</a></li>
			</ul>
		</div>
		<a href="ha.html" style="clear:both;margin-left:200px;">发帖</a>
	<div class="haha">
		<div><label>标题&nbsp;<input type="text" name="title" id="titlein"></label></div>
		<div><label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea name="content" id="contentin"> </textarea></label></div>
		<div class="hahasub" id="hahabtn">提交</div>
	</div>
	</div>
	<div class="footer">
		<div class="footer_inner">
			<ul>
				<li><a href="#">企业合作</a>&nbsp;|&nbsp;</li>
				<li><a href="#">人才招聘</a>&nbsp;|&nbsp;</li>
				<li><a href="#">联系我们</a>&nbsp;|&nbsp;</li>
				<li><a href="#">常见问题</a>&nbsp;|&nbsp;</li>
				<li><a href="#">一键反馈</a>&nbsp;|&nbsp;</li>
				<li>Copyright&copy;2017.JxianZ.Company name All Rights Reserved.</li>
			</ul>
		</div>
	</div>
	<script type="text/javascript" src="${__static__}/js/jquery.js"></script>
	<script type="text/javascript">
		$(function () {
			$("#hahabtn").click(function () {
				$(".haha").toggle(600);
				var title = $("titlein").val();
				var content= $("contentin").val();
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
                            $(".haha").toggle(100);
                            window.location.reload();
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
            });
        });
	</script>
</body>
</html>