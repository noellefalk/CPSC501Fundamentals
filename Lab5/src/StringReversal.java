/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * LAB 5 EXERCISE 4*/

public class StringReversal {

	public String reverse(String str, int index) {
		if (index >= 0) {
			return (String) (str.charAt(index) + reverse(str, index - 1));
		} else {
			return "";
		}
	}
}
