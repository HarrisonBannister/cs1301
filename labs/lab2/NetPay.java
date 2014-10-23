import java.util.Scanner;

/*
* NetPay.java
* Author: Harrison Bannister 
* Submission Date: 03/09/14
*
* Purpose: A brief paragraph description of the
* program. What does it do?
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

public class NetPay {

	/**
	 * This class takes the number of hours worked and outputs net pay after taxes.
	 */
	
	public static void main(String[] args) {
		
		//constant declarations
		final double FEDERAL_TAX_PERCENT = 10.0;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		//scanner object
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for hours worked
		System.out.println("Enter the number of hours worked:");
		
		//variable declarations
		int hoursPerWeek = keyboard.nextInt();
		double grossPay;
		double netPay;
		double federalTax;
		double stateTax;
		double medicare;
		double socialSecurity;
		
		//compute grosspay
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		
		//tax calculations
		federalTax = (grossPay * FEDERAL_TAX_PERCENT) / 100;
		stateTax = (grossPay * STATE_TAX_PERCENT) / 100;
		medicare = (grossPay * MEDICARE_PERCENT) / 100;
		socialSecurity = (grossPay * SS_PERCENT) / 100;
		
		//net pay calculation subtracting all taxes from gross
		netPay = grossPay - federalTax - stateTax - medicare - socialSecurity;
		
		//print all variables including net pay
		System.out.println("Hours per Week:\t" + hoursPerWeek);
		System.out.println("Gross Pay:\t" + grossPay);
		System.out.println("Net Pay:\t" + netPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal:\t" + federalTax);
		System.out.println("State:\t" + stateTax);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t" + medicare);
	}

}
