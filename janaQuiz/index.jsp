<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Jana Quiz</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>
	<div id="header" class="header_img">
		<h2>Online Quiz System</h2>
		<div id="nav">
			<ul>
				<li><a href="home.jsp">Home</a></li>
				<li><a href="home.jsp">Make Quiz</a></li>
				<li><a href="home.jsp">Take Quiz</a></li>
				<li><a href="home.jsp">Ask Question</a></li>
				<li><a href="home.jsp">Contact</a></li>
				<li><a href="home.jsp">About</a></li>
			</ul>
		</div>
	</div>
	<div id="wrapper">

		<div id="main" class="logoClass">
			<h3>Login Form</h3>
			<div id="form">
			<div class="container">
				<form class="form-horizontal" action="authendication.jsp">
					<div class="form-group">
						<label class="control-label col-sm-2" for="email">Email:</label>
						<div class="col-sm-4">
							<input type="email" class="form-control"name="email" id="email"
								placeholder="Enter email">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="category">Category:</label>
						<div class="col-sm-4">
							<select name="category" class="form-control">
								<option>--Select a Category--</option>
								<option>Teacher</option>
								<option>Student</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="pwd">Password:</label>
						<div class="col-sm-4">
							<input type="password" class="form-control"name="pwd" id="pwd"
								placeholder="Enter password">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<div class="checkbox">
								<label><input type="checkbox"> Remember me</label>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-primary">Login</button>
							&nbsp;<a href="register.jsp">Register</a>
						</div>
					</div>
				</form>
			</div>
		</div>
		</div>
		<div id="footer">&copy All Rights reserved </div>
	</div>
</body>
</html>
