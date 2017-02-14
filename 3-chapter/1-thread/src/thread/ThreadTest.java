/**
 * 
 */
package thread;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam   
 * @since Feb 14, 2017 8:16:17 AM
 * 
 */
public class ThreadTest {

	public static void main(String[] args) {

		// Sequential Execution
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			SimpleThread.delay();
		}
		
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			SimpleThread.delay();
		}
		
		
		SimpleThread thread1 = new SimpleThread();
		SimpleThread thread2 = new SimpleThread();
		
		//Sequential Execution
		thread1.run();
		thread2.run();
		
		//Parallel Execution
		thread1.start();
		thread2.start();
		
	}

}
