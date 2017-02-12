/**
 * 
 */
package pkg1;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam   
 * @since Feb 8, 2017 8:27:29 AM
 * 
 */
public class SamePkgDC {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.j=1;
		p.k=2;
		p.l=3;
		int add=p.j+p.k+p.l;
		System.out.println(add);
	}

}
