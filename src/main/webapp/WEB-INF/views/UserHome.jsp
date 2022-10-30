<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
 
<style>
ul {
	list-style-type: none;
	margin: auto;
	padding: 0;
	overflow:hidden;
	background-color: #333;
	Width: 100%;
	height: auto;
}


li {
	float: right;
	border-left: 1px solid #bbb;
}

li[class="main"] {
	float: left;
	margin-left: 225px;
	color: white;
	border-left: none;
	font-size: 30px;
	margin-top: 6px;
}

li[class="logo"] {
	height: 45px;
	background:
		url('https://thumbs.dreamstime.com/z/v-letter-logo-wings-shadow-simple-vector-logo-v-letter-logo-wings-shadow-191135064.jpg');
	background-repeat: no-repeat;
	background-size: cover;
	float: left;
	width: 50px;
	font-size: 0px;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover {
	background-color: #111;
}

li a[class="logo1"]:hover {
	background: none;
}

li a[class="active"] {
	background-color: green;
}

* {
	box-sizing: border-box;
}

body {
	font-family: Verdana, sans-serif;
}

.mySlides {
	display: none;
}

img {
	vertical-align: middle;
	height: 420px;
}

/* Slideshow container */
.slideshow-container {
	max-width: 100%;
	position: relative;
	margin: auto;
}

/* Caption text */
.text {
	color: #f2f2f2;
	font-size: 15px;
	padding: 8px 12px;
	position: absolute;
	bottom: 8px;
	width: 100%;
	text-align: center;
}

/* Number text (1/3 etc) */
.numbertext {
	color: #f2f2f2;
	font-size: 12px;
	padding: 8px 12px;
	position: absolute;
	top: 0;
}

/* The dots/bullets/indicators */
.dot {
	height: 0px;
	width: 0px;
	margin: 0 2px;
	background-color: transparent;
	border-radius: 50%;
	display: inline-block;
	transition: background-color 0.6s ease;
}

.active {
	background-color: #717171;
}

/* Fading animation */
.fade {
	animation-name: fade;
	animation-duration: 1.5s;
}

@
keyframes fade {
	from {opacity: .4
}

to {
	opacity: 1
}

}

/* On smaller screens, decrease text size */
@media only screen and (max-width: 300px) {
	.text {
		font-size: 11px
	}
	


	
}
</style>
</head>
<body
	style="background-image: url('https://wallpaperboat.com/wp-content/uploads/2020/02/solid-red-06-920x518.jpg'); background-repeat: no-repeat; background-size: cover">
	<ul>
		<li class="logo"><a class="logo1" href="homepageopening">hi</a></li>
		<li class="main">VTALENT FLIGHT BOOKING</li>
	<li><a href="loginpageopening">Logout</a></li>
		<li><a href="aboutuspageopening">Tickets Booked</a></li>
		<li><a class="active" href="homepageopening">Home</a></li>
	    <li><a href="aboutuspageopening">Profile</a></li>
	</ul>
	<br>


	<div class="slideshow-container">

		<div class="mySlides fade">
			<div class="numbertext"></div>
			<img
				src="https://static-ssl.businessinsider.com/image/59444a03e592ed83018b4f56-1000/shutterstock419990866.jpg"
				style="width: 100%">
			<div class="text">Caption Text</div>
		</div>

		<div class="mySlides fade">
			<div class="numbertext"></div>
			<img src="https://wallpapercave.com/wp/wp4782897.jpg"
				style="width: 100%">
			<div class="text">Caption Two</div>
		</div>

		<div class="mySlides fade">
			<div class="numbertext"></div>
			<img src="https://images6.alphacoders.com/569/569032.jpg"
				style="width: 100%">
			<div class="text">Caption Three</div>
		</div>

		<div class="mySlides fade">
			<div class="numbertext"></div>
			<img
				src="https://cdn.pixabay.com/photo/2018/05/21/00/14/plane-3417178_1280.jpg"
				style="width: 100%">
			<div class="text">Caption Three</div>
		</div>

		<div class="mySlides fade">
			<div class="numbertext"></div>
			<img
				src="https://cdn.pixabay.com/photo/2017/07/01/21/52/ad-2462858_1280.jpg"
				style="width: 100%">
			<div class="text">Caption Three</div>
		</div>

	</div>
	<br>

	<div style="text-align: center">
		<span class="dot"></span> <span class="dot"></span> <span class="dot"></span>
		<span class="dot"></span> <span class="dot"></span>
	</div>

	<script>
		let slideIndex = 0;
		showSlides();

		function showSlides() {
			let i;
			let slides = document.getElementsByClassName("mySlides");
			let dots = document.getElementsByClassName("dot");
			for (i = 0; i < slides.length; i++) {
				slides[i].style.display = "none";
			}
			slideIndex++;
			if (slideIndex > slides.length) {
				slideIndex = 1
			}
			for (i = 0; i < dots.length; i++) {
				dots[i].className = dots[i].className.replace(" active", "");
			}
			slides[slideIndex - 1].style.display = "block";
			dots[slideIndex - 1].className += " active";
			setTimeout(showSlides, 4000); // Change image every 2 seconds
		}
	</script>
	<div>
		
		<button
			style="width: 100%; height: 100px; font-family: 'Brush Script MT', cursive; font-size: 50px; background-color: red">
			<a style="color: black" href="bookingpageopening">Search Flights
		</button>
		<br>
		<button
			style="width: 410px; height: 100px; font-family: 'Brush Script MT', cursive; font-size: 50px; background-color: red">
			<a style="color: black" href="offerspageopening">Offers
		</button>
		<button
			style="width: 410px; height: 100px; font-family: 'Brush Script MT', cursive; font-size: 50px; background-color: red">
			<a style="color: black" href="membershippageopening">Membership
				Details
		</button>
		<button
			style="width: 410px; height: 100px; font-family: 'Brush Script MT', cursive; font-size: 50px; background-color: red">
			<a style="color: black" href="adminloginpageopening">Admin Login
		</button>


	</div>
</body>
</html>
