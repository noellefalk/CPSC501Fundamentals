import java.util.Random;
import java.util.Scanner;

public class AgeGuessEx4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random gen = new Random();
		int age = gen.nextInt(101);
		
		System.out.print("Please enter your name: ");
		String name = scanner.nextLine();
		
		System.out.print("Please enter your age guess: ");
		int ageGuess = scanner.nextInt();
		
		System.out.println("\nHi " + name);
		if (ageGuess != age) {
			System.out.println("You guessed wrong!");
			if (ageGuess < age)
				System.out.println("The age is older.");
			else
				System.out.println("The age is younger.");
		}
	}
}
