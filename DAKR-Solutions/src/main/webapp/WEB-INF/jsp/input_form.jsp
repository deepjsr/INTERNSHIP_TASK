<html>
<head>
<title>Simple Web Application</title>
</head>
<body>
	<center>
<h2>Welcome to DAKR Solutions Form</h2>
<c:if test="${not empty successMsg}">
<h4 style="color:green">${successMsg}</h4>
</c:if>
<c:if test="${not empty errorMsg}">
<h4 style="color:red">${errorMsg}</h4>
</c:if>

    <form action="submitForm" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>

        <label for="goal">Goal:</label>
        <input type="text" id="goal" name="goal" required><br><br>

        <label for="roadmap">Five-Year Roadmap:</label>
        <textarea id="roadmap" name="roadmap" rows="4" cols="50" required></textarea><br><br>

        <input type="submit" value="Submit">
    </form>
	</center>
</body>
</html>