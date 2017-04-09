/**
 * Created by Administrator on 2017/4/9.
 */
$(function () {
    $("#sendanswer").click(function () {
        var content = $("#answercontent").val();
        var questionId = $("#questionId").val();
        var data = {
            "answerContent":content,
            "questionId":questionId
        };
        $.ajax({
            url:"/QARoom/addAnswer",
            data:data,
            type:"POST",
            dataType:"json",
            async: false,
            success:function (r) {
                window.location.reload();
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                alert(XMLHttpRequest.status);
                alert(XMLHttpRequest.readyState);
                alert(textStatus);
            },
        });
    });
})



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

