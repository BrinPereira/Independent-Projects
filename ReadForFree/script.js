
  // Initialize Firebase
  var config = {
    apiKey: "AIzaSyCrRd96RAXEkLPmePWQTNrtBsCz183uWIA",
    authDomain: "readforfree-53c3a.firebaseapp.com",
    databaseURL: "https://readforfree-53c3a.firebaseio.com",
    projectId: "readforfree-53c3a",
    storageBucket: "readforfree-53c3a.appspot.com",
    messagingSenderId: "21540896444"
  };
  firebase.initializeApp(config);
	

// script for image sliders
var slideIndex = 1;
showSlides(slideIndex);

// Next/previous controls
function plusSlides(n) {
  showSlides(slideIndex += n);
}

// Thumbnail image controls
function currentSlide(n) {
  showSlides(slideIndex = n);
}

function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndex = 1} 
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none"; 
  }
  for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block"; 
  dots[slideIndex-1].className += " active";
}

// loginvalidation

