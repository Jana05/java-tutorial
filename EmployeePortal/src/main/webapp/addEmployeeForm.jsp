<!DOCTYPE html>
<%@page import="scube.util.DBUtil"%>
<%@page import="scube.util.Designation"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.mysql.jdbc.Driver"%>
<html lang="en">
<head>
<title>Add Employee Form</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<center>
			<h1>Add Employee Form</h1>
		</center>
		<div class="panel panel-default">
			<div class="panel-body">
				<form class="form-horizontal" action=saveEmployees.jsp>

					<div class="form-group">
						<label for="" class="col-sm-3 control-label">First Name</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="firstName"
								placeholder="First Name" required="required">
						</div>
					</div>

					<div class="form-group">
						<label for="Last Name" class="col-sm-3 control-label">Last
							Name</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="lastName"
								placeholder="Last Name" required="required">
						</div>
					</div>

					<div class="form-group">
						<label for="dob" class="col-sm-3 control-label">Date Of
							Birth</label>
						<div class="col-sm-6">
							<input type="date" class="form-control" name="dob"
								placeholder="Dob" required="required">
						</div>
					</div>
					<div class="form-group">
						<label for="doj" class="col-sm-3 control-label">Date Of
							Join</label>
						<div class="col-sm-6">
							<input type="date" class="form-control" name="doj"
								placeholder="Doj" >
						</div>
					</div>
					<div class="form-group">
						<label for="doj" class="col-sm-3 control-label">Designation</label>
						<div class="col-sm-6">
							<select class="form-control" name="designationId" required="required">
								<option value="NONE">-SELECT-</option>
								<%
									ArrayList<Designation> designations = DBUtil.getDesignationList();
									for(int i=0;i<designations.size();i++){
										Designation designation = designations.get(i);%>
										<option value="<%=designation.getId()%>"><%=designation.getDesignationName()%></option>
									<%}%>
							</select>
						</div>
					</div>
					<!-- <div class="form-group">
						<label for="doj" class="col-sm-3 control-label">Reporting To</label>
						<div class="col-sm-6">
							<select class="form-control" name="reportingToId" required="required">
							<option value="NONE">-SELECT-</option>
								
							</select>
						</div>
					</div> -->
					<div class="form-group">
						<label for="Email" class="col-sm-3 control-label">Email</label>
						<div class="col-sm-6">
							<input type="email" class="form-control" name="email"
								placeholder="Email">
						</div>
					</div>
					<div class="form-group">
						<label for="pwd" class="col-sm-3 control-label">Password</label>
						<div class="col-sm-6">
							<input type="password" class="form-control" name="pwd"
								placeholder="pwd">
						</div>
					</div>
					<div class="form-group">
						<label for="status" class="col-sm-3 control-label">Status</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="status"
								placeholder="Status" required="required">
						</div>
					</div>

					<div calss="form-group">
						<label for="gender" class="col-sm-3 control-label"></label> <input
							type="submit" class="btn btn-info" value="Save">&nbsp;&nbsp;<input
							type="reset" class="btn btn-info" value="Cancel">


					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>