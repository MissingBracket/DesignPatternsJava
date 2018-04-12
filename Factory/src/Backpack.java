
public class Backpack {
 private int pockets, maxWeight;
 private boolean fits_an_axe;
 
 @Override
 public String toString() {
	return "This backpack has " + pockets
			+" and can fit max " + maxWeight + "kg"
			+ fits_an_axe > 0 ? "begin able" : "not being able" + " to fit an axe";
 }
 
}
