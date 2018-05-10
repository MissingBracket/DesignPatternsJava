
/**
 * Small type of backpack
 * @author smiley
 *
 */
public class SmallBackpack extends Backpack{
	private int pockets, maxWeight;
	private boolean fits_an_axe;
	@Override
	public int getPockets() {
		return this.pockets;
	}
	@Override
	public int getMaxWeight() {
		return this.maxWeight;
	}
	@Override
	public boolean getFitsAxe() {
		return this.fits_an_axe;
	}
	/**
	 * @param pockets Number of pockets the backpack has
	 * @param maxWeight Maximum carry weight of the backpack
	 * @param fitsanaxe If the backpack can fit an axe
	 */
	public SmallBackpack(int pockets, int maxWeight, boolean fitsanaxe) {
		this.fits_an_axe=fitsanaxe;
		this.pockets=pockets;
		this.maxWeight=maxWeight;
	}
}
