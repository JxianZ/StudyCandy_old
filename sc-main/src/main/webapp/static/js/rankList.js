/**
 * Created by BlackZXK on 4/9/2017.
 */
$(function () {
    $("#search").click(function() {
        var str = $("#searchUsername").val();
        window.location.href = "#" + str;
    });
});