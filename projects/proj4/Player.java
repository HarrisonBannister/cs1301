/*
* Player.java
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

public class Player {
	
	/**
	 * Instance Variables
	 */
	private Lamp theLamp;
	private Key theKey;
	private int xCoord;
	private int yCoord;


	// GETTERS AND SETTERS
	
	/**
	 * @return the theLamp
	 */
	public Lamp getLamp() {
		return theLamp;
	}

	/**
	 * @param theLamp the theLamp to set
	 */
	public void setLamp(Lamp theLamp) {
		this.theLamp = theLamp;
	}

	/**
	 * @return the theKey
	 */
	public Key getKey() {
		return theKey;
	}

	/**
	 * @param theKey the theKey to set
	 */
	public void setKey(Key theKey) {
		this.theKey = theKey;
	}

	/**
	 * @return the xCoord
	 */
	public int getxCoord() {
		return xCoord;
	}

	/**
	 * @param xCoord the xCoord to set
	 */
	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	/**
	 * @return the yCoord
	 */
	public int getyCoord() {
		return yCoord;
	}

	/**
	 * @param yCoord the yCoord to set
	 */
	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}
	
	
}
