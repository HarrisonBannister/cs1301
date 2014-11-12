public class Ball {
  /*
   * Instance Variables
   */
  private int x; // represents x-coordinate of ball's center
  private int y; // represents the y-coordinate of the ball's center
  private int color; // number b/t 0 and 6 that represents the ball's color
  private int radius; // radius of the ball
  private int speed; // current speed of the ball
  private int xDir; // represents the direction of the ball's movement in the x direction. It will always take the value 1 or -1. 1 will mean right, -1 will mean left
  private int yDir; // represents the direction of the ball's movement in the y direction. It will always take the value 1 or -1. 1 will mean up, -1 will mean down
  private int courtWidth; // represents width of the court in which the ball is rolling
  private int courtHeight; // represents width of the court in which the ball is rolling
  public Ball(int x, int y, int speed, int xDir, int yDir, int courtWidth,
      int courtHeight) {
  }
  public Ball(int x, int y, int radius, int courtWidth, int courtHeight) {
  }
  public int getRadius() {
  }
  public int getX() {
  }
  public int getY() {
  }
  public int getColor() {
  }
  public int getSpeed() {
  }
  public int getXDir() {
  }
  public int getYDir() {
  }
  public void setColor(int color) {
  }
  public void setX(int x) {
  }
  public void setY(int y) {
  }
  public void flipYDir() {
  }
  public void flipXDir() {
  }
  public void move() {
  }
  public boolean isCollision(Ball anotherBall) {
  }
  public void increaseSpeed() {
  }
  public void decreaseSpeed() {
  }
  @Override
  public String toString() {
    return String
        .format("Ball [getRadius()=%s, getX()=%s, getY()=%s, getColor()=%s, getSpeed()=%s, getXDir()=%s, getYDir()=%s]",
            getRadius(), getX(), getY(), getColor(), getSpeed(),
            getXDir(), getYDir());
  }
}