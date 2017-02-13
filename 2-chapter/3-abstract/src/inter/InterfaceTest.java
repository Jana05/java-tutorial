/**
 * 
 */
package inter;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam   
 * @since Feb 13, 2017 9:19:50 PM
 * 
 */
public class InterfaceTest {

	public static void main(String[] args) {
		NameParser parser = new FirstNameFirstParser("Vijayan Srinivasan");
		print(parser);

		parser = new LastNameFirstParser("Shanmugam, Janarthanan");
		print(parser);
	}

	private static void print(NameParser parser) {
		System.out.println(parser.getFirstName());
		System.out.println(parser.getLastName());
		System.out.println("Count="+ ((LetterCounter) parser).count());
	}

}
