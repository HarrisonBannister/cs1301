import java.util.Scanner;

/**
* Adventure.java
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

public class Adventure {

	public static void main(String[] args) {
		// Game startup
		Scanner sc = new Scanner(System.in);
		System.out.print("Welcome to UGA Adventures: Episode 1\n"+
							"The Adventure of the Cave of Redundancy Adventure\n"+
							"By: Harrison Bannister\n");
		
		// new map and player objects
		Player player = new Player();
		Map map = new Map();
		player = Adventure.startNewGame(player);
		// objects necessary to start game loops
		String playerInput = "";
		Room currentRoom = map.getRoom(0,0);
		Lamp lamp = new Lamp();
		Key key = new Key();
		Chest chest = new Chest();
		
		// variables to check if room has changed for printing description
		int lastx = 0;
		int lasty = 0;
		// MAIN GAME LOOP
			while (!(currentRoom == null)) {
				// sets variable for room upon entry
				currentRoom = map.getRoom(player.getxCoord(), player.getyCoord());
				lamp = currentRoom.getLamp();
				key = currentRoom.getKey();
				chest = currentRoom.getChest();
				
				Adventure.look(player,lamp,key,chest,currentRoom);
				
				// initial command before loop
				playerInput = sc.nextLine();
				playerInput = Adventure.filterPlayerInput(playerInput);
				// stays in the below loop until a valid command to leave is entered
				while (!(playerInput.equalsIgnoreCase("north")) && !(playerInput.equalsIgnoreCase("south")) &&
					   !(playerInput.equalsIgnoreCase("east")) && !(playerInput.equalsIgnoreCase("west"))) {
					
					// takes commands until player decides to move from room
					if (playerInput.equalsIgnoreCase("look")) {
						Adventure.look(player, lamp, key, chest, currentRoom);
						
					} else if (playerInput.equalsIgnoreCase("get lamp")) {
						player = Adventure.getLamp(player, lamp, map, currentRoom);
						if (!(currentRoom.getLamp() ==  null)) currentRoom = Adventure.clearLamp(currentRoom);
						
					} else if (playerInput.equalsIgnoreCase("get key")) {
						player = Adventure.getKey(player, key, currentRoom);
						if (!(currentRoom.getKey() ==  null)) currentRoom = Adventure.clearKey(currentRoom, key);
					
					} else if (playerInput.equalsIgnoreCase("light lamp")) {
						lamp = Adventure.lightLamp(player, lamp);
					
					} else if (playerInput.equalsIgnoreCase("unlock chest")) {
						chest = Adventure.unlockChest(player, chest, currentRoom);
					
					} else {
						Adventure.openChest(player, chest, currentRoom);
					}
					
					// takes next command
					playerInput = sc.nextLine();
					playerInput = Adventure.filterPlayerInput(playerInput);
				}
				
				// moves player at end of room loop
				player = Adventure.movePlayer(player.getxCoord(), player.getyCoord(), playerInput, player, lamp, map, currentRoom);
			}
		sc.close();
		System.exit(0);
	}
	
	/*
	 * Game Control Methods - conditions, procedures, and methods
	 */
	public static Player startNewGame(Player player) {
		Player newPlayer = new Player();
		player = newPlayer;
		player.setxCoord(0);
		player.setyCoord(0);
		return player;
	}
	// returns true if game if player is in trouble, their next move loses the game unless they have a lamp
	public static boolean isPlayerInTrouble(Player player, Lamp lamp, Room currentRoom) {
		// 
		if (currentRoom.isDark() && (lamp == null || lamp.getLightStatus() == false)) {
			System.out.println("You have stumbled into a passing grue and have been eaten.");
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * Player Commands Methods -  these handle player's commands
	 */
		/*
		 * Chest Commands
		 */
	public static Chest unlockChest(Player player, Chest chest, Room currentRoom) {
		Key key = player.getKey();
		if (!(chest == null) && !(key == null) && chest.isLocked() == true) {
			System.out.println("OK");
			key.use(chest);
			return chest;
		} else if (!(chest == null) && chest.isLocked() == false) {
			System.out.println("The chest is unlocked. Open it!");
			return chest;
		} else if (!(chest == null) && key == null) {
			System.out.println("Need a key to do any unlocking!");
			return chest;
		} else {
			System.out.println("No chest to unlock");
			return chest;
		}
	}
	
	public static void openChest(Player player, Chest chest, Room currentRoom) {
		if (!(chest == null) && chest.isLocked() == false) {
			System.out.println("The chest contains " + chest.getContents() + ".");
			System.exit(0);
		} else if (!(chest == null) && chest.isLocked() == true){
			System.out.println("The chest is locked");
		} else {
			System.out.println("No chest present");
		}
	}
	
	public static Room clearKey(Room currentRoom, Key key) {
		currentRoom.clearKey();
		return currentRoom;
	}
	public static Player getKey(Player player, Key key, Room currentRoom) {
		if (!(key == null)) {
			System.out.println("OK");
			player.setKey(key);
			return player;
		} else {
			System.out.println("No key present");
			return player;
		}
	}	
		/*
		 * Movement and Looking
		 */
	public static void look(Player player, Lamp lamp, Key key, Chest chest, Room currentRoom) {
		if (currentRoom.isDark() && (lamp == null || lamp.getLightStatus() == false)) {
			System.out.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
		} else {
			System.out.println(currentRoom.getDescription());
			if (!(lamp == null)) System.out.println("There is an old oil lamp here that was made long ago.");
			if (!(key == null)) System.out.println("You see the outline of a key on a dusty shelf that's covered in dust.");
			if (!(chest == null)) System.out.println("There is a large, wooden, massive, oaken chest here with the word 'CHEST' carved into it.");
		}
		
	}
	
	public static Player movePlayer(int x, int y, String playerInput, Player player, Lamp lamp, Map map, Room currentRoom) {
		
		// player movement loop
		if (playerInput.equalsIgnoreCase("north") && currentRoom.canGoNorth() && !(Adventure.isPlayerInTrouble(player, lamp, currentRoom))) {
			if (Adventure.isPlayerInTrouble(player, lamp, currentRoom)) {
				System.out.println("You have stumbled into a passing grue, and have been eaten.");
				System.exit(0);
			}
			player.setxCoord(player.getxCoord()-1);
			return player;
		} else if (playerInput.equalsIgnoreCase("south") && currentRoom.canGoSouth() && !(Adventure.isPlayerInTrouble(player, lamp, currentRoom))) {
			if (Adventure.isPlayerInTrouble(player, lamp, currentRoom)) {
				System.out.println("You have stumbled into a passing grue, and have been eaten.");
				System.exit(0);
			}
			player.setxCoord(player.getxCoord()+1);
			return player;
		} else if (playerInput.equalsIgnoreCase("east") && currentRoom.canGoEast() && !(Adventure.isPlayerInTrouble(player, lamp, currentRoom))) {
			if (Adventure.isPlayerInTrouble(player, lamp, currentRoom)) {
				System.out.println("You have stumbled into a passing grue, and have been eaten.");
				System.exit(0);
			}
			player.setyCoord(player.getyCoord()+1);
			return player;
		} else if (playerInput.equalsIgnoreCase("west") && currentRoom.canGoWest() && !(Adventure.isPlayerInTrouble(player, lamp, currentRoom))) {
			if (Adventure.isPlayerInTrouble(player, lamp, currentRoom)) {
				System.out.println("You have stumbled into a passing grue, and have been eaten.");
				System.exit(0);
			}
			player.setyCoord(player.getyCoord()-1);
			return player;
		} else {
			System.out.println("Can't go that way!");
		}
		
		// return player object just in case conditions fail
		return player;
	}		
		/*
		 * Lamp Commands
		 */
	public static Room clearLamp(Room currentRoom) {
		currentRoom.clearLamp();
		return currentRoom;
	}
	public static Player getLamp(Player player, Lamp lamp, Map map, Room currentRoom) {
		if (!(lamp == null)) {
			System.out.println("OK");
			player.setLamp(lamp);
			return player;
		} else {
			System.out.println("No lamp present");
			return player;
		}
	}
	
	public static Lamp lightLamp(Player player, Lamp lamp) {
		lamp = player.getLamp();
		if (!(lamp == null)) {
			System.out.println("OK");
			lamp.setLightStatus(true);
			return lamp;
		} else {
			System.out.println("You don't have the lamp to light.");
			return lamp;
		}
	}
	
	/*
	 * Player input handling methods
	 */
	public static boolean playerInputIsValid(String playerInput) {
		if (!(playerInput.equalsIgnoreCase("get lamp")) && !(playerInput.equalsIgnoreCase("light lamp"))&&
				!(playerInput.equalsIgnoreCase("north"))&& !(playerInput.equalsIgnoreCase("south"))&&
				!(playerInput.equalsIgnoreCase("east")) && !(playerInput.equalsIgnoreCase("west"))&&
				!(playerInput.equalsIgnoreCase("look")) && !(playerInput.equalsIgnoreCase("get key"))&&
				!(playerInput.equalsIgnoreCase("unlock chest"))&& !(playerInput.equalsIgnoreCase("open chest"))) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String filterPlayerInput(String playerInput) {
		Scanner sc =  new Scanner(System.in);
		// makes sure input is valid
		while (Adventure.playerInputIsValid(playerInput)) {
			System.out.println("I'm sorry I don't know how to do that.");
			System.out.println("Please enter a valid command:");
			playerInput = sc.nextLine();
		}
		return playerInput;
	}

}