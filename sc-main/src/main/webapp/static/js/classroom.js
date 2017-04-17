/**
 * Created by Administrator on 2017/4/3.
 */
$(function () {
    var $divArr = $(".box");
    var styleArr = new Array("boxs1","boxs2","boxs3","boxs4","boxs5","boxs6","boxs7","boxs8","boxs9","boxs10");
    $($divArr).each(function () {
       $(this).attr('id',styleArr[parseInt(Math.random()*10)]);
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

    $('#gologin').on('hidden.bs.modal', function (e) {
        window.location.href="/user";
    })
});

$(function () {
    $("#upload").click(function () {
        $('#uplodeFile').click();
    });

    $("#uplodeFile").change(function() {
        $("#showLocation").html($(this).val());
    });
});

