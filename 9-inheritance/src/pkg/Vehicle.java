/**
 * 
 */
package pkg;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam   
 * @since Feb 7, 2017 6:44:53 PM
 * 
 */
public class Vehicle {

		private String brand;
		private String color;
		private String model;
		private int speed;

		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		@Override
		public String toString() {
			return "Vehicle [brand=" + brand + ", color=" + color + ", model=" + model + ", speed=" + speed + "]";
		}
		
		
}
