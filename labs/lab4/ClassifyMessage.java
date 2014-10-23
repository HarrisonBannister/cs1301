package harrison;

import java.util.Scanner;

public class ClassifyMessage {
	enum MessageCategory{NEED, OFFER, ALERT, INFO, UNKNOWN}

	public static void main(String[] args) {
		/*
		* ClassifyMessage.java
		* Author: Harrison Bannister
		* Submission Date: 09/17/14
		*
		* Purpose: This program classifies a message.
		*
		* Statement of Academic Honesty:
		*
		* The following code represents my own work. I have neither
		* received nor given inappropriate assistance. I have not copied
		* or modified code from any source other than the course webpage
		* CSCI 1301: CS 1301 Lab 4
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
		
		//static variables
		final double south = 39.882343; //southernmost latitude
		final double north = 40.231315; //northernmost latitude
		final double west = -105.743511; //westernmost longitude
		final double east = -104.907864; //easternmost longitude
		
		
		//variable declarations
		String catString;			//The raw text of the message’s category
		String payload;				//The primary content of the message
		double latitude;			//The latitude indicated in the message	
		double longitude;			//The longitude indicated in the message
		boolean isInRange;			//a "flag indicating whether the latitude and longitude values are within bounds
		MessageCategory category;	//The message's category
		
		//takes input of raw text
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		catString.trim();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		payload.trim();
		keyboard.close();
		
		
		//checks catString for keywords and assigns it to a category
		if (catString.equalsIgnoreCase("fire") ||  catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		} else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		} else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		} else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		} else {
			category = MessageCategory.UNKNOWN;
		}
		
			//checks to make sure coordinates are in range
			if (((latitude >= south) && (latitude <= north)) && ((longitude >= west) && (longitude <= east))) {
				isInRange = true;
			} else {
				isInRange = false;
			}
		
		//outputs formatted values
		System.out.println("Category:\t " + category);
		System.out.println("Raw Cat:\t " + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t " + latitude);
		System.out.println("Longitude:\t " + longitude);
		System.out.println("In Range:\t " + isInRange);
	}

}
