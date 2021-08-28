/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * Program 4 - Set ADT */

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set set = new Set();
		
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Noelle Falk"); 
		System.out.println("PROGRAMMING ASSIGNMENT 4 - SET\n");
		
		try {
			String userCommand;
			int userValue;
			
			while (true) {
				System.out.print("Enter command: ");
				String userInput = scanner.nextLine();
				
				try {
					userCommand = userInput.split(" ")[0].toLowerCase();
					userValue = Integer.parseInt(userInput.split(" ")[1]); 
				} catch (NumberFormatException e) {
					System.out.println("The operation entered had an error. Type add x, del x, or exists x where x is an integer.");
					continue;
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("The operation entered had an error. Type add x, del x, or exists x where x is an integer.");
					continue;
				}
				
				switch (userCommand) {
				case "add":
					set.add(userValue);
					System.out.println(set);
					break;
				case "del":
					set.delete(userValue);
					System.out.println(set);
					break;
				case "exists":
					System.out.println(set.exists(userValue));
					break;
				default:
					System.out.println("The operation entered had an error. Please try again.");
				}
			}
		} finally {
			scanner.close();
		}
	}
}
