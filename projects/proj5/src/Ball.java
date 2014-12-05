import java.util.Random;

public class Ball {
  /**
   * Ball.java Author: Harrison Bannister Submission Date: 12/5/14
   *
   * Purpose: This program creates the actions and attributes of a ball for a game.
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
   * Instance variables
   */
  private int x; // represents x-coordinate of ball's center
  private int y; // represents the y-coordinate of the ball's center
  private int color; // number b/t 0 and 6 that represents the ball's color
  private int radius; // radius of the ball
  private int speed; // current speed of the ball
  private int xDir; // represents the direction of the ball's movement in the x direction. It will
                    // always take the value 1 or -1. 1 will mean right, -1 will mean left

  private int yDir; // represents the direction of the ball's movement in the y direction. It will
                    // always take the value 1 or -1. 1 will mean up, -1 will mean down

  private int courtWidth; // represents width of the court in which the ball is rolling
  private int courtHeight; // represents height of the court in which the ball is rolling


  public Ball(int x, int y, int speed, int xDir, int yDir, int courtWidth, int courtHeight) {
    Random rand = new Random();

    // sets radius to random integer b/t 15 and 20
    this.radius = rand.nextInt(6) + 15;

    // sets default court width if value passed is less than the diameter of the ball
    if (this.radius * 2 >= courtWidth) {
      this.courtWidth = 700;
    } else {
      this.courtWidth = courtWidth;
    }
    // sets default court height if value passed is less than the diameter of the ball
    if (this.radius * 2 >= courtHeight) {
      this.courtHeight = 300;
    } else {
      this.courtHeight = courtHeight;
    }

    // sets color to random integer b/t 0 and 6
    this.setColor(rand.nextInt(7));

    // sets default x and y direction of the ball if value passed is not valid
    if (xDir != 1 && xDir != -1) {
      this.xDir = 1;
    } else {
      this.xDir = xDir;
    }
    if (yDir != 1 && yDir != -1) {
      this.yDir = 1;
    } else {
      this.yDir = yDir;
    }

    // sets default speed value if it is less than 0
    if (speed < 1 || speed > 5) {
      this.speed = 1;
    } else {
      this.speed = speed;
    }

    // sets default x and y position of the ball if value passed is not valid
    if (x > 0 + this.radius && x < this.courtWidth - this.radius) {
      this.x = x;
    } else {
      this.x = this.courtWidth / 2;
    }
    // sets default x position of the ball if value passed is not valid
    if (y > 0 + this.radius && y < this.courtHeight - this.radius) {
      this.y = y;
    } else {
      this.y = this.courtHeight / 2;
    }
  }

  public Ball(int x, int y, int radius, int courtWidth, int courtHeight) {
    Random rand = new Random();

    // sets color to random int b/t 0 and 6
    this.setColor(rand.nextInt(7));

    // sets default speed value to 1
    this.speed = 1;

    // sets default x and y direction of the ball if value passed is not valid
    if (this.xDir != 1 && this.xDir != -1) {
      this.xDir = 1;
    }
    if (this.yDir != 1 && this.yDir != -1) {
      this.yDir = 1;
    }

    // sets radius to 15 if value assigned is less than 15
    if (radius < 15 || radius > 20) {
      this.radius = 15;
    } else {
      this.radius = radius;
    }

    // sets default court width if value passed is less than the diameter of the ball
    if (this.radius * 2 >= courtWidth) {
      this.courtWidth = 700;
    } else {
      this.courtWidth = courtWidth;
    }
    // sets default court height if value passed is less than the diameter of the ball
    if (this.radius * 2 >= courtHeight) {
      this.courtHeight = 300;
    } else {
      this.courtHeight = courtHeight;
    }

    // sets default x and y position of the ball if value passed is not valid
    if (x > 0 + this.radius && x < this.courtWidth - this.radius) {
      this.x = x;
    } else {
      this.x = this.courtWidth / 2;
    }
    // sets default x position of the ball if value passed is not valid
    if (y > 0 + this.radius && y < this.courtHeight - this.radius) {
      this.y = y;
    } else {
      this.y = this.courtHeight / 2;
    }
  }

