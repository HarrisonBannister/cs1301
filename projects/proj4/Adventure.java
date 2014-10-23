import java.util.Scanner;

/*
* Adventure.java
* Author: Harrison Bannister
* Submission Date: [Submission date here]
*
* Purpose: This program leads the user through an interactive fiction 
* game, "The Adventure of the Cave of Redundancy Adventure".
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

public class Adventure {

	public static void main(String[] args) {
		
		Player player = new Player();
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to UGA Adventures: Episode 1\n"+
							"The Adventure of the Cave of Redundancy Adventure"+
							"By: Harrison Bannister");

	}
	
	public static boolean checkForValidInput(String playerInput) {
		if (!(playerInput.equalsIgnoreCase("get lamp")) && !(playerInput.equalsIgnoreCase("light lamp"))&&
				!(playerInput.equalsIgnoreCase("north"))&& !(playerInput.equalsIgnoreCase("south"))&&
				!(playerInput.equalsIgnoreCase("east")) && !(playerInput.equalsIgnoreCase("west"))&&
				!(playerInput.equalsIgnoreCase("get lamp"))) {
			return true;
		} else {
			return false;
		}
	}
	

}