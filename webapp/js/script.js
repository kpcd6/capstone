
$(document).ready(function() {
	
	$('.close span, .button span, .tabs .nav li a span').css({opacity:'0'})
	$('.tabs .nav .selected a span').css({opacity:'1'})
	
	$('.close, .button').hover(function(){
		$(this).find('span').stop().animate({opacity:'1'})							
	}, function(){
		$(this).find('span').stop().animate({opacity:'0'})							
	})
	
	$('.tabs .nav li a').hover(function(){
		$(this).find('span').stop().animate({opacity:'1'})							
	}, function(){
		if (!$(this).parent().hasClass('selected')) {
			$(this).find('span').stop().animate({opacity:'0'})							
		}
	})
	
	//tabs
	tabs.init();
 });