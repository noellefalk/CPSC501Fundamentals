import java.util.Random;
import java.util.Scanner;

public class AgeGuessEx1 {

	public static void main(String[] args) {
		int age;
		
		Scanner scanner = new Scanner(System.in);
		Random gen = new Random();
		age = gen.nextInt(101);
		
		System.out.print("Please enter your name: ");
		String name = scanner.nextLine();
		
		System.out.print("Please enter your age guess: ");
		int ageGuess = scanner.nextInt();
		
		System.out.print("\nHi " + name + "! Your age guess was " + ageGuess + " and the correct answer is " + age + ".");
	}
}
