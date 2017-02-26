/**
 * 
 */
package intro;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.mysql.jdbc.Driver;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam
 * @since Feb 14, 2017 8:49:39 AM
 * 
 */
public class ConnectToDB {
	

	public static void main(String[] args) throws SQLException  {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		String password = "mysql";
		String user = "root";
		String url = "jdbc:mysql://localhost:3306/jana-db";
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from employee");
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
		}
		rs.close();
		statement.close();
		connection.close();
	}


}
