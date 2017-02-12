/**
 * 
 */

/**
 * @author Vijayan Srinivasan
 * @since 05-Feb-2017 9:27:26 am
 * 
 */
public class Point { //extends Object { // All classes are sub class of Object

//	Default Constructor, Constructor has no return type
	 public Point(){
		
	}
	
	//Data Portion: Attributes, Field Variable, Properties
	private int x;
	private int y;
	
	public int getX() {  // Getter for X
		return x;
	}
	public void setX(int x) {  // Setter for X
		this.x = x;
	}
	public int getY() {  // Getter for Y
		return y;
	}
	public void setY(int y) {  // Setter for Y
		this.y = y;
	}
	
	//If toString not defined it will use from Object
	public String toString() {
		return "Point {x=" + x + ", y=" + y + "}";
	}

	//There is no action methods are added

}
