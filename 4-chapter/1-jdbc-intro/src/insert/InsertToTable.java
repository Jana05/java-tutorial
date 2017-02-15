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
 * @since Feb 14, 2017 8:49:39 AM
 * 
 */
public class InsertToTable {

public static void main(String[] args) throws SQLException {
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		String password = "mysql";
		String url = "jdbc:mysql://localhost:3306/jana-db";
		String user = "root";
		Connection connection = DriverManager.getConnection(url, user, password);
		Scanner scanner = new Scanner(System.in);
		PreparedStatement statement = connection.prepareStatement("insert into employee (first_name, last_name, dob) values (?,?,?)");
		System.out.println("Enter firstName:");
		String firstName = scanner.nextLine();
		System.out.println("Enter lastName:");
		String lastName = scanner.nextLine();
		System.out.println("Enter dob (yyyy-mm-dd):");
		String dob = scanner.nextLine();
		
		scanner.close();
		
		
		statement.setString(1,firstName);
		statement.setString(2,lastName);
		statement.setString(3, dob);
		statement.executeUpdate();
		
		statement.close();
		connection.close();
	}


}
