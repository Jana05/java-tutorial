/**
 * 
 */
package Overloading;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam
 * @since Feb 12, 2017 4:31:00 PM
 * 
 */
public class Calculate {
	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	public static float add(float a,float b){
		return a+b;
	}
	public static String add(String a,String b){
		return a+b;
	}
}
