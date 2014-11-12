public class Paddle {
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

  public Paddle(int courtWidth) {}

  public Paddle(int width, int courtWidth) {}

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

  public void setDirection(int direction) {}

  public void setSpeed(int speed) {}

  /*
   * Procedures
   */
  public void move() {}

  public void center() {}

  /*
   * Functions
   */
  public boolean isCollision(Ball aBall) {}

  /*
   * toString procedure:
   * 
   * @see java.lang.Object#toString()
   */
  public String toString() {}
}
