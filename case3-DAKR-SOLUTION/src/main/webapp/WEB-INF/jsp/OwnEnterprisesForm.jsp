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
	<h2> Own Enterprises Form</h2>
	<c:if test="${ successMsg}">
		<h4 style="color: green">${successMsg}</h4>
	</c:if>
	<c:if test="${ errorMsg}">
		<h4 style="color: red">${errorMsg}</h4>
	</c:if>
	<div class="container">
		<form action="eTForm" method="post">
			<div class="row">
				<div class="col-25">
					<label for="fname"> Name</label>
				</div>
				<div class="col-75">
					<input type="text" id="fname" name="fname"
						placeholder="Your first name..">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="lname">Last Name</label>
				</div>
				<div class="col-75">
					<input type="text" id="lname" name="lname"
						placeholder="Your last name..">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="ecount">Employee Count</label>
				</div>
				<div class="col-75">
					<input type="text" id="ecount" name="ecount"
						placeholder="Enter Employee Count..">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="clientTarget">Client Targets</label>
				</div>
				<div class="col-75">
					<input type="text" id="clientTarget" name="clientTarget"
						placeholder="Client Targets..">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="projectQuality">Project Quality</label>
				</div>
				<div class="col-75">
					<input type="text" id="projectQuality" name="projectQuality"
						placeholder="Project Quality..">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="clientSatisfaction">Client Satisfaction</label>
				</div>
				<div class="col-75">
					<textarea id="clientSatisfaction" name="clientSatisfaction"
						placeholder="Write something  about your satisfaction .." style="height: 200px"></textarea>
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
</body>
</html>