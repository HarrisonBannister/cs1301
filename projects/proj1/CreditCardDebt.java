package proj1;

import java.util.Scanner;

public class CreditCardDebt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		* CreditCardDebt.java
		* Author: Harrison Bannister
		* Submission Date: 09/12/14
		*
		* Purpose: This program computes credit card debt.
		*
		* Statement of Academic Honesty:
		*
		* The following code represents my own work. I have neither
		* received nor given inappropriate assistance. I have not copied
		* or modified code from any source other than the course webpage
		CSCI 1301: Project 1 Page 3
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
		
		//new scanner instance
		Scanner sc = new Scanner(System.in);
		
		//user prompts
		System.out.println("Enter the principal in $USD:");
		double principal = sc.nextDouble();
		System.out.println("Enter the annual interest rate:");
		double airate = sc.nextDouble();
		System.out.println("Enter the monthly payment:");
		double monthlyPayment = sc.nextDouble();
		sc.close();
		//end of prompts
		
		
		//months needed formula
			//log of monthlyPayment for months needed formula
			double mPayLog = Math.log(monthlyPayment);
			//numerator subtracted from log of monthly payment for months needed formula
			double nLog = (monthlyPayment - (airate/1200) * principal);
			double numLog = Math.log(nLog);
			//denominator for months needed formula
			double dLog = ((airate/1200) + 1);
			double denomLog = Math.log(dLog);
				//output of months formula
				double rawMonths = (mPayLog-numLog) / denomLog;
				
				
		//gets ceiling of output of months formula
		double ceilMonths = Math.ceil(rawMonths);
		//cast to int
		int monthsInt = (int) ceilMonths;
		
		//calcs total amount and interest paid
		double tamntpaid = monthsInt * monthlyPayment;
		double tipaid = (principal - tamntpaid) * -1;
		
		//calcs overpayment
		double otamntpaid = rawMonths * monthlyPayment;
		double otipaid = (principal - otamntpaid) * -1;
		double oPayment = tipaid - otipaid;
		
		//rounds total amount and total interest paid to 2 decimals
		tamntpaid *= 100;
		tipaid *= 100;
		int itamntpaid = (int) tamntpaid;
		int itipaid = (int) tipaid;
		double rndtamntpaid = (double) itamntpaid;
		double rndtipaid = (double) itipaid;
		rndtamntpaid = rndtamntpaid / 100;
		rndtipaid = rndtipaid / 100;
		//rounds overpayment
		oPayment *= 100;
		int ioPayment = (int) oPayment;
		double rndoPayment = (double) ioPayment;
		rndoPayment = rndoPayment / 100;
		
		
		
		System.out.println("Principal\t\t\t" + principal);
		System.out.println("Annual Interet Rate (%):\t" + airate);
		System.out.println("Monthly Payment:\t\t" + monthlyPayment + "\n");
		System.out.println("Months Needed to Pay Off:\t" + monthsInt);
		System.out.println("Total Amount Paid:\t\t$" + rndtamntpaid);
		System.out.println("Total Interest Paid:\t\t$" + rndtipaid);
		System.out.println("Overpayment:\t\t\t$" + rndoPayment);
	}

}
