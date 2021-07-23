/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * LAB 3 */

import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		int vowelA = 0;
		int vowelE = 0;
		int vowelI = 0;
		int vowelO = 0;
		int vowelU = 0;
		int nonVowelChar = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a phrase: ");
		String input = scanner.nextLine();
		
		scanner.close();
		input = input.toLowerCase();
		
		for (int index = 0; index < input.length(); index++) {
			switch (input.charAt(index)) {
			case 'a':
				vowelA++; 
				break; 
			case 'e':
				vowelE++;
				break;
			case 'i':
				vowelI++;
				break;
			case 'o':
				vowelO++;
				break;
			case 'u':
				vowelU++;
				break;
			default:
				nonVowelChar++;
			}
		}
		System.out.println("Quantity of 'a' characters: " + vowelA);
		System.out.println("Quantity of 'e' characters: " + vowelE);
		System.out.println("Quantity of 'i' characters: " + vowelI);
		System.out.println("Quantity of 'o' characters: " + vowelO);
		System.out.println("Quantity of 'u' characters: " + vowelU);
		System.out.println("Quantity of non-vowel characters: " + nonVowelChar);		
	}
}
