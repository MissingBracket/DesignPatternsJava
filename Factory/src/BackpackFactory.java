
/**
 * Implementation of Backpack class instance factory
 * @author smileperience
 *
 */
public class BackpackFactory {

	/**
	 * @param btype Desired typ of backpack
	 * @param pockets How many pockets does the backpack have
	 * @param maxweight Maximum carry weight 
	 * @return Instance of ready backpack of desired type
	 */
	public static Backpack getBackpack(backpackType btype, int pockets, int maxweight){
		switch(btype){
		case SMALL:
			return new SmallBackpack(pockets, maxweight, false);
		case BIG:
			return new BigBackpack(pockets, maxweight, true);
		default:
			return null;
		}
	}
}
