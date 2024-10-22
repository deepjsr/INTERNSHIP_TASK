<html>
<head>
<style>
* {
	box-sizing: border-box;
}


input[type=text], select, textarea {
	width: 100%;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	resize: vertical;
}

label {
	padding: 12px 12px 12px 0;
	display: inline-block;
}

input[type=submit] {
	background-color: #0f75b1;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	float: right;
}

input[type=submit]:hover {
	background-color: #45a049;
}

.container {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}

.col-25 {
	float: left;
	width: 25%;
	margin-top: 6px;
}

.col-75 {
	float: left;
	width: 75%;
	margin-top: 6px;
}

/* Clear floats after the columns */
.row::after {
	content: "";
	display: table;
	clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
	.col-25, .col-75, input[type=submit] {
		width: 100%;
		margin-top: 0;
	}
}
</style>
</head>
<body>
	<h2>Welcome to DAKR Solutions Form</h2>
	<c:if test="${not empty successMsg}">
		<h4 style="color: green">${successMsg}</h4>
	</c:if>
	<c:if test="${not empty errorMsg}">
		<h4 style="color: red">${errorMsg}</h4>
	</c:if>

	<div class="container">
		<form action="submitDForm" method="post">
			<div class="row">
				<div class="col-25">
					<label for="fname">First Name</label>
				</div>
				<div class="col-75">
					<input type="text" id="fname" name="fname"
						placeholder="Your name.."  required>
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="lname">Last Name</label>
				</div>
				<div class="col-75">
					<input type="text" id="lname" name="lastname"
						placeholder="Your last name.." required>
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="goal">Goal</label>
				</div>
				<div class="col-75">
					<select id="goal" name="goal">
						<option value=""   disabled hidden selected>Select your goal</option>
						<option value="Frontend Developer">Front End Developer</option>
						<option value="Backend Developer">Back End Developer</option>
						<option value="Fullstack Developer">Full Stack Developer</option>
						<option value="Dev Ops Engineer">Full Stack Developer</option>
						<option value="Web 3 Developer">Web 3 Developer</option>
						<option value="AI-ML Reasearch">AI-ML ReaSearch</option>
						<option value="Data Scientiest">Data Science</option>
						<option value="Kubernetes">Kubernetes(K8) Expert</option>
					</select>
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="roadmap">Five-Year Road map</label>
				</div>
				<div class="col-75">
					<textarea id="roadmap" name="roadmap"
						placeholder="Write something.." style="height: 200px" ></textarea>
				</div>
			</div>
			<br>
			<div class="row">
				<input type="submit" value="Submit">
			</div>
		</form>
	</div>
</body>
</html>