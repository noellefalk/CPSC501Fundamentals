import java.util.Scanner; 

public class TimeComp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number of seconds to convert: ");
		int userSeconds = Integer.parseInt(scanner.nextLine());
		int hours = userSeconds / 3600;
		int minutes = (userSeconds / 60) % 60; 
		int seconds = userSeconds % 60;
		System.out.printf("%d seconds is equivalent to %d hours, %d minutes, and %d seconds.", userSeconds, hours, minutes, seconds);
	}
}
