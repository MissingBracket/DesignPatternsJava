import interfaces.Bucket;

/**
 * Sample bucket type
 * @author smiley
 *
 */
public class DeluxeBucket extends BucketDecorator{

	/**
	 * @param b Bucket to decorate
	 */
	public DeluxeBucket(Bucket b) {
		super(b);
	}
	@Override
	public void construct(){
		super.construct();
		System.out.println("Added glowing company logo. Bucket looks very smooth now. Bucket handle sold separately");
	}
}