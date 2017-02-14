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
 * @since Feb 14, 2017 5:27:47 PM
 * 
 */
public class StudentMarkList {

	public static void main(String[] args) throws SQLException  {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		String password = "mysql";
		String user = "root";
		String url = "jdbc:mysql://localhost:3306/jana-db";
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from student_marklist");
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			System.out.println(rs.getInt(4));
			System.out.println(rs.getInt(5));
			System.out.println(rs.getInt(6));
			System.out.println(rs.getInt(7));
		}
		rs.close();
		statement.close();
		connection.close();
	}

}
