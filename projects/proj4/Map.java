
public class Map {

	private boolean simpleMap = false;
	/**
	 * Call this method with two int's to get the appropriate room
	 * The valid range for both x and y is 0 to 3
	 * 
	 * @param x
	 * @param y
	 * @return Room
	 */
	public Room getRoom(int x, int y) {
		return myMap[x][y];
	}


	/**
	 * Hi! I'm a 2 dimensional array!  Though I look kinda weird,
	 * I'm here to help make your programs better.  But don't worry, 
	 * you don't have to use me for this project.  If you're curious how
	 * I work, see chapter 7 in your textbook.
	 */
	private Room [][] myMap;
	
	
	/**
	 * Hey wassup dawg?  I'ma constructor.  I make the objects round these parts, 
	 * sometimes without even trying, knowwhatimssayin?
	 * Yall don't haveta worry 'bout me for this'ere game, but look me up in 
	 * Chapter 6 sometime. Kay?
	 *   
	 */
	public Map() {
		if(simpleMap)
		{
			myMap = new Room[1][1]; // yep, a 1-room map
			Key theKey = new Key();
			Chest theChest = new Chest();
			theChest.lock(theKey);
			theChest.setContents("all the gold");
			myMap[0][0] = new Room("This is the one room map. Everything you need is here!!", false, false, false, false, false, new Lamp(), theKey, theChest);
		}
		else
		{
			myMap = new Room[4][4];
	
			Key theKey = new Key();
			Chest theChest = new Chest();
			theChest.lock(theKey);
			
			for (int i = 0; i < myMap.length; i ++) {
				for (int j = 0; j < myMap[i].length; j ++) {
					myMap[i][j] = createRoom(i,j, theChest, theKey);
					
				}
			}
		}
		
	}
	
