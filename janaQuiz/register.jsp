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
				<li><a href="Make.jsp">Make Quiz</a></li>
				<li><a href="Takequiz.jsp">Take Quiz</a></li>
				<li><a href="Ask.jsp">Ask Question</a></li>
				<li><a href="Contact.jsp">Contact</a></li>
				<li><a href="About.jsp">About</a></li>
			</ul>
		</div>
	</div>
	<div id="wrapper">

		<div id="main" class="logoClass">
			<h3>Registration Form</h3>
			<div id="form">
				<div class="container">
					<form class="form-horizontal" action="saveregister.jsp">
						<div class="form-group">
							<label class="control-label col-sm-2" for="user ">User
								name:</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" required="required"id="name" name="name"
									placeholder="Enter user name">
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-sm-2" for="category">Category:</label>
							<div class="col-sm-4">
								<select name="category" class="form-control"id="category"required="required">
									<option>--Select a Category--</option>
									<option>Teacher</option>
									<option>Student</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-2" for="email">Email:</label>
							<div class="col-sm-4">
								<input type="email" class="form-control" name="email"id="email"
									required="required" placeholder="Enter email">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-2" for="pwd">Password:</label>
							<div class="col-sm-4">
								<input type="password" class="form-control" name="pwd"id="pwd"
									placeholder="Enter password">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-2" for="email">Mobile
								no:</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" required="required"name="mobile"id="mobile"
									placeholder="Enter mobile number">
							</div>
						</div>

						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<input type="submit" class="btn btn-primary" value="Register">
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
		<div id="footer">&copy All Copy Rights reserved</div>
	</div>
</body>
</html>
