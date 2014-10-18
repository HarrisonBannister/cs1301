
public class Room {

	private String description;
	private boolean north;
	private boolean south;
	private boolean east;
	private boolean west;
	private boolean isDark;
	
	private Lamp theLamp;
	private Key theKey;
	private Chest theChest;

	/**
	 * Returns the text description of this room
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Returns true if the player can go north from this room
	 */
	public boolean canGoNorth() {
		return north;
	}
	
	/**
	 * Returns true if the player can go south from this room
	 */
	public boolean canGoSouth() {
		return south;
	}
	
	/**
	 * Returns true if the player can go east from this room
	 */
	public boolean canGoEast() {
		return east;
	}
	
	/**
	 * Returns true if the player can go west from this room
	 */
	public boolean canGoWest() {
		return west;
	}
	
	/**
	 * Returns the lamp object in this room.
	 * If no lamp is present, returns null
	 */
	public Lamp getLamp() {
		return theLamp;
	}
	
	/**
	 * Sets the lamp variable in this room to null
	 */
	public void clearLamp() {
		theLamp = null;
	}

	/**
	 * Returns the key object in this room. 
	 * If no key is present, returns null
	 */
	public Key getKey() {
		return theKey;
	}
	
	/**
	 * Sets the key variable in this room to null
	 */
	public void clearKey() {
		theKey = null;
	}
	
	/**
	 * Returns the chest object in this room.
	 * If no chest is present, returns null
	 */
	public Chest getChest() {
		return theChest;
	}
	
	/**
	 * Returns true if there is no light in this room,
	 * veeeeeeeery dangerous!
	 */
	public boolean isDark() {
		return isDark;
	}

	
	/**
	 * Hey wassup dawg?  I'ma constructor.  I make the objects round these parts, 
	 * sometimes without even trying, knowwhatimssayin?
	 * Yall don't haveta worry 'bout me for this'ere game, but look me up in 
	 * Chapter 6 sometime. Kay?
	 *   
	 */
	public Room(String description, boolean north, boolean south, boolean east,
			boolean west, boolean isDark, Lamp theLamp, Key theKey,
			Chest theChest) {
		super();
		this.description = description;
		this.north = north;
		this.south = south;
		this.east = east;
		this.west = west;
		this.isDark = isDark;
		this.theLamp = theLamp;
		this.theKey = theKey;
		this.theChest = theChest;
	}
	
	
}
