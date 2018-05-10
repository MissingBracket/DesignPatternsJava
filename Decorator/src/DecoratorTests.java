import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import interfaces.Bucket;

public class DecoratorTests {

	@Test
	public void testDeluxeBucketCreator() {
		Bucket whiteBucket = new DeluxeBucket(new Casualbucket());
		
		assertEquals(DeluxeBucket.class, whiteBucket.getClass());
	}
	
	@Test
	public void testGamingBucketCreator() {
		Bucket greenBucket = new GamingBucket(new Casualbucket());
		
		assertEquals(GamingBucket.class, greenBucket.getClass());
	}
	

}
