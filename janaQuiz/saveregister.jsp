<%@page import="com.mysql.jdbc.Driver"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Form</title>
</head>
<body>
	<%
		String registerName = request.getParameter("name");
		String category = request.getParameter("category");
		String email = request.getParameter("email");		
		String password = request.getParameter("pwd");
		String mobile = request.getParameter("mobile");
		Driver driver = new Driver ();
		DriverManager.registerDriver(driver);
		String url = "jdbc:mysql://localhost:3306/jana-quiz";
		String user = "root";
		String pwd = "mysql";

		Connection connection = DriverManager.getConnection(url, user, pwd);
		PreparedStatement stmt = connection
				.prepareStatement("insert into qregister(name,email,password,mobile_no,category) values(?,?,?,?,?)");
		stmt.setString(1,registerName);
		stmt.setString(2,email);
		stmt.setString(3,password);
		stmt.setString(4,mobile);
		stmt.setString(5,category);
		stmt.executeUpdate();

		stmt.close();
		connection.close();
		
	%>
</body>
</html>