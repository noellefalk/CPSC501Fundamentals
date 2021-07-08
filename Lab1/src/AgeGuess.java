import java.util.Scanner;

public class AgeGuess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int ageGuess;
		
		System.out.print("Please enter your name: ");
		name = scanner.nextLine();
		
		System.out.print("Please enter your age guess: ");
		ageGuess = Integer.parseInt(scanner.nextLine());
		
		System.out.printf("Name: %s\n", name);
		System.out.printf("Age guess: %d", ageGuess);
	}
}
