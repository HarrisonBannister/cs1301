/*
 * BallTester.java A program that tests the Ball class to make sure that it is working correctly.
 */
public class BallTester {
  public static void main(String[] args) {
    Ball ball1 = new Ball(100, 100, 5, 1, 1, 500, 200);
    System.out.println("Test #1: constructor Ball(int, int,int ,int ,int, int, int ) and getters.");
    System.out.println("ball1:" + ball1);
    // ///////////////////////////////// Test 1
    // /////////////////////////////////////
    // //////////////////////////Testing Object
    // Creation/////////////////////////////
    // //////////////////////////////////&
    // getters///////////////////////////////////
    if (ball1.getX() == 100) {
      System.out.println("x-coordinate of ball1 is correct.");
    } else {
      System.out.println("Test #1: x-coordinate of ball1 is incorrect!");
    }
    if (ball1.getY() == 100) {
      System.out.println("y-coordinate of ball1 is correct.");
    } else {
      System.out.println("Test #1: y-coordinate of ball1 is incorrect!");
    }
    if (ball1.getRadius() >= 15 && ball1.getRadius() <= 20) {
      System.out.println("the radius of ball1 is correct.");
    } else {
      System.out.println("Test #1: the radius of ball1 is incorrect!");
    }
    if (ball1.getColor() >= 0 && ball1.getColor() <= 6) {
      System.out.println("the color of ball1 is correct.");
    } else {
      System.out.println("Test #1: the color of ball1 is incorrect!");
    }
    if (ball1.getSpeed() > 0 && ball1.getSpeed() <= 5) {
      System.out.println("the speed of ball1 is correct.");
    } else {
      System.out.println("Test #1: the speed of ball1 is incorrect!");
    }
    if (ball1.getXDir() == 1 || ball1.getXDir() == -1) {
      System.out.println("the x-direction of ball1 is correct.");
    } else {
      System.out.println("Test #1: the x-direction of ball1 is incorrect!");
    }
    if (ball1.getYDir() == 1 || ball1.getYDir() == -1) {
      System.out.println("the y-direction of ball1 is correct.");
    } else {
      System.out.println("Test #1: the y-direction of ball1 is incorrect!");
    }
    // ///////////////////////////////// Test 2
    // /////////////////////////////////////
    // //////////////////////////Testing Object
    // Creation/////////////////////////////
    // //////////////////////////////////&
    // getters///////////////////////////////////
    System.out
        .println("\nTest #2: test the constructor Ball(int, int,int ,int ,int, int, int) and getters.");
    Ball ball2 = new Ball(-100, -100, 7, 0, -2, 200, 300);
    System.out.println("ball2:" + ball2);
    if (ball2.getX() == 100) {
      System.out.println("x-coordinate of ball2 is correct.");
    } else {
      System.out.println("Test #2: x-coordinate of ball2 is incorrect!");
    }
    if (ball2.getY() == 150) {
      System.out.println("y-coordinate of ball2 is correct.");
    } else {
      System.out.println("Test #2: y-coordinate of ball2 is incorrect!");
    }
    if (ball2.getRadius() >= 15 && ball2.getRadius() <= 20) {
      System.out.println("the radius of ball2 is correct.");
    } else {
      System.out.println("Test #2: the radius of ball2 is incorrect!");
    }
    if (ball2.getColor() >= 0 && ball2.getColor() <= 6) {
      System.out.println("the color of ball2 is correct.");
    } else {
      System.out.println("Test #2: the color of ball2 is incorrect!");
    }
    if (ball2.getSpeed() > 0 && ball2.getSpeed() <= 5) {
      System.out.println("the speed of ball2 is correct.");
    } else {
      System.out.println("Test #2: the speed of ball2 is incorrect!");
    }
    if (ball2.getXDir() == 1 || ball2.getXDir() == -1) {
      System.out.println("the x-direction of ball2 is correct.");
    } else {
      System.out.println("Test #2: the x-direction of ball2 is incorrect!");
    }
    if (ball1.getYDir() == 1 || ball1.getYDir() == -1) {
      System.out.println("the y-direction of ball2 is correct.");
    } else {
      System.out.println("Test #2: the y-direction of ball2 is incorrect!");
    }
    // ///////////////////////////////// Test 3
    // /////////////////////////////////////
    // //////////////////////////////Testing
    // Setters/////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////////
    // System.out.println("Testing Setters.");
    ball1 = new Ball(100, 100, 5, 1, 1, 500, 200);
    // System.out.println("ball1:" + ball1);
    System.out.println("\nTest #3: setColor.");
    int color_temp = ball1.getColor();
    ball1.setColor(-8);
    System.out.println("Color value" + ball1.getColor());
    if (ball1.getColor() == color_temp) {
      System.out.println("the setting of the color is correct.");
    } else {
      System.out.println("Test #3: the setting of the color is incorrect!");
    }
    // ///////////////////////////////// Test 4
    // /////////////////////////////////////
    // //////////////////////////////Testing
    // Setters/////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////////
    System.out.println("\nTest #4: setX and setY.");
    ball1 = new Ball(100, 100, 5, 1, 1, 500, 200);
    System.out.println("x coord: " + ball1.getX());
    System.out.println("y coord: " + ball1.getY());
    //System.out.println("ball1:" + ball1);
    ball1.setX(-200);
    System.out.println("x coord: " + ball1.getX());
    ball1.setY(400);
    System.out.println("y coord: " + ball1.getY());
    if (ball1.getX() == 100) {
      System.out.println("x-coordinate of ball1 is correct.");
    } else {
      System.out.println("Test #4: x-coordinate of ball1 is incorrect!");
    }
    if (ball1.getY() == 100) {
      System.out.println("y-coordinate of ball1 is correct.");
    } else {
      System.out.println("Test #4: y-coordinate of ball1 is incorrect!");
    }
    // ///////////////////////////////// Test 5
    // /////////////////////////////////////
    // //////////////////////////////Testing
    // Speed///////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////////
    System.out.println("\nTest #5: increase speed.");
    ball1 = new Ball(100, 100, 5, 1, 1, 500, 200);
    for (int i = 1; i <= 25; i++) {
      ball1.increaseSpeed();
    }
    if (ball1.getSpeed() > 0 && ball1.getSpeed() <= 5) {
      System.out.println("The method increase speed is correct");
    } else {
      System.out.println("Test #5: The method increase speed is incorrect!");
    }
    // ///////////////////////////////// Test 6
    // /////////////////////////////////////
    // //////////////////////////////Testing
    // Speed///////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////////
    System.out.println("\nTest #6: decrease speed.");
    ball1 = new Ball(100, 100, 5, 1, 1, 500, 200);
    for (int i = 1; i <= 25; i++) {
      ball1.decreaseSpeed();
    }
    if (ball1.getSpeed() > 0 && ball1.getSpeed() <= 5) {
      System.out.println("The method decrease speed is correct");
    } else {
      System.out.println("Test #6: The method decrease speed is incorrect!");
    }
    // ///////////////////////////////// Test 7
    // /////////////////////////////////////
    // //////////////////////////////Testing
    // flipDir////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////////
    System.out.println("\nTest #7: flipXDir and flipYDir.");
    ball1 = new Ball(100, 100, 5, 1, 1, 500, 200);
    System.out.println("ball1 current XDir: " + ball1.getXDir());
    System.out.println("ball1 current YDir: " + ball1.getYDir());
    ball1.flipXDir();
    if (ball1.getXDir() == -1) {
      System.out.println("flipXDir is correct");
    } else {
      System.out.println("Test #7: flipXDir is incorrect!");
    }
    ball1.flipYDir();
    if (ball1.getYDir() == -1) {
      System.out.println("flipYDir is correct");
    } else {
      System.out.println("Test #7: flipYDir is incorrect!");
    }
    // ///////////////////////////////// Test 8
    // /////////////////////////////////////
    // //////////////////////////////Testing
    // Move()//////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////////
    System.out.println("\nTest #8: move.");
    ball1 = new Ball(100, 100, 5, 1, 1, 500, 200);
    ball1.move();
    if (ball1.getX() == 105) {
      System.out.println("move of ball1 in the x direction is correct.");
    } else {
      System.out.println("Test #8: move of ball1 in the x direction is incorrect!");
    }
    if (ball1.getY() == 105) {
      System.out.println("move of ball1 in the y direction is correct.");
    } else {
      System.out.println("Test #8: move of ball1 in the y direction is incorrect!");
    }
    // ///////////////////////////////// Test 9
    // /////////////////////////////////////
    // //////////////////////////////Testing
    // Move()//////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////////
    System.out.println("\nTest #9: fliping the direction of the ball and move.");
    ball1 = new Ball(100, 100, 5, 1, 1, 500, 200);
    ball1.flipXDir();
    ball1.flipYDir();
    ball1.move();
    if (ball1.getX() == 95) {
      System.out.println("move of ball1 in the x direction is correct.");
    } else {
      System.out.println("Test #9: move of ball1 in the x direction is incorrect!");
    }
    if (ball1.getY() == 95) {
      System.out.println("move of ball1 in the y direction is correct.");
    } else {
      System.out.println("Test #9: move of ball1 in the y direction is incorrect!");
    }
    // ///////////////////////////////// Test 10
    // ////////////////////////////////////
    // //////////////////////////////Testing
    // Move()//////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////////
    System.out.println("\nTest #10: bouncing at the bottom and move.");
    ball1 = new Ball(100, 100, 5, 1, 1, 500, 200);
    ball1.flipYDir();
    ball1.setY(ball1.getRadius()); // Put the ball at the bottom
    ball1.move();
    if (ball1.getYDir() == 1) {
      System.out.println("bouncing at the bottom is correct.");
    } else {
      System.out.println("Test #10: bouncing at the bottom is incorrect!");
    }
    // ///////////////////////////////// Test 11
    // ////////////////////////////////////
    // //////////////////////////////Testing
    // Move()//////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////////
    System.out.println("\nTest #11: bouncing at the top.");
    ball1 = new Ball(100, 100, 5, 1, 1, 500, 200);
    ball1.setY(200 - ball1.getRadius()); // Put the ball at the top
    ball1.move();
    if (ball1.getYDir() == -1) {
      System.out.println("bouncing at the top is correct");
    } else {
      System.out.println("Test #11: bouncing at the top is incorrect.");
    }
    // ///////////////////////////////// Test 12
    // ////////////////////////////////////
    // //////////////////////////////Testing
    // Move()//////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////////
    System.out.println("\nTest #12: bouncing at the left");
    ball1 = new Ball(100, 100, 5, 1, 1, 500, 200);
    ball1.setX(ball1.getRadius()); // Put the ball at the left
    ball1.flipXDir();
    ball1.move();
    if (ball1.getXDir() == 1) {
      System.out.println("bouncing at the left is correct.");
    } else {
      System.out.println("Test #12: bouncing at the left is incorrect.");
    }
    // ///////////////////////////////// Test 13
    // ////////////////////////////////////
    // //////////////////////////////Testing
    // Move()//////////////////////////////////
    // /////////////////////////////////////////////////////////////////////////////
    System.out.println("\nTest #13: bouncing at the right.");
    ball1 = new Ball(100, 100, 5, 1, 1, 500, 200);
    ball1.setX(500 - ball1.getRadius()); // Put the ball at the right
    ball1.move();
    if (ball1.getXDir() == -1) {
      System.out.println("bouncing at the right is correct");
    } else {
      System.out.println("Test #13: bouncing at the right is incorrect!");
    }
    // ///////////////////////////////// Test 14 & 15
    // ///////////////////////////////
    // /////////////////////////////Testing isCollision
    // /////////////////////////////
    // //////////////////////////////////////////////////////////////////////////////
    System.out.println("\nTest #14:isCollision");
    ball1 = new Ball(100, 100, 5, 1, 1, 500, 200);
    ball2 = new Ball(100 + ball1.getRadius() + 12, 100, 16, 500, 200);
    System.out.println("ball1" + ball1);
    System.out.println("ball2" + ball2);
    if (ball1.isCollision(ball2)) {
      System.out.println("Collision is correct.");
    } else {
      System.out.println("Test #14: Collision is incorrect.");
    }
    System.out.println("\nTest #15:isCollision ");
    ball2.setY(ball1.getY() + ball1.getRadius() + ball2.getRadius() + 1);
    System.out.println("ball1" + ball1);
    System.out.println("ball2" + ball2);
    if (ball1.isCollision(ball2)) {
      System.out.println("Test #15: Collision is incorrect.");
    } else {
      System.out.println("Collision is correct.");
    }
  }
}
