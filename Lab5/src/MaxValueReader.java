/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * LAB 5  EXERCISE 1*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MaxValueReader {

	public static void main(String[] args) {
		try {
			String fileName = "input.csv";
			File f = new File(fileName);
			Scanner fileScan = new Scanner(f); 
			
			System.out.println("Maximum values");
			int row = 1;
			
			while (fileScan.hasNext()) {
				String line = fileScan.nextLine();
				String[] stringArray = line.split(",");
				
				int[] intArray = new int[stringArray.length];
				
				for (int i = 0; i < stringArray.length; i++) {
					intArray[i] = Integer.parseInt(stringArray[i]);
				}
				
				Arrays.sort(intArray);
				System.out.println("ROW " + row +": " + intArray[intArray.length - 1]);
				row++;
			}
			fileScan.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found. Please verify file path.");
		}
	}
}
