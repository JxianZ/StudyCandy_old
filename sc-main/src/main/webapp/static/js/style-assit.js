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

function heightListener() {
    var $height = $(window).height();
    if($height>$(document.body).height()+100){
        $("footer").css("position","fixed");
        $("footer").css("top", $height-53.2);
    }
    else{
        $("footer").css("position","static");
        $("footer").css("top", $(document.body).height()-53.2);
    }
}

$(function () {
    $(document).ready(heightListener());
    $(window).resize(heightListener());
});
