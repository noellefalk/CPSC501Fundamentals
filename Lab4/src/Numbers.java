/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * LAB 4 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Numbers {
		
	public static void main(String[] args) {
		ArrayList<Integer> userArray = new ArrayList<Integer>();
		boolean enterData = true;
		String input; 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the values of your array one at a time as prompted. Enter 0 when complete.");
		
		while (enterData) {
			System.out.print("Enter a value. (Q to quit):  ");
			input = scanner.nextLine();
						
			if (input.toLowerCase().equals("q")) {
				enterData = false;	
			} else {
				userArray.add(Integer.parseInt(input));
			}
		}
		scanner.close();
		Numbers numberSorter = new Numbers();
		numberSorter.nextLargest(userArray);
	}
	
	public void nextLargest(ArrayList<Integer> array) {
		ArrayList<Integer> sortedArray = new ArrayList<Integer>(array); 
		Collections.sort(sortedArray);
		
		for (int index = 0; index < array.size(); index++) {
			System.out.print(array.get(index) + ": ");
			
			if (array.get(index) == Collections.max(array)) {
				System.out.println(Integer.MAX_VALUE);
			} else {
				int nextBiggerIndex = sortedArray.lastIndexOf(array.get(index));
				System.out.println(sortedArray.get(nextBiggerIndex + 1)); 
			}
		}		
	}
}
