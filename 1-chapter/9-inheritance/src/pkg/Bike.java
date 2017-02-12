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
public class Bike extends Vehicle{
	
	private boolean kickStart;
	private boolean electricStart;


	public boolean isKickStart() {
		return kickStart;
	}

	public void setKickStart(boolean kickStart) {
		this.kickStart = kickStart;
	}

	public boolean isElectricStart() {
		return electricStart;
	}

	public void setElectricStart(boolean electricStart) {
		this.electricStart = electricStart;
	}

	@Override
	public String toString() {
		return "Bike [kickStart=" + kickStart + ", electricStart=" + electricStart + ", brand()=" + getBrand()
				+ ", color()=" + getColor() + ", model()=" + getModel() + ", speed()=" + getSpeed() + "]";
	}
	
	
}
