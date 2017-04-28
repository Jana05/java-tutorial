<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<html>
<head>
<title>Authendication</title>
</head>
<body>
	<%
		String email = request.getParameter("email");
		String category = request.getParameter("category");
		String password = request.getParameter("pwd");
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:mysql://localhost:3306/jana-quiz";
		String user = "root";
		String pwd = "mysql";
		Connection con = DriverManager.getConnection(url, user, pwd);
		PreparedStatement stmt = con
				.prepareStatement("select * from qregister where email=? and category=? and password=?");
		stmt.setString(1, email);
		stmt.setString(2, category);
		stmt.setString(3, password);
		//System.out.println(email+":"+category+":"+password);
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			//System.out.println("Success....");
			response.sendRedirect("Home.jsp");
		}
		else{
			//System.out.println("Failed.... ");
			response.sendRedirect("index.jsp");
		}
		rs.close();
		stmt.close();
		con.close();
		//System.out.println("Closed....");
		
	%>

</body>
</html>