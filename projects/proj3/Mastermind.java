import java.util.Scanner;

public class Mastermind {
	/*
	* Mastermind.java
	* Author: Harrison Bannister
	* Submission Date: 10/17/14
	*
	* Purpose: This program plays the number game "Mastermind" as many times as a user wants.
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
	
	// class wide variables
	final static double MIN_BET = 2.0;
	static boolean testingMode = true;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// main method variables
		String playGame = "";
		double moneyBalance = 0;
		double newMoneyBalance = 0;
		
		//game starts
		System.out.println("Would you like to play Mastermind (yes/no)?");
		playGame = sc.next();
		// catches no
		if (playGame.equalsIgnoreCase("no")) {
			System.out.println("Bye, see you next time.");
			System.exit(0);
		}
		// forces user to answer yes or no
		while (!(playGame.equalsIgnoreCase("yes")) && !(playGame.equalsIgnoreCase("no"))) {

			System.out.println("Answer is invalid. Please enter yes/no.");
			System.out.println("Would you like to play Mastermind (yes/no)?");
			playGame = sc.next();
		}
		
		// initially ask for how much money user has
		System.out.println("Enter the amount of money you have to play:");
		moneyBalance = sc.nextDouble();
		// exits if money is less than two dollars or minimum bet
		while (moneyBalance < MIN_BET) {

			System.out.println("Sorry, you should have at least 2.0 dollars to play the game. Bye!");
			System.exit(0);

		}
		
		// MAIN GAME LOOP beginning at asking for difficulty
		do {
			// asks for difficulty
			System.out.println("Please enter the level of difficulty (beginner, intermediate, advanced):");
			String difficulty = sc.next();
			// forces user to pick a valid difficulty
			while (!(difficulty.equalsIgnoreCase("beginner")) && !(difficulty.equalsIgnoreCase("intermediate")) && !(difficulty.equalsIgnoreCase("advanced"))) {
				System.out.println("Sorry, this is not a correct level.");
				System.out.println("Please enter the level of difficulty (beginner, intermediate, advanced):");
				difficulty = sc.next();
			}
			
			// asks for value of bet
			System.out.println("Enter the amount of money you want to bet:");
			double bet = sc.nextDouble();
			// forces user to bet only money they have
			while (bet > moneyBalance) {
				System.out.println("Sorry, you cannot bet more money than what you have.");
				System.out.println("Enter the amount of money you want to bet:");
				bet = sc.nextDouble();
			}
			// forces user to bet more than the min bet
			while (bet < MIN_BET) {
				System.out.println("Sorry, the minimum amount of money is 2.00 dollars.");
				System.out.println("Enter the amount of money you want to bet:");
				bet = sc.nextDouble();
			}
			// ROUND BEGINS
			if (difficulty.equalsIgnoreCase("beginner")) {
				newMoneyBalance = Mastermind.gameIteration(30,3,bet,moneyBalance);
			} else if (difficulty.equalsIgnoreCase("intermediate")) {
				newMoneyBalance = Mastermind.gameIteration(20,4,bet,moneyBalance);
			} else {
				newMoneyBalance = Mastermind.gameIteration(10,5,bet,moneyBalance);
			}
			
			// adjusts new money balance based on how game went
			moneyBalance = newMoneyBalance;
			// checks if user can even still bet money
			while (moneyBalance <= MIN_BET) {
				System.out.println("You can't bet any more money! The game has terminated. Bye. Come to play again!!");
				System.exit(0);
			}
			// ROUND ENDS
			
			// sets while condition to play unlimited games
			System.out.println("Would you like to play again (yes/no)?");
			playGame = sc.next();
			// exits game if answer is no
			while (playGame.equalsIgnoreCase("no")) {
				System.out.println("The game has terminated. Bye. Come to play again!!");
				System.exit(0);
			}
			// forces yes or no answer
			while (!(playGame.equalsIgnoreCase("yes")) && !(playGame.equalsIgnoreCase("no"))) {
				System.out.println("Answer is invalid. Please enter yes/no.");
				System.out.println("Would you like to play again (yes/no)?");
				playGame = sc.next();
			}
		} while (playGame.equalsIgnoreCase("yes")); // end of MAIN GAME LOOP
	}
	
	/*
	 * This method takes in all the variables needed to begin the guessing section of the game and returns the
	 * user's new balance of money after the round of guessing.
	 */	
	protected static double gameIteration(int maxGuesses, int numberofDigits, double gameBet, double gameMoneyBalance) {
		// scanner for game
		Scanner scGame = new Scanner(System.in);
		// Initialize guesses at 0
		int numOfGuesses = 0;
		// Initialize random secret #
		double randDbl = (Math.random() * (Math.pow(10,numberofDigits-1) * 9)) + Math.pow(10,numberofDigits-1);
		int randInt = (int) randDbl;
		// creates string version of random #
		String randString = "" + randInt;
		//testing mode
		if (testingMode) System.out.println("(Testing Mode - the " + numberofDigits + " digits number: " + randInt + ")");
		
		// guessing section
		int guessInt = 0; // user guessed number
		do {
			// initialized variables used in guessing
			int correctDigits = 0, sum = 0; // sum of correct digits and number
			// asks user for value of guess
			System.out.println("Please guess the " + numberofDigits + " digits number:");
			String guess = scGame.next();
			guessInt = Integer.parseInt(guess);
			// forces user to make 3 digit guess
			while (guessInt < Math.pow(10,numberofDigits-1) || guessInt > (Math.pow(10,numberofDigits-1) * 10) - 1) {
				System.out.println("The guess you have entered is ill formed.");
				System.out.println("Please guess the " + numberofDigits + " digits number:");
				guess = scGame.next();
				guessInt = Integer.parseInt(guess);
			}
			
			String guesCompare, randCompare = "";
			int guesIntCheck, randIntCheck = 0;
			// guess digit and sum finding loop
			for (int i = 0; i < guess.length(); i++) {

				// grabs each character for comparison and passes it to int
				guesCompare = guess.substring(i, i+1);
				guesIntCheck = Integer.parseInt(guesCompare);
				randCompare = randString.substring(i, i+1);
				randIntCheck = Integer.parseInt(randCompare);

				// compares and increments correct digits and sum appropriately
				if (guesIntCheck == randIntCheck) {
					// increments correct digits and adds them to sum
					correctDigits+=1;
					sum+=guesIntCheck;
				}
			} //end of guess digit and sum finding loop
			
			// prints response after finding number of correct digits and sum from guess
			if (!(randInt == guessInt)) {
				System.out.println("Number of correct digits: " + correctDigits);
				System.out.println("Sum: " + sum);
				numOfGuesses++; // increment number of guesses if user does not guess correct number
			}
		} while ((numOfGuesses < maxGuesses) && !(randInt == guessInt)); // round winning conditions
		
		// round win and lose loop
		if (randInt == guessInt) {
			double moneyChange = ((gameBet * numberofDigits * (maxGuesses - numOfGuesses))) / maxGuesses;
			gameMoneyBalance+= moneyChange;
			System.out.println("\n\t\tYou won!!\n"+
				"\t\tYou have had " + numOfGuesses + " wrong guesses.\n"+
				"\t\tYou have earned " + moneyChange + " dollars\n"+
				"\t\tYour balance is now "+ gameMoneyBalance + " dollars\n");
			return gameMoneyBalance;
		} else if ((numOfGuesses >= maxGuesses) || !(randInt == guessInt)) {
			gameMoneyBalance-= gameBet;
			System.out.println("\n\t\tSorry, you lost!!!\n"+
					"\t\tYou have guessed " + maxGuesses + " times\n"+
					"\t\tThe number was " + randInt + "\n"+
					"\t\tYou have lost " + gameBet + " dollars.\n"+
					"\t\tYour balance is now "+ gameMoneyBalance + " dollars\n");
			return gameMoneyBalance;
		} else {
			// return something if somehow conditions are not met
			return 0;
		}	
	}
}