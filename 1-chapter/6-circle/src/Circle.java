/**
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam
 * @since Feb 4, 2017 10:08:26 PM
 * 
 */
public class Circle {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		System.out.println("Enter radius :");
		String radius = br.readLine();
		int Radius = Integer.parseInt(radius);
		
		final double PI = 22d/7d;
		
		double area = PI * Radius * Radius;
		double circumference = 2 * PI * Radius;
		System.err.println("Circle area is:" + area);
		System.out.println("Circle circumference is :" + circumference);

	}

}
