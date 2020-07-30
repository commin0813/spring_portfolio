// 

$(".menu").on("click", function(e) {
	e.preventDefault();
	$("body, html").animate({
		scrollTop : $($(this).attr('href')).offset().top
	}, 600);
});

//

var currentScrollTop = 0;
window.onload = function() {
	scrollController();
	$(window).on("scroll", function() {
		scrollController();
	});
	$(window).resize(function() {

		widthReload();

	});

}
function scrollController() {
	currentScrollTop = $(window).scrollTop();
	var winHeight = $(window).height();
	var docHeight = $(document).height();

	if (currentScrollTop > 300) {
		$("#topNav").addClass("fixed");
		$("#profile").addClass("fixed");
	} else {
		$("#topNav").removeClass("fixed");
		$("#profile").removeClass("fixed");
	}
	if (currentScrollTop < 300) {
		$("#a-intro").css("text-decoration", "none");
		$("#a-project").css("text-decoration", "none");
		$("#a-skill").css("text-decoration", "none");
	} else if (currentScrollTop + 100 > $("#intro").offset().top) {
		if (currentScrollTop + 100 > $("#project").offset().top) {
			if (currentScrollTop + 100 > $("#skill").offset().top) {
				if ((currentScrollTop + winHeight) +100 >= docHeight) {
					$("#a-intro").css("text-decoration", "none");
					$("#a-project").css("text-decoration", "none");
					$("#a-skill").css("text-decoration", "none");
					$("#a-contact").css("text-decoration", "underline");
				} else {

					$("#a-intro").css("text-decoration", "none");
					$("#a-project").css("text-decoration", "none");
					$("#a-skill").css("text-decoration", "underline");
					$("#a-contact").css("text-decoration", "none");
				}
			} else {
				$("#a-intro").css("text-decoration", "none");
				$("#a-project").css("text-decoration", "underline");
				$("#a-skill").css("text-decoration", "none");
				$("#a-contact").css("text-decoration", "none");
			}
		} else {
			$("#a-intro").css("text-decoration", "underline");
			$("#a-skill").css("text-decoration", "none");
			$("#a-project").css("text-decoration", "none");
			$("#a-contact").css("text-decoration", "none");
		}
	}

}

function widthReload() {
	if ($(window).width() < 625) { /* do something */
		$("#topNav").addClass("bg-dark");
		$("#three").removeClass("w-100");
		$("#two").addClass("w-100");
	} else {
		$("#topNav").removeClass("bg-dark");
		$("#two").removeClass("w-100");
		$("#three").addClass("w-100");
	}
}
