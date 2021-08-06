/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * LAB 5 EXERCISE 3*/

import java.util.Scanner;

public class UsingGCD {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter two numbers to check the greatest common divisor.");
		
		System.out.print("First number: ");
		int userNum1 = scanner.nextInt();
		
		System.out.print("Second number: ");
		int userNum2 = scanner.nextInt();
		
		int result = DivisorCalc.gcd(userNum1, userNum2);
		
		scanner.close();
		System.out.print("The greatest common divisor of " + userNum1 + " and " + userNum2 + " is " + result);
	}
}
