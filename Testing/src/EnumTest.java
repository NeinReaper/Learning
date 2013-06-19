/* My enum with different items to buy.
 * 
 * getRandom() Chooses a random value from the enum.
 *
 */
public enum EnumTest {
	PHONE, CAR, HOUSE, SUNGLASSES, 
	COMPUTER, TELEVISION;
	
	public static EnumTest getRandom() {
		return values()[(int) (Math.random() * values().length)];
	}
	
}
