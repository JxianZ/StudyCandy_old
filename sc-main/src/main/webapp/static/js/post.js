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
        if ("username" == "username") {
            $("#describe").html($("#postContent").val());
            $(".modal").modal('toggle');
        }else{
            //增加一行
        }
    });
});
