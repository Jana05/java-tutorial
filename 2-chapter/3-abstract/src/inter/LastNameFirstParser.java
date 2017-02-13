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
public class LastNameFirstParser implements NameParser, LetterCounter {

	private String[] names;

	public LastNameFirstParser(String fullName) {
		names = fullName.split(",");
	}

	public String getFirstName() {
		return names[1].trim();
	}

	public String getLastName() {
		return names[0];
	}
	
	public int count() {
		return getFirstName().length() + getLastName().length();
	}

}
