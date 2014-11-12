
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

// DO NOT MODIFY THIS CODE
// DO NOT MODIFY THIS CODE
// DO NOT MODIFY THIS CODE
// DO NOT MODIFY THIS CODE
// DO NOT MODIFY THIS CODE


// Application panel
@SuppressWarnings("all")
public class Project5Game extends JPanel {
	
	final static String[] gameModeString= {"Ball","Paddle","Game"};
	final static String[] ballsString= {"1","2","3","4","5"};
	//final static String[] ballsString= {"1","2","3","4","5","6","7","8","9","10"};
	final static String[] paddleSpeedString= {"1","2","3","4","5","6","7","8","9","10"};
	private final static int TEST_BALL = 0;
	private final static int TEST_PADDLE= 1;
	private final static int FULL_GAME = 2;
	
    
 	/**
 	 * Constructor: Application Panel
 	 *
 	 */
	Project5Game() {
        //
        // Set buttons and other controls in the panel
        //
    	
        final JButton startButton = new JButton("Start");        
        final JButton ballsFasterButton  = new JButton("+");
        final JButton ballsSlowerButton  = new JButton("-");
        final JLabel scorelbl = new JLabel("");
        final JLabel timelbl = new JLabel("");
        final JComboBox modeList = new JComboBox(gameModeString);
        final JComboBox ballsList = new JComboBox(ballsString);
        final JComboBox paddleList = new JComboBox(paddleSpeedString);        
        final GamePanel gameArea = new GamePanel(timelbl, scorelbl);  // Panel that display the balls

        
        timelbl.setPreferredSize(new Dimension(20,20));        
        scorelbl.setPreferredSize(new Dimension(30,20));    
    	paddleList.setEnabled(false);
    	ballsList.setEnabled(true);
    	ballsFasterButton.setEnabled(true);
    	ballsSlowerButton.setEnabled(true);
    	
    	
    	JPanel controlArea = new JPanel();
    	controlArea.setLayout(new BoxLayout(controlArea, BoxLayout.Y_AXIS));
    	
    	
    	   	
    	JPanel startPanel = new JPanel();
    	startPanel.add(startButton);
    	controlArea.add(startPanel);
    	
    	JPanel timeScorePanel = new JPanel();
    	timeScorePanel.add(new JLabel("   Time Left:"));
        timeScorePanel.add(timelbl);     
		
       
        timeScorePanel.add(new JLabel("Score:"));
        timeScorePanel.add(scorelbl);
                
        controlArea.add(timeScorePanel);
        
        JPanel settingsPanel = new JPanel();
        settingsPanel.setLayout(new BoxLayout(settingsPanel, BoxLayout.Y_AXIS));
    	
    	JPanel modePanel = new JPanel();
    	modePanel.add(new JLabel("        Mode:"));
        modePanel.add(modeList);
        settingsPanel.add(modePanel);
       
       	JPanel ballsNumberPanel = new JPanel();
	    ballsNumberPanel.add(new JLabel("Balls:"));
        ballsNumberPanel.add(ballsList);
        settingsPanel.add(ballsNumberPanel);


        JPanel speedPanel = new JPanel();
       
        speedPanel.setLayout(new BoxLayout(speedPanel, BoxLayout.Y_AXIS));
        
        JPanel paddleSpeedPanel = new JPanel();
        paddleSpeedPanel.add(new JLabel("Paddle:"));  	
    	paddleSpeedPanel.add(paddleList);
   
    	speedPanel.add(paddleSpeedPanel);
        
        JPanel ballsSpeedPanel = new JPanel();      
        ballsSpeedPanel.add(new JLabel("  Balls:"));
        ballsSpeedPanel.add(ballsFasterButton);
        ballsSpeedPanel.add(ballsSlowerButton);
        speedPanel.add(ballsSpeedPanel);
        
        settingsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Settings"));
        speedPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Speed"));
        controlArea.add(settingsPanel);
        controlArea.add(speedPanel);
        
        
        
        this.setLayout(new GridBagLayout());
    	GridBagConstraints gbc = new GridBagConstraints();
    	this.setBackground(new Color(238,238,238));
    	
    	gbc.fill = GridBagConstraints.HORIZONTAL;
        
	    gbc.gridy = 1;
		gbc.gridx = 1;
   		gbc.gridwidth = 1;
   		gbc.gridheight = 1;
   		gbc.insets = new Insets(20,0,0,0);
		this.add(controlArea, gbc);
        
        gbc.gridy = 1;
		gbc.gridx = 2;
   		gbc.gridwidth = 2;
   		gbc.gridheight = 2;
   		gbc.insets= new Insets(0,0,0,0);
        
	    this.add(gameArea, gbc);
	   
        
        //
        // Setting Button Listeners
        //
                
              
        startButton.addActionListener(new ActionListener()   {
            public void actionPerformed(ActionEvent e) {
            	gameArea.startGame(Integer.parseInt((String) ballsList.getSelectedItem()));
            	gameArea.setAnimation(true);
            	gameArea.setPaddleSpeed(Integer.parseInt((String) paddleList.getSelectedItem()));
            	int mode = modeList.getSelectedIndex();
            }
        });
        
        ballsFasterButton.addActionListener(new ActionListener()   {
            public void actionPerformed(ActionEvent e) {
            	gameArea.increaseSpeed();
            	gameArea.requestFocus();
            	
            }
        });
        
        ballsSlowerButton.addActionListener(new ActionListener()   {
            public void actionPerformed(ActionEvent e) {
            	gameArea.decreaseSpeed();
            	gameArea.requestFocus();            	
            }
        });
        
        modeList.addActionListener(new ActionListener()   {
            public void actionPerformed(ActionEvent e) {
            	int mode = modeList.getSelectedIndex();
            	gameArea.setMode(mode);
            	gameArea.setAnimation(false);
               	gameArea.requestFocus();            	
        		ballsList.setEnabled(false);
				ballsFasterButton.setEnabled(false);
				ballsSlowerButton.setEnabled(false);
				paddleList.setEnabled(false);

       	        if (mode == TEST_BALL || mode == FULL_GAME) {
            		ballsList.setEnabled(true);
    				ballsFasterButton.setEnabled(true);
    				ballsSlowerButton.setEnabled(true);
            		
            	}
            	if (mode == TEST_PADDLE || mode == FULL_GAME) {
            			paddleList.setEnabled(true);
            	}

            }
        });;        

		ballsList.addActionListener(new ActionListener()   {
            public void actionPerformed(ActionEvent e) {
            	gameArea.addBalls(Integer.parseInt((String) ballsList.getSelectedItem()));
            	gameArea.requestFocus();            	
            }
        });

		paddleList.addActionListener(new ActionListener()   {
            public void actionPerformed(ActionEvent e) {
            	gameArea.setPaddleSpeed(Integer.parseInt((String) paddleList.getSelectedItem()));
            	gameArea.requestFocus();            	
            }
        });
 
    }
    
 
    public static void main(String[] args) {
        JFrame win = new JFrame("Project 5");
        win.setBackground(new Color(238,238,238));
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setContentPane(new Project5Game());
        win.getContentPane().setBackground(Color.lightGray);       
        win.pack();
        win.setVisible(true);
        win.setResizable(false);
        
    }
}

