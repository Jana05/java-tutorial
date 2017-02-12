/**
 * 
 */

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam
 * @since Feb 5, 2017 11:47:12 AM
 * 
 * 
 */
public class Line {
	private int x2;
	private int y2;
	private int x1;
	private int y1;
	
	
	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	@Override
	public String toString() {
		return "Line [x2=" + x2 + ", y2=" + y2 + ", x1=" + x1 + ", y1=" + y1 + "]";
}

	public void calDistance() {
		
	 double distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	 System.out.println(distance);
		}
}
