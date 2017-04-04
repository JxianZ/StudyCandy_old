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
        $(this).css("border","solid #8c8c8c 1px")
        $(this).find('.box-title').css("background-color","#d9534f");
    });
    $(".box").mouseout(function () {
        $(this).css("border","solid #c8c5ca 1px")
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