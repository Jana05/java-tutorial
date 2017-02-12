/**
 * 
 */
package Overloading;
import java.util.Scanner;

import static Overloading.Calculate.*;
/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam
 * @since Feb 12, 2017 6:33:37 PM
 * 
 */
public class CalculateTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter value of a");
        int a=scanner.nextInt();
        System.out.println("Enter value of b");
        int b=scanner.nextInt();
        System.out.println("Sum=1"+add(a,b));
        
        System.out.println("Enter first name");
        String a1=scanner.next();
        System.out.println("Enter last name");
        String b1=scanner.next();
        System.out.println("Concatenate="+add(a1,b1));
        scanner.close();
	}

}
