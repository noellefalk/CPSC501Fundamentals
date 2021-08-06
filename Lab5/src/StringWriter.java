/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * LAB 5 EXERCISE 2*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StringWriter {

	public static void main(String[] args) {
		String userInput;
		try {
			FileWriter fw = new FileWriter("userStrings.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter outFile = new PrintWriter(bw);
			
			Scanner scanner = new Scanner(System.in);
			
			do {
				System.out.print("Please enter text to write to the file (Enter DONE to quit): ");
				userInput = scanner.nextLine();
				if (!userInput.equalsIgnoreCase("DONE")) {
					outFile.print(userInput);
					outFile.println();
				}
			} while (!userInput.equalsIgnoreCase("DONE"));
			scanner.close();
			outFile.close();
		} catch (IOException e) {
			System.out.println("The filename could not be created as specified. Please try again.");
		}
	}
}
