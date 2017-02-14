/**
 * 
 */
package thread;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam
 * @since Feb 14, 2017 8:15:02 AM
 * 
 */
public class SimpleThread extends Thread {
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			delay();
		}
	}

	public static void delay() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
	}

}
