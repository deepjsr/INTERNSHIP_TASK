<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Details</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>


	<div class="container mt-5">

		<pre>
${name}
</pre>
	</div>
	<div class="container mt-5">
		<pre>
</pre>

<style>
* {
  box-sizing: border-box;
}

ul {
  list-style-type: none;
  padding: 0;
  margin: 0;
}

ul li {
  border: 1px solid #ddd;
  margin-top: -1px; /* Prevent double borders */
  background-color: #f6f6f6;
  padding: 12px;
}
</style>
</head>
<body>

<h2> Hi ${FormData.fname},
</h2>
<ul>
  <li>${FormData.goal}</li>
  <li>${FormData.roadmap}</li>
  
</ul>

	</div>

	<a class="btn btn-primary" href="/welcome" role="button"> Go Back to Home</a>
	
	<a class="btn btn-danger mt-2" href="/logout" role="button"> Logout</a>
	<div class="row">
	
	</div>

</body>
</html>
