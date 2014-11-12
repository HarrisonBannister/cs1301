package lab11;

/*
 * PersonTester.java
 * Author: Harrison Bannister
 * Submission Date: 11/12/14
 *
 * Purpose: This program tests person objects created by Person.java.
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

public class PersonTester {

	public static void main(String[] args) {

		Person person1 = new Person(23, "Marcus Smith", false);
		Person person2 = new Person(21, "Mary Brown", true);
		Person person3 = new Person(40, "Pat", false);
		Person person4 = new Person(25, "Marcus Smith", false);

		Person.toString(person1);
		Person.toString(person2);
		Person.toString(person3);
		Person.toString(person4);

		person1.setAge(person1.getAge() + 1);
		System.out.println(person1.getAge());
		person2.setAge(-12);
		System.out.println(person2.getAge());

		person3.setName(null);
		person3.setFemale(true);
		Person.toString(person3);

		if (person4.isYounger(person3)) {
			System.out.println("Person 4 is younger than person 3.");
		} else {
			System.out.println("Person 3 is younger than person 4.");
		}

		System.out.println("Total People:\t" + Person.howManyPeople()
				+ "\nTotal Females:\t" + Person.howManyFemales()
				+ "\nAverage Age:\t" + Person.avgAge());
	}

}