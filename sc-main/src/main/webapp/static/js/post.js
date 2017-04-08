/**
 * Created by BlackZXK on 4/5/2017.
 */
$(function() {

    $(".mybtn2").click(function() {
        $("#postContent").val($("#describe").html());
    });

    $(".mybtn1").click(function() {
        $("#postContent").val('');
    });

    $("#publish").click(function() {
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
