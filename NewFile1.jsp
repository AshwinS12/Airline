<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
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
.loginbox input[type="button"]{

margin-left:220px;
}
label{
color:black;
marign-top:10px;
}
h1{
color:black;
text-align:center;
}

</style>
</head>
<body class="bg-info"
	style="background-image:url('https://www.webintravel.com/wp-content/uploads/2020/05/den-belitsky-GettyImages-854673918-scaled.jpg');background-position: cover;background-repeat: no-repeat">
<a href = "registeringcustomer">Registration</a>
<div class="loginbox">
<h1>User Login</h1>
 
<form:form modelAttribute="UserObj" action="UserLoginRequest" method="post">
                <label for="name">Name:</label>
				<input type="Name" onkeypress="clearForm()" id="Name"
					name="Name" placeholder="Enter Name" required><br>
				
				 <label for="Password">Password:</label>
				<input type="Password" onkeypress="clearForm()" id="Password"
					name="Password" placeholder="Enter password" required><br>
				
             <button id="submitButton" type="submit">Submit</button>
                <button id="reset" type="reset">Refresh</button>
                <br>
                <p>New User?</p>
                <input type="button" value="registration">
                
                </form:form>
				</div>
</body>
</html>