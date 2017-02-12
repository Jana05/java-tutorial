/**
 * 
 */
package overriding;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam
 * @since Feb 12, 2017 8:22:53 PM
 * 
 */
public class OverridingTest {

	public static void main(String[] args) {
		Base base = new Base();
		base.action();
		base = new SubClass1();
		base.action();
		base = new SubClass2();
		base.action();
	}

}
