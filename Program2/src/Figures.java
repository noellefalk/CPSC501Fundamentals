/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * Program 2 */

import java.util.Scanner;

public class Figures {

	public static void main(String[] args) {
		Boolean looping = true;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Noelle Falk"); 
		System.out.println("PROGRAMMING ASSIGNMENT 2\n");
		
		System.out.print("Enter the size of the figure (odd number): ");
		int userInput = scanner.nextInt();
		
		while (userInput % 2 == 0 || userInput <= 0) {
			System.out.println("Invalid figure size - must be an odd number\n");
			System.out.print("Renter the size of the figure: ");
			userInput = scanner.nextInt();
		}
		
		do {
			System.out.println("\nMENU:\n1. Print box\n2. Print diamond\n3. Print X\n4. Quit program\n");
			System.out.print("Please select an option: ");
			int userOption = scanner.nextInt();
			System.out.print("\n");
			
			
			switch (userOption) {
			case 1:
				printBox(userInput);
				break;
			case 2:
				printDiamond(userInput);
				break;
			case 3: 
				printX(userInput);
				break;
			case 4:
				System.out.print("Good bye!");
				looping = false;
				break;
			} 
		} while (looping);
		
		scanner.close();
	}

	public static void printBox(int size) {
		for(int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				System.out.print("X");
			}
			System.out.print("\n");
		}
	}
	
	public static void printDiamond(int size) {
		// top half of diamond 
		 for (int index = size / 2; index > 0; index--) {
			 printLine(index, size + 1);
		 }
		 
		 // bottom half of diamond with middle row
		 for (int index = 0; index <= size / 2; index++) {
			 printLine(index, size + 1);
		 }
	}
	
	public static void printX(int size) {
		// top half of X
		for (int index = 0; index < size / 2; index++) {
			printLine(index, size); 
		}
		
		// bottom half of X with middle row
		for (int index = size / 2; index >= 0; index--) {
			printLine(index, size);
		}
	}
	
	private static void printLine(int index, int size) {
		for (int i = 0; i < size; i++) {
			if (i == index || i == size - 1 - index) {
				System.out.print("X");
			} else {
				System.out.print(" ");
			}
		}
		System.out.print("\n");		
	}
}
