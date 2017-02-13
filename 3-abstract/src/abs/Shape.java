/**
 * 
 */
package abs;

import java.util.Scanner;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam   
 * @since Feb 13, 2017 9:31:45 AM
 * 
 */
public abstract class Shape {
	
	protected static Scanner scanner = new Scanner(System.in);

	public static void closeScanner(){
		scanner.close();
	}

	public abstract void getInput();
	public abstract void printOutput();
	
}
