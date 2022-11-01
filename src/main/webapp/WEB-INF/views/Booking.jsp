<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.audi{
margin-left:650px;

}
 label {
        display: inline-block;
        width: 150px;
         margin-bottom: 15px;
      }
      input[type="text"]{
      border:none;

background:rgba(76,70,70,0.91);
outline:none;
height:32px;
	color:rgba(120,204,204,0.91);
	font-size:16px;	
     width:325px 
      
     }
     input[type="date"]{
     
     width:150px;
     }
      select[name="From City"],[name="Destination City"],[name="Select Class"],[name="Number Of Passengers"]
{
border:none;

background:rgba(76,70,70,0.91);
outline:none;
height:35px;
	color:rgba(120,204,204,0.91);
	font-size:16px;	
}
select{
    width:330px;
}
</style>
</head>
<body class="bg-info"
	style="background-image:url('https://miro.medium.com/max/1400/1*yBW3ELIDyF-iPFQ9Rb9NTA.jpeg')">
	
	<h1 align="center" style="font-size: 80px ; font-style: italic">TIME TO TRAVEL</h1>
	<h2 align="center" style="font-size: 40px ; font-style: italic">FLIGHT BOOKING</h2>

	<div class="audi">
	<input type="radio" id="One-way">
	<label for="One-way">One-way</label>
	<input type="radio" id="Round Trip">
	<label for="Round Trip">Round Trip</label>
	<br>
	 
<label for="From City">From City:</label>
<select name="From City" id="From City">
<option value="Select City">Select City</option>
<option value="Hyderabad">Hyderabad</option>


<option value="Tirupati">Tirupati</option>
<option value="Mumbai">Mumbai</option>
<option value="Delhi">Delhi</option>
<option value="Chennai">Chennai</option>
<option value="Pune">Pune</option>

<option value="Bangalore">Bangalore</option>

</select>
<br>

<label for="Destination City">Destination City:</label>
<select name="Destination City" id="Destination City">
<option value="Select City">Select City</option>
<option value="Hyderabad">Hyderabad</option>


<option value="Tirupati">Tirupati</option>
<option value="Mumbai">Mumbai</option>
<option value="Delhi">Delhi</option>
<option value="Chennai">Chennai</option>
<option value="Pune">Pune</option>

<option value="Bangalore">Bangalore</option>
</select>

<br>

<label for="Select Class">Select Class:</label>
<select name="Select Class" id="Select Class">
<option value="Economy">Select Class</option>
<option value="Economy">Economy</option>
<option value="Premium Economy">Premium Economy</option>
<option value="Business">Business</option>
<option value="First Class">First Class</option>
</select>

<br>

<label for="Number Of Passengers">Number Of Passengers:</label>
<select name="Number Of Passengers" id="Number Of Passengers">
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
</select>

<br>
 <label for="Date Of journey">Date Of journey:</label>
  <input type="date" >
  <br>
 
  <input type="submit" value="Book"> 
  <input type="reset" value="Reset" >
  </div>

</body>
</html>