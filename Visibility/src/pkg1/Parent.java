/**
 * 
 */
package pkg1;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam
 * @since Feb 7, 2017 10:53:41 PM
 * 
 */
public class Parent {
	private int i;
	public int j;
	protected int k;
	int l;

	public static void main(String[] args) {
		Parent c=new Parent();
		c.i=1;
		c.j=2;
		c.k=3;
		c.l=4;
		
		int add = c.i +c. j +c. k +c. l;
		System.out.println("add" + add);
	}

	@Override
	public String toString() {
		return "Parent [i=" + i + ", j=" + j + ", k=" + k + ", l=" + l +  "]";
	}

}