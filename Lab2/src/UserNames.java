import java.util.Scanner;
import java.util.Random;

public class UserNames {

	public static void main(String[] args) {
		Random gen = new Random();
		int num = gen.nextInt(90) + 10;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your first name: ");
		String firstName = scanner.nextLine().toLowerCase();
		
		System.out.print("Please enter your last name: ");
		String lastName = scanner.nextLine().toLowerCase();
		
		System.out.print("Your username is " + lastName.substring(0, 4) + firstName.charAt(0) + num);
	}
}
