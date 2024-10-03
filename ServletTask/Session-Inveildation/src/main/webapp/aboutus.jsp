<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body><!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Basic Navbar</title>
<style>
body {
	margin: 0;
	font-family: Arial, sans-serif;
}

.navbar {
	background-color: #333;
	overflow: hidden;
}

.navbar a {
	float: left;
	display: block;
	color: white;
	text-align: center;
	padding: 14px 20px;
	text-decoration: none;
}

.navbar a:hover {
	background-color: #ddd;
	color: black;
}

.navbar a.active {
	background-color: #4CAF50;
	color: white;
}

@media screen and (max-width: 600px) {
	.navbar a {
		float: none;
		width: 100%;
		text-align: left;
	}
}
</style>
</head>
<body>
	<%
	String myName = (String) session.getAttribute("name_key");
	%>
	<div class="navbar">
		<a href="profile.html" class="active">Home</a> <a href="#services">Services</a>
		<a href="aboutus.jsp">About Us</a> <a href="#contact">Contact</a>
		<button>
			<a href="logout">Logout</a>
		</button>
	</div>

	<div style="padding: 20px;">
		<h1>
			About us
			<%=  myName %></h1>
	</div>

</body>
</html>

</html>