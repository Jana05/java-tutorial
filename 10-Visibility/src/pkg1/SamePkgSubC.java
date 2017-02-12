/**
 * 
 */
package pkg1;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam   
 * @since Feb 8, 2017 8:20:37 AM
 * 
 */
public class SamePkgSubC extends Parent {

	public static void main(String[] args) {
		SamePkgSubC sub=new SamePkgSubC();
		sub.j=1;
		sub.k=2;
		sub.l=3;
		int add=sub.j+sub.k+sub.l;
		System.out.println(add);
	}

}
