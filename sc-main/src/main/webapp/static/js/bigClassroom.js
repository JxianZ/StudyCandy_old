$(function(){
	$(".myImg").mouseenter(function(){
		$(this).children(".up, .className").fadeOut();
        $(this).mouseleave(function(){
            $(this).children(".up, .className").fadeIn();
        });
	});
})