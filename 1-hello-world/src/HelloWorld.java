/**
 * There are 3 types of comments<br/>
 * 1. <b>//</b> - Single-Line Comment<br/>
 * 2. <b>/*</b> - Paragraph Comment<br/>
 * 3. <b>/**</b> - Java Doc Comment<br/>
 * 
 * <p>List of keywords can be found <a href="http://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html">here</a></p>
 * 
 * <p>In this program <code>public</code>, <code>class</code>, <code>static</code>, <code>void</code> are keywords</p>
 * 
 * <p><code>String</code> and <code>System</code> are Java defined classes</p>
 * 
 * <p><code>HelloWorld</code> is our user defined class</p>
 * 
 * <p><code>HelloWorld</code>, <code>main</code>, <code>args</code>, <code>out</code> are identifiers</p>
 * 
 * <p>Identifiers are used to name 1. Class, 2. Method, 3. Argument / Parameter, 4. Variable / Constant / Attribute of a class<p>
 * 
 * <ul>
 * 	<li><code>HelloWorld</code> - Class Name</li>
 *  <li><code>main</code> - Method Name</li>
 *  <li><code>args</code> - Argument / Parameter for Method</li>
 *  <li><code>out</code> - Attribute of System class and it is a constant</li>
 *  <li><code>println</code> - Method name in out object which is of type PrintStream</li>
 * </ul>
 * 
 * <p><code>"Hello World"</code> is a String litteral</p>
 * 
 * 
 * <p><code>[]</code> is indication of Array</p>
 * 
 * <p><code>{</code> is indication of body of a class/method/block starts</p>
 * 
 * <p><code>{</code> is indication of body of a class/method/block ends</p>
 * 
 * @author Vijayan Srinivasan
 * @since Feb 4, 2017 11:43:45 AM
 * 
 */
public class HelloWorld { // Class Starts
	
	//Block
	{
		
	}// Method Ends

	/**
	 * This is the starting place for execution
	 */
	public static void main(String[] args) { // Method Starts
		// This program is coded to print just "Hello World"

		/*
		 * This is a sample paragraph comment
		 * 
		 * Adding one more line
		 * 
		 */
		
		System.out.println("Hello World");
	} // Method Ends

}// Class Ends
