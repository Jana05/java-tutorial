/**
 * 
 */
package rectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam
 * @since Feb 4, 2017 9:23:27 PM
 * 
 */
public class Rectangle {

	public static void main(String[] args) throws IOException {

		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		System.out.println("Enter rectangle width :");
		String w = br.readLine();
		System.out.println("Enter height :");
		String h = br.readLine();
		int a = Integer.parseInt(w);
		int b = Integer.parseInt(h);
		int area = a * b;
		int circumference = 2 * (a + b);
		System.out.println("Area :" + area);
		System.out.println("Circumference :" + circumference);
	}

}