//
// Panel that display the balls and control the animation stuff
//
@SuppressWarnings("all")
class GamePanel extends JPanel implements KeyListener {
	
	// Static variables 
	
    //private final static Color[] colors = { Color.BLACK, Color.BLACK, Color.BLACK, Color.RED, Color.RED, Color.RED, Color.RED};
    private final static Color[] colors = { Color.GREEN, Color.ORANGE, Color.BLACK, Color.RED, Color.CYAN, Color.MAGENTA, Color.LIGHT_GRAY};
	private final static Random random = new Random();

	private final static int MAX_TIME = 60000;	// 60 seconds	
	private final static int WIDTH = 700;	    // Panel's width
	private final static int HEIGHT = 300;	    // Panel's height
	private final static int TEST_BALL = 0;
	private final static int TEST_PADDLE= 1;
	private final static int FULL_GAME = 2;
	
    // The collection of balls in this panel
    private ArrayList<Ball> balls  = new ArrayList<Ball>();

    
    // Instance variables for the animation
    private int   interval  = 20;  // Milliseconds between animation updates.
    private Timer timer;           // Timer for animation
    private int   mode;
    

    // Instance variables for the animation 
    private int time;
    private int score;
    private JLabel lblScore;
    private JLabel lblTimeLeft;
    private int maxBalls;
    private Paddle paddle;
    
