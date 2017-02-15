/**
 * 
 */
package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam
 * @since Feb 15, 2017 6:03:13 PM
 * 
 */
public class Example2 {

	public static void main(String[] args) throws SQLException {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		String password = "mysql";
		String url = "jdbc:mysql://localhost:3306/jana-db";
		String user = "root";
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement statement = con.prepareStatement(
				"insert into student_marklist (Student_name,Mark1,Mark2,Mark3,Mark4,Mark5) values(?,?,?,?,?,?)");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String sname = scanner.nextLine();
		System.out.println("Enter your Mark1");
		int mark1 = scanner.nextInt();
		System.out.println("Enter your Mark2");
		int mark2 = scanner.nextInt();
		System.out.println("Enter your Mark3");
		int mark3 = scanner.nextInt();
		System.out.println("Enter your Mark4");
		int mark4 = scanner.nextInt();
		System.out.println("Enter your Mark5");
		int mark5 = scanner.nextInt();
		statement.setString(1, sname);
		statement.setInt(2, mark1);
		statement.setInt(3, mark2);
		statement.setInt(4, mark3);
		statement.setInt(5, mark4);
		statement.setInt(6, mark5);
		scanner.close();
		statement.executeUpdate();
		statement.close();
		con.close();
	}

}
