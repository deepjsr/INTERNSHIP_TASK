<!DOCTYPE html>
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

.navbar button {
	float: right;
	background: red;
	border-radius: 5px;
	height: fit-content;
	display: block;
	color: white;
	text-align: center;
	padding: 14px 20px;
	text-decoration: none;
	display: block;
	border-radius: 5px;
}

.navbar a:hover {
	background-color: #ddd;
	color: black;
}

.navbar a.active {
	background-color: #4CAF50;
	color: white;
}
}
</style>
</head>
<body>
	<%
	String myName = (String) session.getAttribute("name_key");
	%>
	<%
	String myEmail = (String) session.getAttribute("email_key");
	%>
	<div class="navbar">
		<a href="#home" class="active">Home</a> <a href="#services">Services</a>
		<a href="aboutus.jsp">About Us</a> <a href="#contact">Contact</a>
		<button>
			<a href="#contact">Logout</a>
		</button>
	</div>

	<div style="padding: 20px;">
		<h1>
			Welcome
			<%=myName%></h1>
		<h2>
			Your email
			<%=myEmail%></h2>
	</div>

</body>
</html>
