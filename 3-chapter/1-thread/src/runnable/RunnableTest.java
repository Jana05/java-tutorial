/**
 * 
 */
package runnable;


/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam   
 * @since Feb 14, 2017 8:28:54 AM
 * 
 */
public class RunnableTest {

	public static void main(String[] args) throws Exception {
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		
		//Sequential
		thread1.run();
		thread2.run();
		
		//Parallel
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		
		
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		//throw new Exception("Test");
		System.exit(0);
	}

}
