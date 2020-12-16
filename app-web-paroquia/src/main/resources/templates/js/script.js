$(window).scroll(function() {
			if ($(document).scrollTop() > 50) {
					$('.navbar').addClass('sticky');
					$('.logotipo img').addClass('sticky img');
			} else {
				$('.navbar').removeClass('sticky');
				$('.logotipo img').removeClass('sticky img');
			}
		});