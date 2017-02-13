/**
 * 
 */
package inter;

/**
 * @author Vijayan Srinivasan
 * @author Janarthanan Shanmugam
 * @since Feb 13, 2017 9:17:58 PM
 * 
 */
public class FirstNameFirstParser implements NameParser, LetterCounter {

	private String[] names;

	public FirstNameFirstParser(String fullName) {
		names = fullName.split(" ");
	}

	public String getFirstName() {
		return names[0];
	}

	public String getLastName() {
		return names[1];
	}

	public int count() {
		return getFirstName().length() + getLastName().length();
	}

}
