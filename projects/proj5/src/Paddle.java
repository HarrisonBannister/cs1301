public class Paddle {
  /**
   * Paddle.java Author: Harrison Bannister Submission Date: 12/5/14
   *
   * Purpose: This program creates the actions and attributes of the paddle in a ball and paddle
   * game.
   *
   * Statement of Academic Honesty:
   *
   * The following code represents my own work. I have neither received nor given inappropriate
   * assistance. I have not copied or modified code from any source other than the course webpage or
   * the course textbook. I recognize that any unauthorized assistance or plagiarism will be handled
   * in accordance with the University of Georgia's Academic Honesty Policy and the policies of this
   * course. I recognize that my work is based on an assignment created by the Department of
   * Computer Science at the University of Georgia. Any publishing or posting of source code for
   * this project is strictly prohibited unless you have written consent from the Department of
   * Computer Science at the University of Georgia.
   */

  /*
   * Instance Variables
   */
  private int x; // represents the x-coordinate of the left upper corner of the paddle
  private int width; // represents the width of the paddle
  private int height; // represents the height of the paddle
  private int speed; // represents the speed at which the paddle moves to the right or the left
  private int direction; // represents the direction of the paddle's movement on the x direction. It
                         // will always take the value 1, 0, or -1. 1 will mean "moving right", 0
                         // will mean "not moving left or right", and -1 will mean "moving left"
  private int courtWidth; // represents the width of the court in which the paddle is moving

  public Paddle(int courtWidth) {
    // sets default values
    this.width = 100;
    this.height = 10;
    this.direction = 0;
    this.speed = 0;

    // sets court width to value passed when it is greater than the paddle's width
    if (courtWidth >= this.width) {
      this.courtWidth = courtWidth;
    } else {
      this.courtWidth = 700;
    }

    // centers paddle and puts it on the bottom back of the court
    this.x = (this.courtWidth / 2) - 50;
    System.out.println("paddle x coord " + this.x);
  }

  public Paddle(int width, int courtWidth) {
    // sets non-conditional default values
    this.height = 10;
    this.direction = 0;
    this.speed = 0;

    // sets default paddle and court width, needs more conditions
    if (width < 1) {
      this.width = 100;
    } else {
      this.width = width;
    }
    if (courtWidth < 1) {
      this.courtWidth = 700;
    }
    if (courtWidth < width) {
      this.courtWidth = 700;
    }

    // centers paddle and puts it on the bottom back of the court
    this.x = (this.courtWidth / 2) - (this.width / 2);
    System.out.println("paddle x coord " + this.x);
  }

  public int getX() {
    return x;
  }

  public int getDirection() {
    return direction;
  }

  public int getSpeed() {
    return speed;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public void setDirection(int direction) {
    if (direction == 1 || direction == -1) {
      this.direction = direction;
    }
  }

  public void setSpeed(int speed) {
    if (speed > 0) {
      this.speed = speed;
    }
  }

  /*
   * Procedures
   */
  public void move() {
    if (this.direction == 1 && this.x + this.width < this.courtWidth) {
      this.x += this.speed;
    }
    if (this.direction == -1 && this.x > 0) {
      this.x -= this.speed;
    }
  }

  public void center() {
    this.x = (this.courtWidth / 2) - (this.width / 2);
  }

  /*
   * Functions
   */
  public boolean isCollision(Ball aBall) {
    /*
     * // variables to define position of 3 sides of the ball that could hit paddle int ballBottom =
     * aBall.getY() - aBall.getRadius(); int ballRight = aBall.getX() + aBall.getRadius(); int
     * ballLeft = aBall.getX() - aBall.getRadius();
     * 
     * // position of top of the paddle int paddleRightEdge = this.x + this.width;
     * 
     * if (ballBottom == this.height && aBall.getX() >= this.x && aBall.getX() <= paddleRightEdge) {
     * return true; } else if (ballBottom < this.height && ballLeft == paddleRightEdge && ballRight
     * == this.x) { return true; } else { return false; }
     */

    // the closest point on the paddle's border to the center of the ball
    int closestPaddleX = 0;
    int closestPaddleY = 0;
    int xDifference = 0;
    int yDifference = 0;
    int paddleRightEdge = this.x + this.width;

    if (aBall.getX() < this.x) {
      closestPaddleX = this.x;
    } else if (aBall.getX() > paddleRightEdge) {
      closestPaddleX = paddleRightEdge;
    } else {
      closestPaddleX = aBall.getX();
    }

    if (aBall.getY() > this.height) {
      closestPaddleY = this.height;
    } else {
      closestPaddleY = aBall.getY();
    }

    // set variables to find distance between the ball's centers
    xDifference = aBall.getX() - closestPaddleX;
    yDifference = aBall.getY() - closestPaddleY;
    double distanceBetweenPoints =
        Math.sqrt((xDifference * xDifference) + (yDifference * yDifference));

    // the distance between the center and the closest point on paddle is less than or equal to the
    // radius,
    // then ball is colliding with the paddle
    if (distanceBetweenPoints <= aBall.getRadius()) {
      return true;
    } else {
      return false;
    }
  }
}
