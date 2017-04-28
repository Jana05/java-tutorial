/**
 * 
 */
package scube.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Driver;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam   
 * @since Mar 16, 2017 6:32:22 PM
 * 
 */
public class DBUtil {

	public static void saveData(String query,Object... params) throws SQLException{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:mysql://localhost:3306/eportal";
		String user = "root";
		String pwd = "mysql";
		
		Connection connection = DriverManager.getConnection(url, user, pwd);
		PreparedStatement stmt = connection.prepareStatement(query);
		for(int i=0;i<params.length;i++){
			stmt.setObject(i+1, params[i]);
		}
		stmt.executeUpdate();
		stmt.close();
		connection.close();
	}
	
	public static ArrayList<Designation> getDesignationList() throws SQLException{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:mysql://localhost:3306/eportal";
		String user = "root";
		String pwd = "mysql";
		
		Connection connection = DriverManager.getConnection(url, user, pwd);
		PreparedStatement stmt = connection.prepareStatement("select * from designations");
		ResultSet resultSet =  stmt.executeQuery();
		
		ArrayList<Designation> designationList = new ArrayList<Designation>();
		while(resultSet.next()){
			Integer id = resultSet.getInt("id");
			String designationName = resultSet.getString("designation_name");
			String description = resultSet.getString("description");
			
			Designation designation = new Designation();
			designation.setId(id);
			designation.setDesignationName(designationName);
			designation.setDescription(description);
			
			designationList.add(designation);
		}
		
		stmt.executeUpdate();
		stmt.close();
		connection.close();
		return designationList;
	}
	
	
}
