import java.util.Scanner;

public class MultipleChoiceFlashCards {

	public static void main(String[] args) {
		/*
		* MultipleChoiceFlashCards.java
		* Author: Harrison Bannister
		* Submission Date: 09/25/14
		*
		* Purpose: This program tests the user on CSCI with multiple choice questions and
		* outputs their performance.
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
		
		// welcome message!
		System.out.println("Welcome to CSCI 1301 Multiple Choice Flash Cards!\n");
		
		// variable declarations; just the point system used by the game
		int finalScore = 0;
		
		// first question calls
		String questionAndChoices = MultipleChoiceFlashCardsZoeyGameEngine001.getQuestionAndChoices();
		String choiceA = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceA();
		String choiceB = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceB();
		String choiceC = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceC();
		String choiceD = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceD();
		String answer = MultipleChoiceFlashCardsZoeyGameEngine001.getAnswer();
		
		// prints first question
		System.out.println(questionAndChoices);
		
		// gets first question answer from user
		System.out.println("Enter your answer (a-d):");
		Scanner keyboard = new Scanner(System.in);
		String firstAnswer = keyboard.next();
		firstAnswer = firstAnswer.toLowerCase();

		
		// checks first if answer is correct and gives 1 point for being correct; then if answer is valid and
		// if answer is valid and not correct; then answer is incorrect and no points are given
		if (firstAnswer.startsWith("a") && choiceA.equalsIgnoreCase(answer)) {
			
			finalScore++;
			System.out.println("Correct Answer!\n"+
								"Your score: " + finalScore + " out of " + 1 + " point(s)\n");
			
			
		} else if (firstAnswer.startsWith("b") && choiceB.equalsIgnoreCase(answer)) {
			
			finalScore++;
			System.out.println("Correct Answer!\n"+
								"Your score: " + finalScore + " out of " + 1 + " point(s)\n");
			
			
		} else if (firstAnswer.startsWith("c") && choiceC.equalsIgnoreCase(answer)) {
			
			finalScore++;
			System.out.println("Correct Answer!\n"+
								"Your score: " + finalScore + " out of " + 1 + " point(s)\n");
			
			
		} else if (firstAnswer.startsWith("d") && choiceD.equalsIgnoreCase(answer)) {
			
			finalScore++;
			System.out.println("Correct Answer!\n"+
								"Your score: " + finalScore + " out of " + 1 + " point(s)\n");
			
			
		} else if (!(firstAnswer.startsWith("a")) && !(firstAnswer.startsWith("b")) && !(firstAnswer.startsWith("c")) && !(firstAnswer.startsWith("d"))) {
			
			// invalid answer and game exit
			System.out.println("Invalid answer.\n"+
								"An answer must begin with a, A, b, B, c, C, D, or d.\n"+
								"Game over!");
			System.exit(0);
			
		} else {
			
			// incorrect answer
			System.out.println("Incorrect Answer!\n"+
								"Your score: " + finalScore + " out of " + 1 + " point(s)\n");
			
		}
		
		
				// second question calls
				String secondQuestionAndChoices = MultipleChoiceFlashCardsZoeyGameEngine001.getQuestionAndChoices();
				String secondChoiceA = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceA();
				String secondChoiceB = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceB();
				String secondChoiceC = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceC();
				String secondChoiceD = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceD();
				String secondChoiceAnswer = MultipleChoiceFlashCardsZoeyGameEngine001.getAnswer();
				
				// prints second question
				System.out.println(secondQuestionAndChoices);
				
				// gets second question answer from user
				System.out.println("Enter your answer (a-d):");
				String secondAnswer = keyboard.next();
				secondAnswer = secondAnswer.toLowerCase();
				
				
				// checks first if answer is correct and gives 1 point for being correct; then if answer is valid and
				// if answer is valid and not correct; then answer is incorrect and no points are given
				if (secondAnswer.startsWith("a") && secondChoiceA.equalsIgnoreCase(secondChoiceAnswer)) {
					
					finalScore++;
					System.out.println("Correct Answer!\n"+
										"Your score: " + finalScore + " out of " + 2 + " point(s)\n");
					
					
				} else if (secondAnswer.startsWith("b") && secondChoiceB.equalsIgnoreCase(secondChoiceAnswer)) {
					
					finalScore++;
					System.out.println("Correct Answer!\n"+
										"Your score: " + finalScore + " out of " + 2 + " point(s)\n");
					
					
				} else if (secondAnswer.startsWith("c") && secondChoiceC.equalsIgnoreCase(secondChoiceAnswer)) {
					
					finalScore++;
					System.out.println("Correct Answer!\n"+
										"Your score: " + finalScore + " out of " + 2 + " point(s)\n");
					
					
				} else if (secondAnswer.startsWith("d") && secondChoiceD.equalsIgnoreCase(secondChoiceAnswer)) {
					
					finalScore++;
					System.out.println("Correct Answer!\n"+
										"Your score: " + finalScore + " out of " + 2 + " point(s)\n");
					
					
				} else if (!(secondAnswer.startsWith("a")) && !(secondAnswer.startsWith("b")) && !(secondAnswer.startsWith("c")) && !(secondAnswer.startsWith("d"))) {
					
					// invalid answer and game exit
					System.out.println("Invalid answer.\n"+
										"An answer must begin with a, A, b, B, c, C, D, or d.\n"+
										"Game over!");
					System.exit(0);
					
				} else {
					
					// incorrect answer
					System.out.println("Incorrect Answer!\n"+
										"Your score: " + finalScore + " out of " + 2 + " point(s)\n");
					
				}
				
				
				// third question calls
				String thirdQuestionAndChoices = MultipleChoiceFlashCardsZoeyGameEngine001.getQuestionAndChoices();
				String thirdChoiceA = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceA();
				String thirdChoiceB = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceB();
				String thirdChoiceC = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceC();
				String thirdChoiceD = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceD();
				String thirdChoiceAnswer = MultipleChoiceFlashCardsZoeyGameEngine001.getAnswer();
				
				// prints third question
				System.out.println(thirdQuestionAndChoices);
				
				// gets third question answer from user
				System.out.println("Enter your answer (a-d):");
				String thirdAnswer = keyboard.next();
				keyboard.close();
				thirdAnswer = thirdAnswer.toLowerCase();
				
				
				// checks first if answer is correct and gives 1 point for being correct; then if answer is valid and
				// if answer is valid and not correct; then answer is incorrect and no points are given
				if (thirdAnswer.startsWith("a") && thirdChoiceA.equalsIgnoreCase(thirdChoiceAnswer)) {
					
					finalScore++;
					System.out.println("Correct Answer!\n"+
										"Your score: " + finalScore + " out of " + 3 + " point(s)\n");
					
					
				} else if (thirdAnswer.startsWith("b") && thirdChoiceB.equalsIgnoreCase(thirdChoiceAnswer)) {
					
					finalScore++;
					System.out.println("Correct Answer!\n"+
										"Your score: " + finalScore + " out of " + 3 + " point(s)\n");
					
					
				} else if (thirdAnswer.startsWith("c") && thirdChoiceC.equalsIgnoreCase(thirdChoiceAnswer)) {
					
					finalScore++;
					System.out.println("Correct Answer!\n"+
										"Your score: " + finalScore + " out of " + 3 + " point(s)\n");
					
					
				} else if (thirdAnswer.startsWith("d") && thirdChoiceD.equalsIgnoreCase(thirdChoiceAnswer)) {
					
					finalScore++;
					System.out.println("Correct Answer!\n"+
										"Your score: " + finalScore + " out of " + 3 + " point(s)\n");
					
					
				} else if (!(thirdAnswer.startsWith("a")) && !(thirdAnswer.startsWith("b")) && !(thirdAnswer.startsWith("c")) && !(thirdAnswer.startsWith("d"))) {
					
					// invalid answer and game exit
					System.out.println("Invalid answer.\n"+
										"An answer must begin with a, A, b, B, c, C, D, or d.\n"+
										"Game over!");
					System.exit(0);
					
				} else {
					
					// incorrect answer
					System.out.println("Incorrect Answer!\n"+
										"Your score: " + finalScore + " out of " + 3 + " point(s)\n");
					
				}
		
		
		
		
		// Prints users final score and gives them encouragement
		if (finalScore == 0 || finalScore == 1) {
			
			System.out.println("\nYour final score: " + finalScore + " out of 3 point(s)\n"+
								"Your computer science wit needs sharpening.\n"+
								"Game Over!");
			
		} else if (finalScore == 2) {
			
			System.out.println("\nYour final score: " + finalScore + " out of 3 point(s)\n"+
								"Your computer science wit is sharp.\n"+
								"Game Over!");
			
		} else {
			
			System.out.println("\nYour final score: " + finalScore + " out of 3 point(s)\n"+
								"Your computer science wit is as sharp as Occam's razor.\n"+
								"Game Over!");
		}

	}

}
