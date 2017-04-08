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

    $("#zxk").load("user/mineHomepage");

    $("#homepage").click(function () {
        $("#zxk").load("user/mineHomepage");
    });
});