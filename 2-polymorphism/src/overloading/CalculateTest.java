/**
 * 
 */
package overloading;
import static overloading.Calculate.*;

import java.util.Scanner;
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
        System.out.println("Sum="+add(a,b));
        
        System.out.println("Enter first name");
        String a1=scanner.next();
        System.out.println("Enter last name");
        String b1=scanner.next();
        System.out.println("Concatenate="+add(a1,b1));
        
        System.out.println("Enter value of a");
        float x=scanner.nextFloat();
        System.out.println("Enter value of b");
        float y=scanner.nextFloat();
        System.out.println("Sum="+add(x,y));
        
        System.out.println("Enter value of a");
        int x1=scanner.nextInt();
        System.out.println("Enter value of b");
        int y1=scanner.nextInt();
        System.out.println("Enter value of b");
        int z1=scanner.nextInt();
        System.out.println("Sum="+add(x1,y1,z1));
        scanner.close();
	}

}
