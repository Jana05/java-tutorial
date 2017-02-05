/**
 * 
 */

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam   
 * @since Feb 5, 2017 11:47:12 AM
 * 
 */
public class Line {
private int x;
private int y;
private int x1;
private int y1;
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
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
	return "Line [x=" + x + ", y=" + y + ", x1=" + x1 + ", y1=" + y1 + "]";
}

}
