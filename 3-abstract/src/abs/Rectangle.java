/**
 * 
 */
package abs;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam   
 * @since Feb 13, 2017 9:38:38 AM
 * 
 */
public class Rectangle extends Shape {

	private int lenghth;
	private int bredth;
	
	public void getInput() {
		
		System.out.println("Enter lenghth:");
		this.lenghth = scanner.nextInt();
		
		System.out.println("Enter bredth:");
		this.bredth = scanner.nextInt();
		
		//scanner.close();
	}

	public void printOutput() {
		System.out.println("Area of Rectangle is:");
		System.out.println(lenghth * bredth);
	}

}
