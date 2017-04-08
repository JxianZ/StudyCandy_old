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
            url: "/square/alluserpost",
            data: null,
            type: "POST",
            dataType: "json",
            success: function (r) {
                if(r.status==0) {
                    alert(r.info);
                    $("#zxk").load("mineHomepage.jsp",{"userpostlist":r.data});
                    alert(r.data);
                }
                else{
                    if(r.status==-1){
                        alert(r.info);
                        $("#").load("mineHomepage.jsp",{"userpostlist":r.data});
                    }
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                alert("Error");
            },
        });
    });
});