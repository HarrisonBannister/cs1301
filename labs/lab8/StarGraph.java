import java.util.Scanner;

public class StarGraph {
	
	/*
	* StarGraph.java
	* Author: Harrison Bannister
	* Submission Date: 10/15/14
	*
	* Purpose: This program plays the number game Mastermind with cash prizes.
	*
	* Statement of Academic Honesty:
	*
	* The following code represents my own work. I have neither
	* received nor given inappropriate assistance. I have not copied
	* or modified code from any source other than the course webpage
	* or the course textbook. I recognize that any unauthorized
	* assistance or plagiarism will be handled in accordance with
	* the University of Georgia's Academic Honesty Policy and the
	* policies of this course. I recognize that my work is based
	* on an assignment created by the Department of Computer
	* Science at the University of Georgia. Any publishing
	* or posting of source code for this project is strictly
	* prohibited unless you have written consent from the Department
	* of Computer Science at the University of Georgia.
	*/

	public static void main(String[] args) {
		// initialize arrays for main method
		double[] xArray = new double[0];
		double[] yArray = new double[0];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of x values to process:");
		int numberofXValues = sc.nextInt();
			// exits program if user enters array size smaller than 1
			while (numberofXValues < 1) {
				System.out.println("The number of x values must be an integer greater than 0.");
				System.exit(0);
			}
		System.out.println("Enter a minimum value for x:");
		double xMinimum = sc.nextDouble();
		System.out.println("Enter the amount to increment x:");
		double increment = sc.nextDouble();
			// exits program if increment is less than or equal to 0
			while (increment <= 0) {
				System.out.println("The increment must be a decimal number greater than 0.");
				System.exit(0);
			}
		
		// populates x array
		xArray = StarGraph.populateXArray(numberofXValues, xMinimum, increment);
		// populates y array based on x values
		yArray = StarGraph.populateYArray(xArray);
		// trims all array values to 3 numbers after the decimal
		xArray = StarGraph.trimArraysToThreeDecPoints(xArray);
		yArray = StarGraph.trimArraysToThreeDecPoints(yArray);
		// prints arrays neatly
		StarGraph.printArrayValues(xArray, yArray);
		// prints graph of both arrays using *
		StarGraph.printArrayGraph(yArray);
		
	}
	
	protected static double[] populateXArray(int arrayNumberofValues, double arrayStart, double arrayIncrement) {
		double xValue = 0;
		// initialize array to be populated
		double[] xArray = new double[arrayNumberofValues];
		// for loop to populate array
		for (int i = 0; i < xArray.length; i++) {
			xValue = (arrayStart + (arrayIncrement * i));
			xArray[i] = xValue;
		}
		return xArray;
	}
	
	protected static double[] populateYArray(double[] inputArray) {
		double yValue = 0;
		// initialize array to be populated based on array passed from argument
		double[] yArray = new double[inputArray.length];
		// for loop to populate array
		for (int i = 0; i < yArray.length; i++) {
			yValue = 20 * (Math.abs(Math.sin(inputArray[i])));
			yArray[i] = yValue;
		}
		return yArray;
	}
	
	protected static double[] trimArraysToThreeDecPoints(double[] inputArray) {
		double[] trimmedArray = inputArray;
		// iterates through array trimming to 3 decimals
		for (int i = 0; i < inputArray.length; i++) {
			double number = inputArray[i];
			number*=1000;
			int numberInt = (int) number;
			double trimmedNumber = (double) numberInt;
			trimmedNumber/=1000;
			//checks to round the decimal
			// if (StarGraph.checkToRound(inputArray[i])) trimmedNumber+=.001;
			inputArray[i] = trimmedNumber;
		}
		return trimmedArray;
	}
	

	/*protected static boolean checkToRound(double valueToCheck) {
		valueToCheck*= 10000;
		int testInt = (int) valueToCheck;
		double testDbl = (double) testInt;
		testDbl/= 10000;
		testDbl%= .001;
		testDbl*= 10000;
		if (testDbl>=5) {
			return true;
		} else {
			return false;
		}	
	  }
	*/
	
	protected static void printArrayValues(double[] xPrintArray, double[] yPrintArray) {
		System.out.println("\nValues");
		if (xPrintArray.length == yPrintArray.length) {
			for (int i = 0; i < xPrintArray.length; i++) {
				System.out.println("x: " + xPrintArray[i] + ", y: " + yPrintArray[i]);
			}
		} else {
			System.out.println("Something has gone horribly wrong!");
			System.exit(0);
		}

	}
	
	protected static void printArrayGraph(double[] yGraphArray) {
		System.out.print("\nGraph");
		int numberofStars = 0;
		for (int i = 0; i < yGraphArray.length; i++) {
			numberofStars = (int) yGraphArray[i];
			System.out.print("\n:");
			for (int j = 0; j < numberofStars; j++) {
			System.out.print("*");
			}
				
		}
	}

}