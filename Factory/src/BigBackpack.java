
/**
 * Big type of backpack. Those can fit an axe
 * @author smileperience
 *
 */
public class BigBackpack extends Backpack{
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
	 * @param pockets number of pockets
	 * @param maxWeight maximum carry weight of the backpack
	 * @param fitsanaxe can the backpack fit an axe
	 */
	public BigBackpack(int pockets, int maxWeight, boolean fitsanaxe){
		this.fits_an_axe=fitsanaxe;
		this.pockets=pockets;
		this.maxWeight=maxWeight;
	}
}
