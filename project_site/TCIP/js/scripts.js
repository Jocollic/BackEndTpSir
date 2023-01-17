/*!
* Start Bootstrap - Bare v5.0.8 (https://startbootstrap.com/template/bare)
* Copyright 2013-2022 Start Bootstrap
* Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-bare/blob/master/LICENSE)
*/
// This file is intentionally blank
// Use this file to add JavaScript to your project

(function ($) {
  $('nav li').click(function () {
    $(this).addClass('active').siblings('li').removeClass('active');
    $('section:nth-of-type(' + $(this).data('rel') + ')').stop().fadeIn(100, 'linear').siblings('section').stop().fadeOut(100, 'linear');
  });
})(jQuery);
(function ($) {
  $('#login').click(function () {
    $('section:nth-of-type(' + $(this).data('rel') + ')').stop().fadeIn(100, 'linear').siblings('section').stop().fadeOut(100, 'linear');
  });
})(jQuery);
