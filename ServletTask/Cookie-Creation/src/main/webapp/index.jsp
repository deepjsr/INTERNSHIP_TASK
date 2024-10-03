<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
    <style type="text/css">
    body{
	color:white;
	background-color: #212121
}
li{
	list-style: none;
}
.container{
	display:flex;
	flex-direction:column;
	align-items:center;
	justify-content:center;
}

.card{
	border:2px solid aliceblue;
	border-radius:5px;
	padding:3px;
	height:200px;
	width:300px;
	display: flex;
	flex-direction: column;
	justify-content:start;
	align-items: start;
}

.card input{
	margin-bottom:10px;
	}
	
	.card button{
	position:absolute;
	left:55%;
	
	}
    </style>
    <title>Create cookie and Read this</title>
</head>
<body>
    <div class="container">
    <h1>
    welcome to server
    </h1>
    <p>Login
    </p>
    <div class="card">
    <form method="post" action="CreateCookie">
    <ol>
    <li>
    <label>Name</label>
    <input type="text" name="name" placeholder="Type your name"> 
    </li>
    <li>
    <label>Email</label>
    <input type="email" name="email" placeholder="exmple@something.com"> 
    </li>
    <li>
    <hr>   
     <label >Password</label>
    <input type="password" name="password" >
    </li>
    </ol>
        <hr style="width:300px">
       <button type="submit">Sign Up</button>
     </form>
     </div>
    </div>
</body>
</html>
