import java.util.Scanner;


public class Palindrome {

    public static void main(String[] args) {
		/*
		* Palindrome.java
		* Author: Harrison Bannister
		* Submission Date: 10/1/14
		*
		* Purpose: This program checks a if a number is a palindrome and prints the sum.
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
    	
		
		// gets user inputted integer
		System.out.println("Please enter an integer > 0: ");
		Scanner keyboard = new Scanner(System.in);
		String palString = keyboard.next();
		keyboard.close();
		
		
		// converts user inputted string to int for int operations
		Scanner sc = new Scanner(palString);
		int palInt = sc.nextInt();
		sc.close();
		
		// error handling, user integer must not be negative
		if (palInt < 0) {
			
			System.out.println("Sorry, you must enter an integer greater than zero.");
			System.exit(0);
			
		} else {
			
			// finds number of places in user inputted integer
			int places = 0;
			double placeFind;
	        int i = 1;
			do {
	            
	    	    placeFind = palInt / Math.pow(10, i);
	            i++;
	    		places++;
	            
			} while (placeFind > 1);
	        
			
			// finds the reverse of the user inputted integer
	        double palRev = 0;
	        double palRevFind;
	        int palRevInt = palInt;
	        int j = places;
	        do {
	            
	            palRevFind = palRevInt % 10;
	            palRevInt = palRevInt / 10;
	            palRev = palRev + (palRevFind * Math.pow(10, j-1));
	            j--;
	            
	        } while (j > 0);
			
	        // checks if number is a palindrome
			if (palRev != palInt) {
				
				System.out.println("The integer " + palInt + " is a not a palindrome.");
				
				
			} else  {
				
				/* if it is a palindrome, finds the sum of all numbers
				 * from 1 to user inputted integer
				*/
				int palSum = 0;
		        int k = 0;
		        while (k <= palInt) {
		        
		        	palSum = palSum + k;
		        	k++;
		        
		        }
				
		        // prints to user that their inputted integer is a palindrome
				System.out.println("The integer " + palInt + " is a palindrome.\n"+
									"The sum of the numbers from 1 to " + palInt + " is " + palSum);
			}
			
		}
		
		

	}
}
