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
 * @since Feb 15, 2017 11:44:40 AM
 * 
 */
public class ExampleInsert {

	public static void main(String[] args) throws SQLException {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:mysql://localhost:3306/jana-db";
		String user = "root";
		String password = "mysql";
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement statement = con.prepareStatement(
				"insert into department(department_name,Student_name,Course,Gender,dob,Date_of_join,Year_of_passout)values(?,?,?,?,?,?,?)");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your Department");
		String dep = scanner.nextLine();
		System.out.println("Enter your student name");
		String sname = scanner.nextLine();
		System.out.println("Enter your Course");
		String course = scanner.nextLine();
		System.out.println("Enter your Gender");
		String Gender = scanner.nextLine();
		System.out.println("Enter your Date_of_birth");
		String dob = scanner.nextLine();
		System.out.println("Enter your Date_of_join");
		int doj = scanner.nextInt();
		System.out.println("Enter your Year of passout");
		int year = scanner.nextInt();
		scanner.close();
		statement.setString(1, dep);
		statement.setString(2, sname);
		statement.setString(3, course);
		statement.setString(4, Gender);
		statement.setString(5, dob);
		statement.setInt(6, doj);
		statement.setInt(7, year);

		statement.executeUpdate();
		statement.close();
		con.close();
	}

}
