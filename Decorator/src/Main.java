import interfaces.Bucket;

public class Main {

	public static void main(String[] args) {
	System.out.println("Old McDonal had a farm.\nOne day he went to get himself a bucket.\nBut not just any bucket");
	Bucket whiteBucket = new DeluxeBucket(new Casualbucket());
	whiteBucket.construct();
	System.out.println("The bucket looked good. But the handle is quite important for old McDonald");
	Bucket greenBucket = new GamingBucket(new Casualbucket());
	greenBucket.construct();
	System.out.println("Now that is a blazing fast bucket.");
	}

}
