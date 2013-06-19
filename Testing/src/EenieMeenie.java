/**
 * @Function Chooses what you should buy randomly based on a 
 * pre-defined enum.
 * 
 * @author Nein Reaper
 * @Description Which one should you buy!?
 */

public class EenieMeenie {
	private static EnumTest randomChoice;
	
	//Cost of each purchasable item.
	private static int cost;
	
	/* Array for the phrase used in 
	 * EenieMeenie(EnumTest enumTest)
	 */
	private static String[] FUN_PHRASE = new String[] {
		"Eenie", "Meenie", "Miney", "Moe", "Catch", "A",
		"Tiger", "By", "His", "Toes", "If", "He", "Hollers",
		"Let", "Him", "Go", "Eenie", "Meenie", "Miney", "Moe"
	};
	
	//Array for final phrase modifier
	private final static String[] MODIFIERS = new String[] {
		" a ", " some ", " "
	};
	
	//Initializing randomChoice to access my enum
	private EenieMeenie(EnumTest enumTest) {
		EenieMeenie.randomChoice = enumTest;
	}
	
	/* Counter to produce slower speed of output.
	 * Produces a random choice using method in EnumTest class
	 * 
	 * Uses "Eenie Meenie Miney Moe" kids' phrase pointlessly, but
	 * I'm practicing arrays.
	 * 
	 * Assigns cost to each choice then prints out what you should
	 * pick.
	 */
	private static void mineyMo() throws InterruptedException {
		int counter = 0;
		String phraseModifier;
		
		for (int listChoices = 0; listChoices < EnumTest.values().length; listChoices++) {
			while (counter < 20) {
				randomChoice = EnumTest.getRandom();
				if (counter == 19) {
					System.out.println(FUN_PHRASE[counter].toUpperCase() + ": " + randomChoice);
				}
				else {
					System.out.println(FUN_PHRASE[counter] + ": " + randomChoice);
				}
				counter++;
				Thread.sleep(400);
			}
		}
		
		switch(randomChoice) {
		case CAR:
			cost = 7500;
			phraseModifier = MODIFIERS[0];
			break;
		case COMPUTER: case PHONE:
			cost = 599;
			phraseModifier = MODIFIERS[0];
			break;
		case HOUSE:
			cost = 283400;
			phraseModifier = MODIFIERS[0];
			break;
		case SUNGLASSES: 
			cost = 249;
			phraseModifier = MODIFIERS[1];
			break;
		case TELEVISION:
			cost = 399;
			phraseModifier = MODIFIERS[0];
			break;
		default:
			cost = 0;
			phraseModifier = MODIFIERS[2];
			break;
		}
		
		//Prints out result
		System.out.println("You should pick" + phraseModifier
							+ randomChoice.toString().toLowerCase() + 
							" to buy for " + "$" + cost + ".");

	}
	
	//Main method to carry out functions
	public static void main(String[] args) throws InterruptedException {
		mineyMo();
	}
	
}