    /*
     * Constructor: Set panel size, creates a timer
     * and other necessary initializations/
     * 
     */
    public GamePanel(JLabel lblTimeLeft, JLabel lblScore) {
    	this.setBorder(BorderFactory.createLineBorder (Color.blue, 2));
    	this.setBackground(Color.white);
    	this.setMinimumSize(new Dimension(WIDTH, HEIGHT));
    	this.setPreferredSize(new Dimension (WIDTH, HEIGHT));    	
        
        timer = new Timer(interval, new TimerAction());
        this.lblScore = lblScore;
        this.lblTimeLeft = lblTimeLeft;
        this.setFocusable(true);   // Allow this panel to get focus.
        this.addKeyListener(this); // listen to our own key events.
        this.time=MAX_TIME;
        this.lblTimeLeft.setText(String.format("%2d",this.time/1000));
        
        this.score=0;
        this.lblScore.setText(String.format("%4d",this.score));
        
        
        this.mode = 0;
       
    }
    
    
    

 
    /** 
     * Turn animation on or off.
     */
    public void setAnimation(boolean turnOnOff) {
        if (turnOnOff) {
            timer.start();  // start animation by starting the timer.
        } else {
            timer.stop();   // stop timer
        }
    }
    
     /** 
     * Set mode.
     */
    public void setMode(int mode) {
        this.mode=mode;
    }
    
    
    /** 
     * Starts a new game
     */
    public void startGame(int maxBalls) {

    	this.score=0;
    	this.time=MAX_TIME;
    	this.maxBalls = maxBalls;
        this.lblTimeLeft.setText(Integer.toString(this.time/1000));
        
    
        this.lblTimeLeft.setText(String.format("%2d",this.time/1000));
        this.lblScore.setText(String.format("%4d",this.score));

        
        
        int height= getHeight();
    	int width = getWidth();
    	
    	
        
        if (this.mode == TEST_PADDLE || this.mode == FULL_GAME)
        	this.paddle = new Paddle(getWidth());
        	
        
        if (this.mode == TEST_BALL || this.mode == FULL_GAME ) {
          balls = new ArrayList<Ball>();
       	  balls.add(new Ball(random.nextInt(width-40) + 20 ,random.nextInt(height-40) + 20, random.nextInt(6) + 15,width,height));
   		  addBalls(maxBalls);

       }

   		this.requestFocus();
   		
   	//	http://leepoint.net/notes-java/GUI-lowlevel/keyboard/keyboard.html
    }

    /*
     * Add several Balls to the game
     */
    public void addBalls(int numberOfBalls) {
    
    	int height = getHeight();
    	int width = getWidth();
    
        	
    	boolean collision;
    	int maxBalls = numberOfBalls - balls.size();
    	if (maxBalls < 0) {
    		for (int i=balls.size() - numberOfBalls; i >0; i--) {
    			balls.remove(i);
    			
    		}
    	}
    	for (int i=1; i <= maxBalls; i++) {
    		Ball ball = new Ball(random.nextInt(width-40) + 20 ,random.nextInt(height-40) + 20,random.nextInt(6) + 15,width,height);
    		do {
    			ball.setX(random.nextInt(width-40) + 20);
    			ball.setY(random.nextInt(height-40) + 20);
    			collision=false;
    			for (int j=0;j<this.balls.size() && !collision ;j++){
    				collision=ball.isCollision(this.balls.get(j));
    			}
    			
    		} while (collision);
    		this.balls.add(ball);
    	}

    	
    }
    
        /*
     * Increase the speed of the balls
     */
    public void setPaddleSpeed(int speed) {
    	if ((this.mode == TEST_PADDLE || this.mode == FULL_GAME) && this.paddle != null)
    		paddle.setSpeed(speed);
    	

    }
    
