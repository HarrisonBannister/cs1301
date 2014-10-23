
/**
* Circle.java
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
// Circle.java
//
// 
//*******************************************************
public class Circle {
	

	private double radius;
	private double x;
	private double y;
	
	//----------------------------------------------
	// Class Constructor: set the initial values of
	//                    the instance variables
	//                    for this circle
	//----------------------------------------------	
	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;  	   	
	}
	
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		return x;	
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		return y;
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		return radius;	
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double x) {
		this.x = x;
	}
	

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) {
		this.y = y;	
	}	
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) {
		if (radius>0) this.radius = radius;
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double getDiameter() {
		double diameter = radius * 2;
		return diameter;
	}
	

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double getArea() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double getPerimeter() {
		double perimeter = Math.PI * 2 * radius;
		return perimeter;
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		if (radius == 1 && Math.abs(x)+Math.abs(y) == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// Checks if circle and another instance of circle are the same
	public boolean equals(Circle anotherCircle) {
		boolean equalCircles = (this.getRadius() == anotherCircle.getRadius() && (this.getX() == anotherCircle.getX()) && (this.getY() == anotherCircle.getY())) ? true : false;
		return equalCircles;
	}
	
	// Checks if circle and another instance of circle's are concentric
	public boolean isConcentric(Circle anotherCircle) {
		boolean concentricCircles = ((this.getX() == anotherCircle.getX()) && (this.getY() == anotherCircle.getY())) ? true : false;
		return concentricCircles;
	}
	
	// Finds the distance between the center of a circle and the center of another instance of a circle
	public double distance(Circle anothercircle) {
		double distance = Math.pow((this.getX()-anothercircle.getX()), 2) + Math.pow((this.getY()-anothercircle.getY()), 2);
		distance = Math.sqrt(distance);
		return distance;
	}
	
	// Checks if circle and another instance of circle's area intersects
	public boolean intersects(Circle anothercircle) {
		double radiusSum = this.getRadius() + anothercircle.getRadius();
		if (this.distance(anothercircle)<radiusSum) {
			return true;
		} else {
			return false;
		}
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString(double radius, double x, double y) {
		String circleString = "center:(" + x + "," + y + ")\nradius: " + radius;
		return circleString;
	}

}
