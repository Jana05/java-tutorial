/**
 * 
 */
package runnable;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam
 * @since Feb 14, 2017 8:28:15 AM
 * 
 */
public class MyThread implements Runnable {

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
