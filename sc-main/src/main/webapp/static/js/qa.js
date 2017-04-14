/**
 * Created by Administrator on 2017/4/9.
 */

/* QADetail Style Controller */
$(function () {

    if($("#status").html()==1) {
        $(".qa-question-body").addClass("sucbody");
        $(".qa-detail-title").children("span").html("问题已被解决");
    }

    if($("#useridtmp").html()==$("#questionUserId").html()){
        if($("#status").html()==0){
            $("#showallans").html("所有回答");
            $(".ans-accept").removeClass("hide");
        }
        else{
            $("#showallans").html("最佳答案");
        }
        $("#showallans").removeAttr('id',"showallans")
    }
    else {
        $(".questioncontrol").addClass("hide");
    }

   $("#showallans").click(function () {
       $(".questioncontrol").removeClass("hide");
       if($("#status").html()==0){
           $("#showallans").html("所有回答");
       }
       else{
           $("#showallans").html("最佳答案");
       }
       $("#showallans").removeAttr('id',"showallans")
   });

});
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
$(function(){
    $("#jian").click(function(){
        $("#he").val()==1||$("#he").val($("#he").val()-1);
    });
})
$(function(){
    $("#jia").click(function(){
        $("#he").val($("#he").val()-(-1));
    });
});

