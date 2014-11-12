package lab11;

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

public class Person {
	/*
	 * Instance Variables
	 */
	private int age;
	private String name;
	private boolean isFemale;
	/*
	 * Static Variables
	 */
	private static int totalPersons;
	private static int totalFemales;
	private static int totalAge;
	
	Person(int age, String name, boolean isFemale) {
		totalPersons++;
		if (isFemale == true) {
			totalFemales++;
		}
		totalAge+=age;
		this.setAge(age);
		this.setName(name);
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		if (age>0) {
			this.age = age;
		}
		totalAge+=age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if (name != null) this.name = name;
		this.name = "Unknown";
	}

	/**
	 * @return the isFemale
	 */
	public boolean isFemale() {
		return isFemale;
	}

	/**
	 * @param isFemale the isFemale to set
	 */
	public void setFemale(boolean isFemale) {
		this.isFemale = isFemale;
		if (isFemale == true) {
			totalFemales++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public boolean equals(Person person) {
		// method returns true if person in the parameter is equal to the calling object's
		if (person.age == this.age && person.name.equalsIgnoreCase(this.name) && person.isFemale == this.isFemale) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isYounger(Person person) {
		if (person.age<this.age) {
			return true;
		}
		return false;
	}
	
	public static void toString(Person person) {
		String gender = (person.isFemale == true) ? "Female\n" : "Male\n";
		System.out.println("Name:\t" + person.name +"\nAge:\t" + person.age + "\n" + gender);
	}
	
	public static double avgAge() {
		double avgAge = totalAge / totalPersons;
		return avgAge;
	}
	
	public static int howManyPeople() {
		return totalPersons;
	}

	public static int howManyFemales() {
		return totalFemales;
	}
	
}
