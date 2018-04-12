import interfaces.Bucket;

public class DeluxeBucket extends BucketDecorator{

	public DeluxeBucket(Bucket b) {
		super(b);
	}
	@Override
	public void construct(){
		super.construct();
		System.out.println("Added glowing company logo. Bucket looks very smooth now. Bucket handle sold separately");
	}
}