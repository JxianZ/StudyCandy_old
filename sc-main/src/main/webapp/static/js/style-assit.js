/**
 * Created by toukajiang on 2017/3/28 0028.
 */

/*  square-button style */
$(function () {
   $("#square-more").mouseover(function () {
       $(this).css("background-color","#d16f80");
   }) ;
    $("#square-more").mouseout(function () {
        $(this).css("background-color","#f38094");
    }) ;
});

/* footer */
$(function () {
    var $height = $(window).height();
    if($height>$(document.body).height()){
        $("footer").css("position","fixed");
    }
    $("footer").css("top", $height-53.2);
});