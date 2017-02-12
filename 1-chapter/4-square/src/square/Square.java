/**
 * 
 */
package square;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam
 * @since Feb 4, 2017 7:59:58 PM
 * 
 */
public class Square {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		System.out.println("Enter side value :");
		String sideStr = br.readLine();
		int side = Integer.parseInt(sideStr);
		int area = side * side;
		int circumference = 4 * side;
		System.out.println("The square area is:" + area);
		System.out.println("The circumference is:" + circumference);
	}

}
