/**
 * Created by Administrator on 2017/4/3.
 */
$(function() {
    var $container = $('#masonry');
    $container.imagesLoaded(function() {
        $container.masonry({
            itemSelector: '.box',
            gutter: 20,
            isAnimated: true,
        });
    });
});
$(function () {
    $(".box").mouseover(function () {
        $(this).css("border","solid #FFFFFF 0");
        $(this).find('.box-title').css("background-color","#f38094");
    });
    $(".box").mouseout(function () {
        $(this).css("border","solid #c8c5ca 1px");
        $(this).find('.box-title').css("background-color","#ce8483");
    });
});
$(function () {
   $("#mynote").click(function () {
       if ($(".self-body>div:last-child").html()==""){
           $(".nav-pills>li:first-child").removeClass("active");
           $(".nav-pills>li:last-child").addClass("active");
           $(".self-body>div:first-child").hide();
           $(".self-body>div:last-child").show();
           $(".self-body>div:last-child").html("<h1>请先登录</h1>");
           heightListener();
       }
       else {
           $(".nav-pills>li:first-child").removeClass("active");
           $(".nav-pills>li:last-child").addClass("active");
           $(".self-body>div:first-child").hide();
           $(".self-body>div:last-child").show();
           heightListener();
       }
   });
   $("#othernote").click(function () {
       $(".nav-pills>li:first-child").addClass("active");
       $(".nav-pills>li:last-child").removeClass("active");
       $(".self-body>div:first-child").hide();
       $(".self-body>div:last-child").show();
       heightListener()();
   });
});

$(function () {
    $("#sendnote").click(function () {
        var notetitle = $("#notetitle").val();
        var notecontent= $("#notecontent").val();
        var data = {
            "noteTitle":  notetitle,
            "noteContent":notecontent
        };
        $.ajax({
            url: "/selfstudy/addNote",
            data: data,
            type: "POST",
            dataType: "json",
            success: function (r) {
                if(r.status==0) {
                    alert(r.info);
                }
                else{
                    if(r.status==-1){
                        alert(r.info);
                        window.location.href="/user";
                    }
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                    alert("Error");
            },
        });
    });
});