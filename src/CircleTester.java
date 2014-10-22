
/**
* CircleTester.java
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

//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
// 
//*******************************************************
public class CircleTester{
	
	public static void main(String[] args) {
		
		Circle circle1= new Circle(0.0,0.0,2);
		Circle circle2= new Circle(2.0,1.0,1);
		
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		
		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); 
		
		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);
		
		
		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		// the method toString, why?
		// System.out.println("Center: ("+circle1.getX()+","+circle1.getY()+") Radius: "+circle1.getRadius());
		System.out.println("circle1="+circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		// System.out.println("Center: ("+circle1.getX()+","+circle1.getY()+") Radius: "+circle1.getRadius());
		System.out.println("circle2="+circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: "+circle1.getDiameter()+"\nArea: "+circle1.getArea()+"\nPerimeter: "+circle1.getPerimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: "+circle2.getDiameter()+"\nArea: "+circle2.getArea()+"\nPerimeter: "+circle2.getPerimeter());
		
		// display whether circle1 is a unit circle
		if (circle1.isUnitCircle() == true) {
			System.out.println("Circle 1 is a unit circle.");
		} else {
			System.out.println("Circle 1 is not a unit circle.");
		}
		
		// display whether circle2 is a unit circle
		if (circle2.isUnitCircle() == true) {
			System.out.println("Circle 2 is a unit circle.");
		} else {
			System.out.println("Circle 2 is not a unit circle.");
		}
		
		// your additional tests should be placed below here
		
				
	}
	
}
