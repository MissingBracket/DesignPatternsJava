import interfaces.Bucket;

public class BucketDecorator implements Bucket{
	protected Bucket bucket;

	public BucketDecorator(Bucket b) {
		this.bucket=b;
	}
	
	@Override
	public void construct() {
		this.bucket.construct();
		
	}
}
