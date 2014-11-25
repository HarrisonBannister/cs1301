
public class Test {

  public static void main(String[] args) {
    boolean error = false;
    
    Paddle paddle = new Paddle(500);
    System.out.println("\nTest #9: isCollision");
    paddle.center();
    paddle.setDirection(0);
    Ball aBall = new Ball(250, 11, 15, 400, 200);
    System.out.println(paddle.isCollision(aBall));
    if (paddle.isCollision(aBall)) {
      System.out.println("The paddle detects the collision with the ball.");
    } else {
      error = true;
      System.out.println("The paddle does not detects the collision with the ball.");
    }
    if (error) {
      System.out.println("The method isCollision has errors.");
      System.exit(-1);
     
    }

  }
}