/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * LAB 5 EXERCISE 4*/

import java.util.Scanner;

public class UsingStringReversal {

	public static void main(String[] args) {
		String userInput = "";
		Scanner scanner = new Scanner(System.in); 
		
		while (!userInput.equalsIgnoreCase("XXX")) {
			String result = "";
			System.out.print("Enter a word to reverse its order (XXX to quit): ");
			userInput = scanner.nextLine();
			if (!userInput.equalsIgnoreCase("XXX")) {
				int index = userInput.length() - 1;
				
				StringReversal data = new StringReversal();
				result = data.reverse(userInput, index);
				System.out.println(result);
			}
		}
		scanner.close();		
	}
}
