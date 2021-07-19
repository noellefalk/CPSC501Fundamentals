/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * PROGRAMMING ASSIGNMENT 1 
 */

import java.util.Scanner;
import java.util.Random;

public class Cipher {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random gen = new Random();
			
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Noelle Falk"); 
		System.out.println("PROGRAMMING ASSIGNMENT 1\n");
		System.out.println("Welcome to the Cipher program.\nPlease enter 5 numbers between 0 and 19");
		
		System.out.print("1st number: ");
		int num1 = scanner.nextInt();
		if (num1 < 0 || num1 > 19) {
			System.out.print("Please read directions and try again!");
			System.exit(0);
		}

		System.out.print("2nd number: ");
		int num2 = scanner.nextInt();
		if (num2 < 0 || num2 > 19) {
			System.out.print("Please read directions and try again!");
			System.exit(0);
		}

		System.out.print("3rd number: ");
		int num3 = scanner.nextInt();
		if (num3 < 0 || num3 > 19) {
			System.out.print("Please read directions and try again!");
			System.exit(0);
		}

		System.out.print("4th number: ");
		int num4 = scanner.nextInt();
		if (num4 < 0 || num4 > 19) {
			System.out.print("Please read directions and try again!");
			System.exit(0);
		}

		System.out.print("5th number: ");
		int num5 = scanner.nextInt();
		if (num5 < 0 || num5 > 19) {
			System.out.print("Please read directions and try again!");
			System.exit(0);
		}
		
		scanner.close();
		
		int plaintext = num1 + num2 + num3 + num4 + num5;
		System.out.println("\nTotal = " + plaintext);
		 
		int key = gen.nextInt(10);
		System.out.println("Your random key is " + key);
		 
		int tensPosition = ((plaintext / 10) + key) % 10; 
		int onesPosition = ((plaintext % 10) + key) % 10; 
		
		if (tensPosition == 0) { //accounts for tensPosition being 0 mod 10 in order to print a two digit encoded number
			System.out.print("Your encoded number is 0" + onesPosition);
		} else {
			int encoded = (tensPosition * 10) + onesPosition;
			System.out.print("Your encoded number is " + encoded);
		}
	}
}
