/**
 * 
 * @author Vijayan Srinivasan
 * @since Feb 4, 2017 1:25:25 PM
 *
 */
public class Circle {

	public static void main(String[] args) {
		
		final int INT_PI = 22/7; //By default all numerical literlas are considered as int
		System.out.println("value of PI:"+ INT_PI );
		
		//INT_PI=30; not allowed because INT_PI is a constant
		
		final float FLOAT_PI = 22f/7f; //To make it as float add f in the end e.g. 22f
		System.out.println("value of PI:"+ FLOAT_PI );
		
		final double DOUBLE_PI = 22d/7d; 
		//To make it as double add d in the end e.g. 22d
		System.out.println("value of PI:"+ DOUBLE_PI );
		
		int radious = 7; // int is a data type, radious is a variable or identifier
		System.out.println("radious:" + radious);
		double area = DOUBLE_PI * radious * radious;
		System.out.println("area of circle:" + area);
		
		// area = 1; is allowed because area is a variable
		
	}
	
}