  public int getRadius() {
    return radius;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public int getColor() {
    return color;
  }

  public int getSpeed() {
    return speed;
  }

  public int getXDir() {
    return xDir;
  }

  public int getYDir() {
    return yDir;
  }

  public void setColor(int color) {
    if (color >= 0 && color <= 6) {
      this.color = color;
    }
  }

  public void setX(int x) {
    if (x >= this.radius && x <= this.courtWidth - this.radius) {
      this.x = x;
    }
  }

  public void setY(int y) {
    if (y >= this.radius && y <= this.courtHeight - this.radius) {
      this.y = y;
    }
  }

  public void flipYDir() {
    if (this.getYDir() == 1) {
      this.yDir = -1;
    } else {
      this.yDir = 1;
    }
  }

  public void flipXDir() {
    if (this.getXDir() == 1) {
      this.xDir = -1;
    } else {
      this.xDir = 1;
    }
  }

  public void move() {
    // variable for distance to left or right wall
    int distanceToXWall = 0;

    // if ball is closer to right use "distance to right wall", else use distance to left wall
    if (this.x > this.courtWidth - this.x) {
      distanceToXWall = this.courtWidth - this.x;
    } else {
      distanceToXWall = this.x;
    }

    // bounce the ball if radius is less than or equal to the distance of the center to the side
    // wall
    if (distanceToXWall <= this.radius) {
      if (this.x > this.courtWidth - this.x) {
        this.setX(this.x - this.speed - 1);
      } else {
        this.setX(this.x + this.speed + 1);
      }
      this.flipXDir();
    }

    int distanceToYWall = 0;

    // if ball is closer to top use "distance to top wall", else use distance to bottom
    if (this.y > this.courtHeight - this.y) {
      distanceToYWall = this.courtHeight - this.y;
    } else {
      distanceToYWall = this.y;
    }

    // bounce the ball if radius is less than or equal to the distance of the center to the side
    // wall
    if (distanceToYWall <= this.radius) {
      if (this.y > this.courtHeight - this.y) {
        this.setY(this.y - this.speed);
      } else {
        this.setY(this.y + this.speed);
      }
      this.flipYDir();
    }
    
    // moves x direction at speed
    if (this.xDir == 1) {
      this.setX(this.x + this.speed);
    } else {
      this.setX(this.x - this.speed);
    }

    // moves y direction at speed
    if (this.yDir == 1) {
      this.setY(this.y + this.speed);
    } else {
      this.setY(this.y - this.speed);
    }
  }

  public boolean isCollision(Ball anotherBall) {
    /*
     * // variables to define position of 4 sides another ball int anotherBallTop =
     * anotherBall.getY() + anotherBall.getRadius(); int anotherBallBottom = anotherBall.getY() -
     * anotherBall.getRadius(); int anotherBallLeft = anotherBall.getX() - anotherBall.getRadius();
     * int anotherBallRight = anotherBall.getX() + anotherBall.getRadius();
     * 
     * // variables to define position of this ball, the calling ball object int ballTop = this.y +
     * this.radius; int ballBottom = this.y - this.radius; int ballLeft = this.x - this.radius; int
     * ballRight = this.x + this.radius;
     */

    // set variables to find distance between the ball's centers
    int xDifference = this.x - anotherBall.getX();
    int yDifference = this.y - anotherBall.getY();
    double distanceBetweenBalls =
        Math.sqrt((xDifference * xDifference) + (yDifference * yDifference));

    // if distance between the center of the balls is less than or equal to the sum of their radius,
    // then they are colliding
    if (distanceBetweenBalls <= this.radius + anotherBall.getRadius()) {
      return true;
    } else {
      return false;
    }
  }

  public void increaseSpeed() {
    if (this.getSpeed() < 5) {
      this.speed += 1;;
    }
  }

  public void decreaseSpeed() {
    if (this.getSpeed() > 1) {
      this.speed -= 1;;
    }
  }

  @Override
  public String toString() {
    return String
        .format(
            "Ball [getRadius()=%s, getX()=%s, getY()=%s, getColor()=%s, getSpeed()=%s, getXDir()=%s, getYDir()=%s]",
            getRadius(), getX(), getY(), getColor(), getSpeed(), getXDir(), getYDir());
  }
}
