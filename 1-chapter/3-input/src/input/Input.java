/**
 * 
 */
package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam   
 * @since Feb 4, 2017 5:32:41 PM
 *
 */
public class Input {

	public static void main(String[] args) throws IOException { // throws IOException is related to exception handling we can read later
		InputStreamReader reader = new InputStreamReader(System.in); // To create Buffered Reader we need reader object
		BufferedReader br = new BufferedReader(reader); // br is an object of BufferedReader needed to get input
		
		System.out.println("Enter your First Name :");
		String firstName = br.readLine(); // to read a line readLine() method on br is used 
		
		System.out.println("Enter your Last Name :");
		String lastName = br.readLine(); // to read a line readLine() method on br is used 
		System.out.println("Full Name = "+firstName + " " + lastName);
	}

}

