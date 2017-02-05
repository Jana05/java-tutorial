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
private int x2;
private int y2;
private int x1;
private int y1;
public int getX() {
	return x2;
}
public void setX(int x) {
	this.x2 = x;
}
public int getY() {
	return y2;
}
public void setY(int y) {
	this.y2 = y;
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
	return "Line [x=" + x2 + ", y=" + y2 + ", x1=" + x1 + ", y1=" + y1 + "]";
}

}
