$(document).ready(function(){
if ($('li#technology').hasClass('active')) {
        $("div.instructor").css("display", "none");
		$("div.technology").fadeIn();
	}
if ($('li#instructor').hasClass('active')) {
        $("div.technology").css("display", "none");
		$("div.instructor").fadeIn();
	}

	$(".panel-menu > li").click(function(e){
		switch(e.target.id){
			case "technology":
				//change status & style menu
				$("#technology").addClass("active");
				$("#instructor").removeClass("active");
				//display selected division, hide others
				$("div.technology").fadeIn();
				$("div.instructor").css("display", "none");
			break;
			case "instructor":
				//change status & style menu
				$("#technology").removeClass("active");
				$("#instructor").addClass("active");
				//display selected division, hide others
				$("div.instructor").fadeIn();
				$("div.technology").css("display", "none");
			break;
		}
		//alert(e.target.id);
		return false;
	});
});