    /*
     * Increase the speed of the balls
     */
    public void increaseSpeed() {
    	if (this.mode == TEST_BALL || this.mode == FULL_GAME) {

	    	for (int i=0; i<balls.size();i++) {
	           balls.get(i).increaseSpeed();
	        }
        }
    }
    /*
     * Decrease the speed of the balls
     */
    public void decreaseSpeed() {
      	if (this.mode == TEST_BALL || this.mode == FULL_GAME) {
	    	for (int i=0; i<balls.size();i++) {
    	       balls.get(i).decreaseSpeed();
        	}
        }

    }
    

     /**  
      *  Paints the balls in the panel
     **/
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  // Paint background, border
        
        if (mode == TEST_PADDLE || mode == FULL_GAME) {
           if (paddle != null) {
	    	    g.setColor(Color.BLACK);
    	    	g.fillRect(paddle.getX(),HEIGHT - paddle.getHeight(),paddle.getWidth(),HEIGHT);
        	
        	}
        }
        

		if (mode == TEST_BALL || mode == FULL_GAME) {
        	for (int i=0; i<balls.size();i++) {
        		Ball ball=balls.get(i); 

            	int color=ball.getColor();
         
            	if (color < 0 || color > colors.length) {
            		System.out.println("A ball has an invalid color!!");
            		color = 0;
            	}
   
            	g.setColor(colors[color]);
            	int radius = ball.getRadius();
                g.fillOval(ball.getX() - radius,HEIGHT - ball.getY() - radius, 2*radius, 2*radius);
                g.setColor(Color.BLACK);
                g.fillOval(ball.getX(), HEIGHT - ball.getY(), 2, 2);
        	}
        }
    }
    
        			
	public void keyReleased(KeyEvent evt) {
		
    	if ((evt.getKeyCode() ==  KeyEvent.VK_RIGHT || evt.getKeyCode() == KeyEvent.VK_LEFT) &&
    	    (mode == TEST_PADDLE || mode == FULL_GAME) )	{
    		paddle.setDirection(0);
    	}
	}
		
	public void keyTyped(KeyEvent evt) { }
			
	public void keyPressed(KeyEvent evt) {
			
		if ((mode == TEST_PADDLE || mode == FULL_GAME)) {
			if ( evt.getKeyCode() == KeyEvent.VK_RIGHT ) {
	       		paddle.setDirection(1);
	     	}
	    	if ( evt.getKeyCode() == KeyEvent.VK_LEFT ) {
	       		paddle.setDirection(-1);
	     	}
			
		}
	}


    
    /**
     * This method updates the state
     * of the game.  It detects collisions
     * between a ball(s) and the paddle
     * and handle the collision. Additionally
     * it cycles through all of the balls in the
     * game, detect collisions and move them. 
     * 
     */
    class TimerAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	
        	if (mode == FULL_GAME) 
        		time-=interval;
			
			lblTimeLeft.setText(String.format("%2d",time/1000));
			if (time <=0) {
				timer.stop();
				return;
			}  
				
			if (mode == TEST_BALL || mode == FULL_GAME) {
				//
				// Detect collisions between two balls
				//
				for (int  i = 0; i < balls.size(); i++) {
					Ball ball1  = balls.get(i);
					for ( int j = 1; j < balls.size(); j++)  {
						if ( i != j) {
							Ball ball2 =  balls.get(j);
							if (ball1.isCollision(ball2)) {
								ball1.flipXDir();
								ball1.flipYDir();
								ball2.flipXDir();
								ball2.flipYDir();
								ball1.move();
								ball2.move();
					       }
					   }
					}			
				}
			}
			if (mode == TEST_PADDLE || mode == FULL_GAME) {
				//
				// Detect collisions with the paddle
				//			
				for (int  i = 0; i < balls.size(); i++) {
					Ball aBall= balls.get(i);
					if (paddle.isCollision(aBall) && aBall.getYDir() == -1) {
						aBall.flipYDir();
						aBall.setY(paddle.getHeight()+aBall.getRadius());				
	 				    aBall.move();
	 				    score++;
	 				    lblScore.setText(String.format("%4d",score));
	 				    
					}
					
				}
				
				paddle.move();			
			}
			
			if (mode == TEST_BALL || mode == FULL_GAME) {
				//
				// Move the balls
				//		
				for (int i=0; i<balls.size();i++) {
					Ball aBall = balls.get(i);
					aBall.move(); 
				}
			}
			
			repaint();      // Repaint the balls in the panel
        }


    }
        
}