	/**
	 * PAY NO ATTENTION TO THE METHOD BEHIND THE CURTAIN!!!!
	 * _________________________________________________
	 * | | | | | | | | | | | | | | | | | | | | | | | | |
	 * | | | | | | | | | | | | | | | | | | | | | | | | |
	 * | | | | | | | | | | | | | | | | | | | | | | | | |
	 * | | | | | | | | | | | | | | | | | | | | | | | | |
	 * | | | | | | | | | | | | | | | | | | | | | | | | |
	 * | | | | | | | | | | | | | | | | | | | | | | | | |
	 * | | | | | | | | | | | | | | | | | | | | | | | | |
	 * | | | | | | | | | | | | | | | | | | | | | | | | |
	 * | | | | | | | | | | | | | | | | | | | | | | | | |
	 * | | | | | | | | | | | | | | | | | | | | | | | | |
	 * | | | | | | | | | | | | | | | | | | | | | | | | |
	 * -------------------------------------------------
	 * 
	 * 
	 * Seriously don't look below until you've completed the project,
	 * it'll spoil the surprise!
	 * 
	 * @param x
	 * @param y
	 * @param theChest
	 * @param theKey
	 * @return Room
	 */
	private Room createRoom(int x, int y, Chest theChest, Key theKey) {
		
		switch (x) {
		case 0:
			switch (y) {
			case 0:
				return new Room("FOREST TRAIL:\nYou are standing on a dirt trail that leads to the east. Surrounding you is the famously thick underbrush\n" +
						"of Oconee Forest Park, the fall leaves falling off the trees have just started to poke holes in the canopy.\n" +
						"Off in the distance you hear the cool sounds of Lake Herrick drifting through the trees.",false,false,true,false,false,null,null,null);
			case 1:
				return new Room("WOODEN WALKWAY:\nThe wooden walkway makes a :clump: as you stride along it.\n" +
						"Frogs give a terrified SKRIP! and jump to safety as your adventurous frame comes into view.\n" +
						"A mountain biker, ignoring the many \"Fragile Habitat\" signs, speeds along a narrow dirt path to your right.\n" +
						"As you reach the end of the walkway, you notice a hole in the ground in a newly fallen tree's footprint, just\n" +
						"large enough for you to fit through.",false,false,true,true,false,new Lamp(),null,null);
			case 2:
				return new Room("CAVE ENTRANCE:\nThe damp earthen crawlspace gives you claustrophobic thoughts as you crawl through its damp earth.\n" +
						"Fortunately, the passageway soon grows large enough for you to stand, though slightly bent over.\n" +
						"The air smells of rotting wood, and a rotting wood smell hangs thick in the air.",false,false,true,true,true,null,null,null);
			case 3:
				return new Room("FALLEN BOULDERS:\nBefore you a number of boulders have fallen, blocking your way.\n" +
						"You cannot continue forward, because some fallen boulders have blocked your way. Searching the jagged mess and surrounding walls, \n" +
						"you find an opening off to the side.  The polished stone slit is large enough, you should be able to slip through.",false,true,false,true,true,null,null,null);
			}
			break;
		case 1:
			switch (y) {
			case 0:
				return new Room("RESEARCH PLATFORM:\nYou have come across an old research platform, apparently built by researchers.  A layer of dust\n" +
						"lines every corner of the platform, making it appear the many artificial contraptions left here are a natural part of the cave.\n" +
						"A metal slide large enough for you to fit on leads to the east, you push thoughts of bearded professors frolicking up and down like\n" +
						"school children out of your head, it MUST have had a more devious purpose than that right? This is taxpayer's money we're talking about!\n" +
						"On a table beakers of unknown contents, long since dried out, sit waiting for a human of above normal intelligence to work them.\n" +
						"You find a notebook full of undecipherable writings and alien drawings, forever faded by the mists of time. (and caves are wet, too)",false,true,true,false,true,null,theKey,null);
			case 1:
				return new Room("ROOM OF SHINY CRYSTALS SHINING:\nThousands of shiny brightly colored crystals of unknown color shine in the light\n" +
						"of your lamp.  Small clusters form in clumps on the rock, while ones dwarfing you jut out of the edges of the cave.\n" +
						"\"Dwarfs like beer\" you think to yourself, vaguely remembering Lord of the Rings, \"I should get a beer when this adventure is done.\"\n" +
						"\"That's a great idea me!\" \"I think so too, hey do you think these crystals are messing with my mind?\"  \"Nah, that's just silly!\"\n" +
						"You decide you don't know what you're talking about and should leave this room quickly.\n" +
						"To the west a polished metal ramp steeply leads up the wall.  You try to climb it, but immediately slide back down.",false,true,true,false,true,null,null,null);
			case 2:
				return new Room("DEAD END THAT ENDS DEADLY:\nThe cave ends before you with stunning termination.  A quick search turns up no way out except back to the west\n" +
						"and a skeleton of an unfortunate adventurer.  After the initial shock subsides, you search the adventurer's belongings, and find a last\n" +
						"will and testimate that reads:\n\n" +
						"Here lies the unfortunate remains of T.Q. Snidely.  Entered this adventure in search of enlightenment. Trapped here by a rock slide,\n" +
						"never to hold my darling Theona again. If only I could have mastered my control of objects! Beware, beware the jabberwocky my friend!\n" +
						"For the snark is a boojum, you see!\n" +
						"\nObviously a drama major.",false,false,false,true,true,null,null,null);
			case 3:
				return new Room("LARGE CAVERN OF ENORMOUS SIZE:\nBefore you lies a cavern of indescribable size.  It's really big.\n" +
						"So big your lantern can't illuminate the immenseness of its size.  A small stream has carved a windey\n" +
						"way through the space, blind fish swim blindly away from you as you approach. You decide you can follow the stream\n" +
						"to continue on through the cave. (leaving the question of how exactly blind fish know you're there up to science)",true,true,false,false,true,null,null,null);
			}
			break;
		case 2:
			switch (y) {
			case 0:
				return new Room("STAIRS OF CLIMBING:\n" +
						"Curiously carved into solid rock, these ornate stairs beckon to you to climb them.  Not wanting to insult a set\n" +
						"of fancy stairs, you begin your ascent.  After what seems like hours, you climb the three steps and are now on level\n" +
						"ground again.  Looking back proudly after making your foot and a half vertical climb, you make a mental note to embellish\n" +
						"this story when you tell your friends. Maybe add a crazy deadly trap or two?  Like in Indiana Jones? Hmm, that might\n" +
						"be too much.  Your resolve yourself to come up with a more believable lie.",true,true,false,false,true,null,null,null);
			case 1:
				return new Room("OMINOUSLY DANGEROUS STALAGMITES OF IMPENDING DOOM:\nMassive stalgmites litter the area, filling you with a sense of doom.\n" +
						"Sharp and dangerous looking, you carefully tiptoe through this room.  That is until you remember stalagmites form on the\n" +
						"FLOOR of a cave.  You feel stupid.\n" +
						"\nIn the distance, you hear the sound of gently flowing water.  Can't tell which direction it's coming from though...",true,true,true,false,true,null,null,null);
			case 2:
				return new Room("OLD WOODEN BRIDGE:\nThis old wooden bridge was apparently constructed a long time ago.  The creaking and moaning it makes\n" +
						"as you traverse it does nothing to calm your fear of falling into the inky black below.  Out of curiosity, you tear a small piece of\n" +
						"wood off and drop it over the side.  You wait. And wait. Then the bridge gives a slight heave in the downward direction.  You stop waiting.",false,false,true,true,true,null,null,null);
			case 3:
				return new Room("NOTE ON WALL:\nA carving on a wall of the cavern reads: \"This is a note on a wall\"\n" +
						"You take this as a sign that you should take a closer look.  Upon approaching, you see a tunnel has been dug to the west.\n" +
						"Well, that and a note on the wall that reads: \"This is a note on a wall\"",true,false,false,true,true,null,null,null);
			}
			break;
		case 3:
			switch (y) {
			case 0:
				return new Room("THE FALLING WATER WATERFALL:\n" +
						"The rumors are true, the Falling Water Waterfall is real!  As the water falls off the edge of the cliff before you and down into\n" +
						"oblivion, you approach the edge to get a better look.  Your feet come out from under you and you go down hard on the smooth rock.\n" +
						"Smarting, you pick yourself up and curse the writer of this story for making you look so dumb.",true,false,true,false,true,null,null,null);
			case 1:
				return new Room("GENTLE BROOK:\nYou come across a silent stream babbling like a brook.  You stop for a moment to admire this serene\n" +
						"scene ...\n" +
						"The brook's cool water tastes tasteless (as water should) and refreshes you for the journey ahead.",true,false,true,true,true,null,null,null);
			case 2:
				return new Room("MUDDY BANK CAKED WITH MUD:\nYou come across the muddy bank of the stream, which you must cross to proceed.  Your\n" +
						"feet sink deep into the mud of the bank, and as you try to pull one foot out your shoe comes off.  Losing your balance, you quickly\n" +
						"skrunch your bare foot into the mud with a loud SKRUNCH!  After fighting with the mud for a few minutes, you leave your shoes behind and\n" +
						"continue on.  Unfortunately, the floor now seems unnaturally jagged, resulting in each footstep causing your mouth to give out a loud YELP!\n" +
						"Thinking quickly, you reach into your shirt and undo your bra (Did I mention you're a lady? You're a lady.) cut the central strap and tie\n" +
						"the pads to your feet.  Not perfect, but much, much better than before.",false,false,true,true,true,null,null,null);
			case 3:
				theChest.setContents("The chest lid is heavy, and you strain to open it.  It finally creaks open with a loud CREAK.\n\nYou peer inside, lifting the lamp gently, and find ..." +
						"\n\n\n\n" +
						"An A on this project!  Shocked, you look at the A and think, \"Well DUH! I couldn't have gotten this far if my program didn't work!\"\n\n" +
						"True.  Very True.\n\n" +
						"THE END.");return new Room("CARVED FINE OUTCROP OF ORNATENESS:\nBefore you lies an outcropping of rock that has been exquisitely carved\n" +
						"into the most beautiful thing you've ever seen.  Seriously this thing cannot be described with words:  it's oblonged shaped, with wings coming\n" +
						"out of the sides and meeting above like those of an eagle.  Upon closer inspection, you realize that the carvings are actually tiny symbols,\n" +
						"like heiroglyphics, extending on and on.  This fascinates you for a moment, before your attention turns to the object sitting on top of the outcropping.",false,false,false,true,true,null,null,theChest);
			}
			break;
		
		
		
		}
		return null;
	}

}
