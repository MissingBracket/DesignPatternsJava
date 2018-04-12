
public class BackpackFactory {

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
