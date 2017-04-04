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
   $("#othernote").click(function () {
       if ($(".self-body>div:last-child").html()==""){
           $(".nav-pills>li:first-child").removeClass("active");
           $(".nav-pills>li:last-child").addClass("active");
           $(".self-body>div:first-child").toggle();
           $(".self-body>div:last-child").toggle();
           $(".self-body>div:last-child").html("<h1>hehe</h1>");
           heightListener();
       }
       else {
           $(".nav-pills>li:first-child").removeClass("active");
           $(".nav-pills>li:last-child").addClass("active");
           $(".self-body>div:first-child").toggle();
           $(".self-body>div:last-child").toggle();
           heightListener();
       }
   });
   $("#mynote").click(function () {
       $(".nav-pills>li:first-child").addClass("active");
       $(".nav-pills>li:last-child").removeClass("active");
       $(".self-body>div:first-child").toggle();
       $(".self-body>div:last-child").toggle();
       heightListener()();
   });
});

$(function () {
    $("#sendnote").click(function () {
        var title = $("#notetitle").val();
        var content= $("#notecontent").val();
        var data = {
            "noteTitle":  title,
            "noteContent":content
        };
        $.ajax({
            url: "/selfstudy/addNote",
            data: data,
            type: "POST",
            dataType: "json",
            success: function (r) {
                if(r.status==0) {
                    window.location.reload();
                }
                else{
                    alert(r.info);
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                    alert("Error");
            },
        });
    });
});