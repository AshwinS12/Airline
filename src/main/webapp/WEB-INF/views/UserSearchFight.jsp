<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
ul {
	list-style-type: none;
	margin: auto;
	padding: 0;
	overflow: hidden;
	background-color: #333;
	Width: 100%;
	position: fixed;
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

.audi {
	margin-left: 650px;
}

label {
	display: inline-block;
	width: 150px;
	margin-bottom: 15px;
}

input[type="text"] {
	border: none;
	background: rgba(76, 70, 70, 0.91);
	outline: none;
	height: 32px;
	color: rgba(120, 204, 204, 0.91);
	font-size: 16px;
	width: 325px
}

input[type="date"] {
	width: 150px;
}

select[name="From City"], [name="Destination City"], [name="Select Class"],
	[name="Number Of Passengers"] {
	border: none;
	background: rgba(76, 70, 70, 0.91);
	outline: none;
	height: 35px;
	color: rgba(120, 204, 204, 0.91);
	font-size: 16px;
}

select {
	width: 330px;
}
</style>
</head>
<body class="bg-info"
	style="background-image: url('https://miro.medium.com/max/1400/1*yBW3ELIDyF-iPFQ9Rb9NTA.jpeg')">
	<ul>
		<li class="logo"><a class="logo1" href="homepageopening">hi</a></li>
		<li class="main">VTALENT FLIGHT BOOKING</li>
		<li><a href="aboutuspageopening">Logout</a></li>
			<li><a href="loginpageopening">Tickets Booked</a></li>
		<li><a href="homepageopening">Home</a></li>
		<li><a href="loginpageopening">Profile</a></li>

	</ul>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>

	<h2 align="center" style="font-size: 40px; font-style: italic">Search
		Flights Here</h2>
	<div class="audi">
		<form action="">
			<input type="radio" id="One-way"> <label for="One-way">One-way</label>
			<input type="radio" id="Round Trip"> <label for="Round Trip">Round
				Trip</label> <br> <label for="From City">From City:</label> <select
				name="From City" id="From City">
				<option value="Select City">Select City</option>
				<option value="Hyderabad">Hyderabad</option>


				<option value="Tirupati">Tirupati</option>
				<option value="Mumbai">Mumbai</option>
				<option value="Delhi">Delhi</option>
				<option value="Chennai">Chennai</option>
				<option value="Pune">Pune</option>

				<option value="Bangalore">Bangalore</option>

			</select> <br> <label for="Destination City">Destination City:</label> <select
				name="Destination City" id="Destination City">
				<option value="Select City">Select City</option>
				<option value="Hyderabad">Hyderabad</option>


				<option value="Tirupati">Tirupati</option>
				<option value="Mumbai">Mumbai</option>
				<option value="Delhi">Delhi</option>
				<option value="Chennai">Chennai</option>
				<option value="Pune">Pune</option>

				<option value="Bangalore">Bangalore</option>
			</select> <br> <label for="Select Class">Select Class:</label> <select
				name="Select Class" id="Select Class">
				<option value="Economy">Select Class</option>
				<option value="Economy">Economy</option>
				<option value="Premium Economy">Premium Economy</option>
				<option value="Business">Business</option>
				<option value="First Class">First Class</option>
			</select> <br> <label for="Number Of Passengers">Number Of
				Passengers:</label> <select name="Number Of Passengers"
				id="Number Of Passengers">
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
				<option value="7">7</option>
				<option value="8">8</option>
				<option value="9">9</option>
				<option value="10">10</option>
			</select> <br> <label for="Date Of journey">Date Of journey:</label> <input
				type="date"> <br> <input type="submit" value="Book">
			<input type="reset" value="Reset">
		</form>
	</div>

</body>
</html>