/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * LAB 3 */

// Sum of the even integers between 2 and an input value.

import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {
		int input;
		int total = 0; 
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Please enter an integer greater than 2. ");
			input = scanner.nextInt();
			if (input < 2) {
				System.out.println("ERROR! The value entered must be larger than 2.");
			}
		}
		while (input < 2);
		
		scanner.close();		
		
		for (int sum = 2; sum <= input; sum+= 2) {
			total += sum;
		}
		System.out.print("The sum of the even integers between 2 and " + input + " is " + total);
	}
}
