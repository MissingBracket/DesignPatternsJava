
/**
 *Simple class for storing demo data
 * @author smiley
 *
 */
public abstract class Backpack {
 
	public abstract int getPockets();
	public abstract int getMaxWeight();
	public abstract boolean getFitsAxe();

 
 /**
 * @return information whether a backpack can fit an axe
 */
private String fitsAxe(){
	 return this.getFitsAxe() != false ? "being able" : "not being able" ;
 }

 @Override
 public String toString() {
	return "This backpack has " + this.getPockets()
			+" pockets and can fit max " + this.getMaxWeight() + " kg while "
			+this.fitsAxe() + " to fit an axe";
 }
 
}
