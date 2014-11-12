/*
 * PaddleTester.java
 * A program that tests the Paddle class to make
 * sure that it is working correctly. 
 */
public class PaddleTester {
    public static void main(String [] args) {
    	
		boolean error = false;
		
		System.out.println("Test: constructors and getters.");
		
		System.out.println("\nTest #1: constructor Paddle(int, int )");
		
		Paddle paddle = new Paddle(-100,-100);
		
		System.out.println("paddle:"+paddle);
		
		if(paddle.getWidth() == 100) {
			
			System.out.println("The width of the paddle is correct.");
		}
		else {
			error = true;
			System.out.println("The width of the paddle is incorrect.");
		}
		
		System.out.println("\nTest #2: constructor Paddle(int, int )");
		
		paddle = new Paddle(400,200);
		
		if(paddle.getWidth() == 400) {
			
			System.out.println("The width of the paddle is correct.");
		}
		else {
			error = true;
			System.out.println("The width of the paddle is incorrect.");
		}
		
		if (error) {
			System.out.println("constructor Paddle(int, int ) has errors.");
			System.exit(-1);
		}
		
		System.out.println("\nTest #3: constructor Paddle(int )");
		paddle = new Paddle(500);
		
		if(paddle.getWidth() == 100) {
			
			System.out.println("The width of the paddle is correct.");
		}
		else {
			error = true;
			System.out.println("The width of the paddle is incorrect.");
		}
		
		if(paddle.getHeight() == 10) {
			
			System.out.println("The height of the paddle is correct.");
		}
		else {
			error = true;
			System.out.println("The height of the paddle is incorrect.");
		}
		
		if(paddle.getSpeed() == 0) {
			
			System.out.println("The speed of the paddle is correct.");
		}
		else {
			error = true;
			System.out.println("The speed of the paddle is incorrect.");
		}
		
		if(paddle.getDirection() == 0) {
			
			System.out.println("The direction of the paddle is correct.");
		}
		else {
			error = true;
			System.out.println("The direction of the paddle is incorrect.");
		}
		 
		System.out.println("Check the paddle is centered in the court, check its x-coordinate (use the method getX)");
		System.out.println("paddle:"+paddle);
		
		if (error) {
			System.out.println("constructor Paddle(int) has errors.");
			System.exit(-1);
		}
		
		
		System.out.println("\nTest #4: setDirection");
	 	
	 	
		paddle.setDirection(2);
		if(paddle.getDirection() == 0) {
			
			System.out.println("The direction of the paddle is correct.");
		}
		else {
			error = true;
			System.out.println("The direction of the paddle is incorrect.");
		}
		
		paddle.setDirection(-2);
		if(paddle.getDirection() == 0) {
			
			System.out.println("The direction of the paddle is correct.");
		}
		else {
			error = true;
			System.out.println("The direction of the paddle is incorrect.");
		}

		paddle.setDirection(1);
		if(paddle.getDirection() == 1) {
			
			System.out.println("The direction of the paddle is correct.");
		}
		else {
			error = true;
			System.out.println("The direction of the paddle is incorrect.");
		}
		
		error=false;

		
		System.out.println("\nTest #5: setSpeed");
		
		
		paddle.setSpeed(-100);
		if (paddle.getSpeed()!=-100)
		{
			System.out.println("the set speed function is correct");
		}
		else
		{
			error=true;
			System.out.println("the set speed function is incorrect");
		}
		paddle.setSpeed(10);
		if (paddle.getSpeed() == 10)
		{
			System.out.println("the set speed function is correct");
		}
		else
		{
			error=true;
			System.out.println("the set speed function is incorrect");
		}
		
		
		if (error) {
			System.out.println("some setters have errors.");
			System.exit(-1);
		}		
		
		System.out.println("\nTest #6: move once");

		
		paddle.center();
		paddle.setSpeed(8);
		paddle.setDirection(-1);
		int temp = paddle.getX();
		paddle.move();
		if(paddle.getX() != temp-8)
		{
			error=true;
			System.out.println("single paddle move to the left is incorrect");
		}
		else
		{
			System.out.println("single paddle move to the left is correct");
		}
		
		paddle.center();
		paddle.setSpeed(8);
		paddle.setDirection(1);
		temp = paddle.getX();
		paddle.move();
		if(paddle.getX()!=temp+8)
		{
			error=true;
			System.out.println("single paddle move to the right is incorrect");
		}
		else
		{
			System.out.println("single paddle move to the right is correct");
		}
		
		System.out.println("\nTest #7: move to the right several times but never outside the court");
		paddle.center();
		paddle.setSpeed(8);
		paddle.setDirection(-1);
		
		for (int i=1;i<100;i++) {
			paddle.move();
		}
		
		if (paddle.getX() + paddle.getWidth() > 400) {
			error = true;
			System.out.println("The paddle move to the right outside the court.");
		}
		else
		{
			System.out.println("the paddle move to the right is correct");
		}
		
		
		paddle.center();
		paddle.setSpeed(8);
		paddle.setDirection(1);
		
		System.out.println("\nTest #8: move to the left several times but never outside the court");
		
		for (int i=1;i<100;i++) {
			paddle.move();
		}
		
		if (paddle.getX()<0) {
			error = true;
			System.out.println("The paddle move to the left outside the court.");
		}
		else
		{
			System.out.println("the paddle move to the left is correct");
		}
		
		
		if (error) {
			System.out.println("The method move has errors.");
			System.exit(-1);
		}		
				
		
		System.out.println("\nTest #9: isCollision");
		
		
		paddle.center();
		paddle.setDirection(0);
		
		Ball aBall = new Ball(250, 17, 15, 400, 200);
		
		if (paddle.isCollision(aBall)) {
		   System.out.println("The paddle detects the collision with the ball.");
			
		}
		else {
			error=true;
			System.out.println("The paddle does not detects the collision with the ball.");
		}
		
		if (error) {
			System.out.println("The method isCollision has errors.");
			System.exit(-1);
		}		
	   
		

    }

}
