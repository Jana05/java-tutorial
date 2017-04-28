<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Designation Form</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">

		<center>
			<h1>Add Designation Form</h1>
		</center>
		<div class="panel panel-default">
			<div class="panel-body">
				<form class="form-horizontal" action=saveDesignation.jsp>
					<div class="form-group">
						<label for="" class="col-sm-3 control-label">Designation
							Name</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="designationName"
								placeholder="Designation  Name">
						</div>
					</div>

					<div class="form-group">
						<label for="description" class="col-sm-3 control-label">Description</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="description"
								placeholder="Description">
						</div>
					</div>
					<div calss="form-group">
						<label for="gender" class="col-sm-3 control-label"></label> <input
							type="submit" class="btn btn-info" value="Add">

					</div>

				</form>
			</div>
		</div>
	</div>
</body>
</html>