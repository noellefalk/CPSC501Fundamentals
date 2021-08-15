/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * Program 3 */

import java.io.*;
import java.util.Scanner;

public class NearestNeighbor {
	
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Noelle Falk"); 
		System.out.println("PROGRAMMING ASSIGNMENT 3\n");
		
		double[][] trainingAttributes = new double[75][4];
		double[][] testAttributes = new double[75][4];
		String[] trainingLabels = new String [75];
		String[] testLabels = new String[75];
		String[] predictedLabelArray = new String[75];
		Scanner scanner = new Scanner(System.in); 
		
		
		System.out.print("Enter the name of the training file: ");
		String trainFile = scanner.nextLine();
		trainingAttributes = attributeFileReader(trainFile);
		trainingLabels = labelFileReader(trainFile);
		
		System.out.print("Enter the name of the testing file: ");
		String testFile = scanner.nextLine();
		testAttributes = attributeFileReader(testFile);
		testLabels = labelFileReader(testFile);
		
		for (int test = 0; test < testAttributes.length; test++) {
			String predictedLabel = predict(testAttributes[test], trainingAttributes, trainingLabels);
			predictedLabelArray[test] = predictedLabel;
		}	
		double accuracy = accuracyCalc(predictedLabelArray, testLabels);
		
		System.out.println("\nEX#: TRUE LABEL, PREDICTED LABEL");
		for (int i = 1; i <= predictedLabelArray.length; i++) {
			System.out.println(i + ": " + testLabels[i - 1]+ " " + predictedLabelArray[i - 1]);
		}
		System.out.print("ACCURACY: " + accuracy);
		scanner.close();
	}
	
	public static String predict(double[] array, double[][] trainingArray, String[] trainingLabels) {
		double sepalLengthY = array[0];
		double sepalWidthY = array[1];
		double petalLengthY = array[2];
		double petalWidthY = array[3];
		double minDistance = Double.MAX_VALUE;
		int minIndex = -1;
	
		for (int row = 0; row < trainingArray.length; row++) {
			double sepalLengthX = trainingArray[row][0];
			double sepalWidthX = trainingArray[row][1];
			double petalLengthX = trainingArray[row][2];
			double petalWidthX = trainingArray[row][3];
			
			double distance = Math.sqrt(Math.pow((sepalLengthX - sepalLengthY), 2) + Math.pow((sepalWidthX - sepalWidthY), 2) + Math.pow((petalLengthX - petalLengthY), 2) + Math.pow((petalWidthX - petalWidthY), 2));
			
			if (distance <= minDistance) {
				minDistance = distance;
				minIndex = row;
			}
		}
		return trainingLabels[minIndex];
	}
	
	public static double accuracyCalc(String[] predictedLabels, String [] testLabels) {
		double match = 0.0;
		for (int index = 0; index < predictedLabels.length; index++) {
			if (predictedLabels[index].equalsIgnoreCase(testLabels[index])) {
				match++;
			}
		}
		return match/testLabels.length;
	}

	public static double[][] attributeFileReader(String fileName) throws FileNotFoundException {
		double[][] attributes = new double[75][4];
		
		File f = new File(fileName);
		Scanner fileScan = new Scanner(f); 
		
		int row = 0;
		while (fileScan.hasNext()) {
			String line = fileScan.nextLine();
			String[] stringArray = line.split(",");
								
			for (int column = 0; column < 4; column++) {
				attributes[row][column] = Double.parseDouble(stringArray[column]);
			}
			row++;
		}
		fileScan.close();
		return attributes;
	}
	
	public static String[] labelFileReader(String fileName) throws FileNotFoundException {
		String[] labels  = new String[75];
		File f = new File(fileName);
		Scanner fileScan = new Scanner(f); 
		
		int row = 0;
		while (fileScan.hasNext()) {
			String line = fileScan.nextLine();
			String[] stringArray = line.split(",");
								
			labels[row] = stringArray[4];
			row++;
		}
		fileScan.close();
		return labels;
	}
}
