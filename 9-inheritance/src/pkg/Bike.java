/**
 * 
 */
package pkg;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam   
 * @since Feb 7, 2017 7:03:32 PM
 * 
 */
public class Bike extends Vehicle {

	
	public static void main(String[] args) {
		Bike bike =new Bike();
		bike.setBrand("Bajaj");
		bike.setColor("Black");
		bike.setModel("DTSi");
		bike.setSpeed(120);;
		System.out.println(bike);
		}
}
