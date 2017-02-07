/**
 * 
 */

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam   
 * @since Feb 5, 2017 11:54:07 AM
 * 
 */
public class LineTest {
	public static void main(String[] args) {
		Line line =new Line();
		line.setX1(1);
		line.setY1(1);
		line.setX2(4);
		line.setY2(5);
		System.out.println(line);
		line.caldistance();
		}
}
