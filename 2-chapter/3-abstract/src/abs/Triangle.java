/**
 * 
 */
package abs;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam   
 * @since Feb 13, 2017 11:05:14 AM
 * 
 */
public class Triangle extends Shape {
	private int base;
	private int height;
public void getInput() {
		
		System.out.println("Enter base:");
		this.base = scanner.nextInt();
		
		System.out.println("Enter height:");
		this.height = scanner.nextInt();
		
		scanner.close();
	}
public void printOutput() {
	System.out.println("Area of Triangle is:");
	System.out.println(1/2*(base*height));
}

}
