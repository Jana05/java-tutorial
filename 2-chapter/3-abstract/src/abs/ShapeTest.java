/**
 * 
 */
package abs;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam
 * @since Feb 13, 2017 9:36:45 AM
 * 
 */
public class ShapeTest {

	public static void main(String[] args) {

		Shape shape = new Circle();
		shape.getInput();
		shape.printOutput();

		shape = new Rectangle();
		shape.getInput();
		shape.printOutput();
		
		shape = new Triangle();
		shape.getInput();
		shape.printOutput();

		Shape.closeScanner();
	}

}
