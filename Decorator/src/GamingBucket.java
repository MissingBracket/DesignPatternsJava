import interfaces.Bucket;

/**
 * Sample bucket type
 * @author smiley
 *
 */
public class GamingBucket extends BucketDecorator{

	/**
	 * @param b Bucket to be dercorated
	 */
	public GamingBucket(Bucket b) {
		super(b);
	}
	@Override
	public void construct(){
		super.construct();
		System.out.println("Adding Popular gaming company sticker");
	}

}
