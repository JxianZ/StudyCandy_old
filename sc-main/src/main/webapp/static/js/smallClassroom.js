$(function(){
	$(".myImg").mouseenter(function(){
		$(this).children(".up, .className").fadeOut();
	});

	$(".myImg").mouseleave(function(){
		$(this).children(".up, .className").fadeIn();
	});
})