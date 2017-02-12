/**
 * 
 */
package overloading.constructor;

import java.util.Arrays;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam
 * @since Feb 12, 2017 9:12:05 PM
 * 
 */
public class Constructor {

	private int[] values;

	public Constructor() {
		System.out.println("Default Consturctor");
		this.values = new int[1];
		this.values[0] = 0;
	}
	
	public Constructor(int num) {
		System.out.println("Single Arg Consturctor");
		this.values = new int[1];
		this.values[0] = num;
	}
	
	public Constructor(int num1, int num2) {
		System.out.println("Double Arg Consturctor");
		this.values = new int[2];
		this.values[0] = num1;
		this.values[1] = num2;
	}

	public Constructor(int ... nums) {
		System.out.println("Variable Arg Consturctor");
		this.values = nums;
	}
	
	@Override
	public String toString() {
		return "Constructor {values=" + Arrays.toString(values) + "}";
	}


	
}
