/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * LAB 3 */

import java.util.Random;
import java.util.Scanner;

public class AgeGuess {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random gen = new Random();
		int age = gen.nextInt(101);
		int ageGuess = 101;
		
		System.out.print("Please enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println("\nHi " + name);
		while (ageGuess != age) {
			System.out.print("Please enter your age guess: ");
			ageGuess = scanner.nextInt();
			if (ageGuess != age) {
				System.out.println("You guessed wrong!");
				if (ageGuess < age) {
					System.out.println("The age is older.");
				} else {
					System.out.println("The age is younger.");
				}
			}
		}
		scanner.close();
		System.out.print("Congratulations! You guessed the correct age: " + age);
	}
}