/**
 * 
 */
package overloading.constructor;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam   
 * @since Feb 12, 2017 9:15:06 PM
 * 
 */
public class ConstructorTest {

	public static void main(String[] args) {
		Constructor ref1 = new Constructor();
		System.out.println(ref1);
		System.out.println("--------------------");
		
		Constructor ref2 = new Constructor(1);
		System.out.println(ref2);
		System.out.println("--------------------");
		
		Constructor ref3 = new Constructor(10,20);
		System.out.println(ref3);
		System.out.println("--------------------");
		
		Constructor ref4 = new Constructor(1,2,3,4,1);
		System.out.println(ref4);
		System.out.println("--------------------");
	}

}
