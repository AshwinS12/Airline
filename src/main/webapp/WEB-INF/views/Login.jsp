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
  Width:100%;
  position:fixed;
}

li {
  float: right;
  border-left: 1px solid #bbb;
}
li[class="main"]{

 float: left;
 margin-left:400px;
 color: white;
  border-left:none;
  font-size:30px;
  margin-top:6px;
}
li[class="logo"]{
height:45px;
background: url('https://thumbs.dreamstime.com/z/v-letter-logo-wings-shadow-simple-vector-logo-v-letter-logo-wings-shadow-191135064.jpg');
background-repeat:no-repeat;
background-size:cover;
float: left;
width:50px;
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
 
 
 .loginbox{
width:500px;
height:400px;
background:transparent;
color:#fff;
top:20%;
left:5%;
position:absolute;
box-sizing:border-box;
padding:0px 30px;
}
.loginbox p{
margin-left:220px;
padding:0;
font-size:bold;

color:black;
}
.loginbox input{
width:100px;
margin-bottom:20px;
}
.loginbox input[type="Password"],input[type="Name"]
{
border:none;
border-bottom:1px solid #fff;
background:transparent;
outline:none;
height:40px;
color:#fff;
font-size:16px;
width:100%;
}

label{
color:black;
marign-top:10px;
}
h1{
color:black;
text-align:center;
}
li a[class="active"]{
    background-color: green;
}
</style>
</head>
<body class="bg-info"
style="background-image:url('https://www.webintravel.com/wp-content/uploads/2020/05/den-belitsky-GettyImages-854673918-scaled.jpg');background-position: cover;background-repeat: no-repeat">
<ul>
<li class="logo"><a class="logo1" href="homepageopening">hi</a></li>
<li class="main">VTALENT FLIGHT BOOKING</li>
 <li><a href="aboutuspageopening">About</a></li>
  <li><a  href="homepageopening">Home</a></li>
  <li><a class="active" href="loginpageopening">Login</a></li>
 
</ul>
<br>
<div class="loginbox">
<h1>User Login</h1>
<form  modelAttribute="UserObj" action="UserLoginRequest" method="post">
                <label for="name">Name:</label>
<input type="Name" id="Name"
name="Name" placeholder="Enter Name" onblur="clearForm()"><p id="errorMsg" style="color: red;"></p><br>

<label for="Password">Password:</label>
<input type="password" onblur="clearForm()" id="Password"
name="Password" placeholder="Enter password" required><span id="errorMsg1" style="color: red;"></span><br>

             <input id="submit" type="submit" onclick="return loginValidation()">
                <input id="reset" type="reset">
                <br>
                <p>New User?</p>
           


<button
style="height: 30px; width: 75px;font-style: italic;margin-left:220px">
<a href="registerpageopening">Register</a>
</button>



</form>

</div>
<script type="text/javascript">
function loginValidation() {
var employeeId = document.getElementById("Name").value;
var mobileNumber = document.getElementById("Password").value;
var type = document.getElementById("type").value;
if (employeeId == null || employeeId == "") {
document.getElementById("errorMsg").innerHTML = "please enter EmployeeId";
return false;
} else if (mobileNumber == null || mobileNumber == "") {
document.getElementById("errorMsg1").innerHTML = "please enter Password";
return false;
}

else{

return true;
}
function clearForm() {
document.getElementById("errorMsg").innerHTML = "";
document.getElementById("errorMsg1").innerHTML = "";

}
</script>


</body>
</html>

