<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
* {
	box-sizing: border-box;
}

body {
	font-family: Arial, Helvetica, sans-serif;
	background: lightblue;
}

/* Float four columns side by side */
.column {
	float: left;
	width: 25%;
	padding: 0 10px;
}

.row {
	margin-top: 20%;
	display: flex;
	justify-content: center;
}
.row-button {
	margin-top: 10%;
	display: flex;
	justify-content: center;
}

/* Clear floats after the columns */
.row:after {
	content: "";
	display: table;
	clear: both;
}

body {
	margin: 0;
}

ul.topnav {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

ul.topnav li.left {
	float: left;
	background-color: #04AA6D;
	display: block;
	padding: 14px 16px;
}

ul.topnav li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

ul.topnav li a:hover:not(.active) {
	background-color: #111;
}

ul.topnav li a {
	background-color: #04AA6D;
}

ul.topnav li.right {
	float: right;
}

/* Style the counter cards */
.card {
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
	padding: 16px;
	text-align: center;
	background-color: #f1f1f1;
}

button {
	background-color: #dd2032;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

button:hover {
	background-color: #111;
}

button a {
	text-decoration: none;
	color: aliceblue;
	font-size: x-large;
}
}
</style>
</head>
<body>

	<ul class="topnav">
		<li class="left">Welcome!! to DAKR Solution App</li>

		<li class="right"><a href="admincontrol">Admin Section</a></li>
	</ul>

	<div class="row">
		<div class="column">
			<div class="card">
				<h3>Fill your goals and roadmap</h3>
				<p>
					<a href="inputForm">Fill your data</a>
				</p>
			</div>
		</div>
		<div class="column">
			<div class="card">
				<h3>Fill your Own Enterprises Data</h3>
				<p>
					<a href="enterpriseForm">Enterprises Form</a>
				</p>
			</div>
		</div>
	</div>
	<div class="row-button">
		<button>
			<a href="/login">logout</a>
		</button>
	</div>
</body>
</html>


