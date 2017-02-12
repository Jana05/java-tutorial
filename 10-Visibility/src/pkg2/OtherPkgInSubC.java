/**
 * 
 */
package pkg2;

import pkg1.Parent;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam   
 * @since Feb 8, 2017 8:35:59 AM
 * 
 */
public class OtherPkgInSubC extends Parent {

	public static void main(String[] args) {
		OtherPkgInSubC c=new OtherPkgInSubC();	
		c.j=1;
		c.k=3;
		int add=c.j+c.k;
		System.out.println(add);
	}

}
