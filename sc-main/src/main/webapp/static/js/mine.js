/**
 * Created by BlackZXK on 4/9/2017.
 */
$(function () {
    $("#upload").click(function () {
        $('#uploadImg').click();
    });

    $("#uploadImg").change(function() {
        $("#showLocation").html($(this).val());
    });

    $("#homepage").click(function () {
        $.ajax({
            url: "/user/mineHomepage",
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
                        $("#").load("mineHomepage.jsp");
                    }
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                alert("Error");
            },
        });
    });
});