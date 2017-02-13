/**
 * 
 */
package abs;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam
 * @since Feb 13, 2017 9:33:40 AM
 * 
 */
public class Circle extends Shape {

	private final double PI = 22d / 7d;
	private float radious;

	public void getInput() {
		System.out.println("Enter radious:");
		this.radious = scanner.nextFloat();
	}

	public void printOutput() {
		System.out.println("Area of Circle is:");
		System.out.println(PI * radious * radious);
	}

}


