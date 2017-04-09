/**
 * Created by Administrator on 2017/4/9.
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

