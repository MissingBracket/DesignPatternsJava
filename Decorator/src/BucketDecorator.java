import interfaces.Bucket;

/**
 * Class implementing Decorator design pattern functinalities
 * @author smiley
 *
 */
public class BucketDecorator implements Bucket{
	protected Bucket bucket;

	/**
	 * @param b Bucket to be decorated
	 */
	public BucketDecorator(Bucket b) {
		this.bucket=b;
	}
	
	@Override
	public void construct() {
		this.bucket.construct();
		
	}
}
