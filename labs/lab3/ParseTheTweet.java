package proj1;

import java.util.Scanner;

public class ParseTheTweet {

	public static void main(String[] args) {
		/*
		* ParseTheTweet.java
		* Author: Harrison Bannister
		* Submission Date: 09/12/14
		*
		* Purpose: This program parses a tweet for data and outputs it 
		* 			in a legible format.
		*
		* Statement of Academic Honesty:
		*
		* The following code represents my own work. I have neither
		* received nor given inappropriate assistance. I have not copied
		* or modified code from any source other than the course webpage
		* CSCI 1301: Project 1 Page 3
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
		
		//final variable declarations
		//tweet info hashtags
		final String tagTyp = "#typ";
		final String tagDet = "#det";
		final String tagLoc = "#loc";
		final String tagLat = "#lat";
		final String tagLng = "#lng";
		//tags start and finish
		int tagStart;
		int tagFinish;
		
		//scanner for keyboard input of tweet
		Scanner theScanner = new Scanner(System.in);
		System.out.println("Enter the tweet:");
		String tweet = theScanner.nextLine();
		theScanner.close();
		
		
			//finds type
			tagStart = tweet.indexOf(tagTyp) + 4;
			tagFinish = tweet.indexOf("; #det");
			String type = tweet.substring(tagStart, tagFinish);
			type.trim();
			
			//finds detail
			tagStart = tweet.indexOf(tagDet) + 4;
			tagFinish = tweet.indexOf("; #loc");
			String det = tweet.substring(tagStart, tagFinish);
			det.trim();
			
			//finds location
			tagStart = tweet.indexOf(tagLoc) + 4;
			tagFinish = tweet.indexOf("; #lat");
			String loc = tweet.substring(tagStart, tagFinish);
			loc.trim();
			
			//finds latitude
			tagStart = tweet.indexOf(tagLat) + 4;
			tagFinish = tweet.indexOf("; #lng");
			String lat = tweet.substring(tagStart, tagFinish);
			lat.trim();
			theScanner = new Scanner(lat);
			double latValue = theScanner.nextDouble();
			theScanner.close();
			
			
			//finds longitude
			tagStart = tweet.indexOf(tagLng) + 4;
			tagFinish = tweet.indexOf(";\"");
			String lng = tweet.substring(tagStart, tagFinish);
			lng.trim();
			theScanner = new Scanner(lng);
			double lngValue = theScanner.nextDouble();
			theScanner.close();
		
		//outputs
		System.out.println("Type:\t\t" + type.toUpperCase());
		System.out.println("Detail:\t\t" + det.replace(',', '-'));
		System.out.println("Location:\t" + loc.replace(',', '-'));
		System.out.println("Latitude:\t " + latValue);
		System.out.println("Longitude:\t " + lngValue);
		theScanner.close();

	}

}
