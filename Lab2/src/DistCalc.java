//Compute the distance between two points using d = sqrt((x2 - x1)^2 +(y2 - y1)^2)

import java.util.Scanner;

public class DistCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first x coordinate: ");
		double x1 = scanner.nextDouble();
		
		System.out.print("Enter the first y coordinate: ");
		double y1 = scanner.nextDouble();
		
		System.out.print("Enter the second x coordinate: ");
		double x2 = scanner.nextDouble();
		
		System.out.print("Enter the second y coordinate: ");
		double y2 = scanner.nextDouble();
		
		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.printf("The distance between the two points (%.2f, %.2f) and (%.2f, %.2f) is %.3f", x1, y1, x2, y2, distance);	
	}
}
