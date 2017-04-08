/**
 * Created by BlackZXK on 4/7/2017.
 */
$(function() {
    $(".chat-list").css("height",window.innerHeight/2);
    $(".contentin").css("height",window.innerHeight/3);

    $("#uplodeImg").change(function() {
        $("#showLocation").html($(this).val());
    });

    $('#gologin').on('hidden.bs.modal', function (e) {
        window.location.href="/user";
    })

    $("#dayChange").click(function() {
        window.location.href="/square/night";
    });
    $("#nightChange").click(function() {
        window.location.href="/square";
    });

    $("#send-msg").click(function() {
        if ($("#msg").val().trim() == "") {
            return;
        }
        $(".chat-list").append("<div class='chat row text-right'><div class='col-xs-10 col-md-10'><span>" + $("#msg").val() + "</span></div><div class='col-xs-2 col-md-2' ><img src='../../../static/img/user-big.jpeg' class='img-responsive img-circle'></div></div>");
        setTimeout("test()", 5000);
    });

    $("#send").click(function () {
        var title = $("#titlein").val();
        var content= editor.$txt.html();
        var str="addDayPost";
        if($("#change").html()=="黑夜"){
            str="addNightPost";
        }
        var data = {
            "title":  title,
            "content":content
        };
        $.ajax({
            url: "/square/"+str,
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

function test() {
    $(".chat-list").append("<div class='chat row'><div class='col-xs-2 col-md-2'><img src='../../../static/img/user-big.jpeg' class='img-responsive img-circle'></div><div class='col-xs-10 col-md-10'><span>我喜欢你</span></div></div>");
}