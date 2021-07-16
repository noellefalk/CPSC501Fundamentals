import java.util.Scanner;

public class NumDisplay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a number between 0 and 9: ");
		int input = scanner.nextInt();
		switch (input) {
			case 0:
				System.out.print("zero");
				break;
			case 1:
				System.out.print("one");
				break;
			case 2:
				System.out.print("two");
				break;
			case 3:
				System.out.print("three");
				break;
			case 4:
				System.out.print("four");
				break;
			case 5:
				System.out.print("five");
				break;
			case 6:
				System.out.print("six");
				break;
			case 7:
				System.out.print("seven");
				break;
			case 8:
				System.out.print("eight");
				break;
			case 9:
				System.out.print("nine");
				break;
			default:
				System.out.print("The number entered was not in the correct range.");
		}
	}
}
