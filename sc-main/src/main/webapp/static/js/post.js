/**
 * Created by BlackZXK on 4/5/2017.
 */
$(function() {
    //判断当前的登录用户是不是文章的作者
    if ("username" == "username") {
        $(".mybtn2").toggle();
    }

    $(".mybtn2").click(function() {
        $("#postContent").val($("#describe").html());
    });

    $(".mybtn").click(function() {
        $("#postContent").val('');
    });

    $("#publish").click(function() {
        /*if ("username" == "username") {
            $("#describe").html($("#postContent").val());
            $(".modal").modal('toggle');
        }else{
            //增加一行
        }*/
        var postId = $("#postId").val();
        var content = $("#postContent").val();
        var data = {
            "commentContent":content,
            "postId": postId,
        };
        $.ajax({
            url: "/square/addcomment",
            data: data,
            type: "POST",
            dataType: "json",
            success: function (r) {
                if(r.status==0) {
                    window.location.reload();
                }
                else{
                    if(r.status==-1){
                        window.location.href="/user";
                        alert(r.info);
                    }
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                if(XMLHttpRequest.status==0){
                    alert("error");
                }
            },
        });
    });
});
