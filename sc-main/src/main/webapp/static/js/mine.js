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

    $("#contentMainInner").load("user/mineHomepage",function () {
        $("#contentMainInner").fadeIn(200);
    });

    $("#homepage").click(function () {
        $("#contentMainInner").fadeOut(200);
        $("#contentMainInner").load("user/mineHomepage",function () {
            $("#contentMainInner").fadeIn(200);
        });
    });

    $("#course").click(function () {
        $("#contentMainInner").fadeOut(200);
        $("#contentMainInner").load("/classroom/ .content-main",function () {
            $("#contentMainInner").fadeIn(200);
        });
    });

    $("#course").click(function () {
        $("#contentMainInner").fadeOut(200);
        $("#contentMainInner").load("/classroom/ .content-main",function () {
            $("#contentMainInner").fadeIn(200);
        });
    });

    $("#note").click(function () {
        $("#contentMainInner").fadeOut(200);
        $("#contentMainInner").load("/selfstudy #masonry",function () {
            $("#contentMainInner").fadeIn(200);
        });
    });

    $(".left-list a").click(function () {
        $(".left-list a").removeClass("active");
        $(this).addClass("active");
    });
});