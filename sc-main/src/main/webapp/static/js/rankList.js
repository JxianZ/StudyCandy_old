/**
 * Created by BlackZXK on 4/9/2017.
 */
$(function () {
    $("#search").click(function() {
        var str = $("#searchUsername").val();
        $("h4").each(function(){
            if($(this).html()==str){
                // window.location.href = "#" + $(this).attr("id");
                window.scrollY($(this).offset());
            }
        });
    });
});