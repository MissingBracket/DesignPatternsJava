import interfaces.Bucket;

public class GamingBucket extends BucketDecorator{

	public GamingBucket(Bucket b) {
		super(b);
	}
	@Override
	public void construct(){
		super.construct();
		System.out.println("Adding Popular gaming company sticker");
	}

}
