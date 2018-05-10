import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FactoryTest {

	private Backpack 
	smallBackpack,	
	largeBackpack;
	private int requestedPockets=6, requestedWeight=15;
	
	@Before
	public void setUp() throws Exception {
		backpackType requestedTypeS = backpackType.SMALL;
		backpackType requestedTypeB = backpackType.BIG;
		//int requestedPockets=4, requestedWeight=10;
		
		smallBackpack = BackpackFactory.getBackpack(requestedTypeS, requestedPockets, requestedWeight);
		largeBackpack = BackpackFactory.getBackpack(requestedTypeB, requestedPockets, requestedWeight);
		
	}

	@Test
	public void testSmallBackpackCreation() {
		
		assertEquals(requestedPockets, smallBackpack.getPockets());
		
		assertEquals(requestedWeight, smallBackpack.getMaxWeight());
		
		assertEquals(SmallBackpack.class, smallBackpack.getClass());
	}
	
	@Test
	public void testBigBackpackCreation() {		
		
		assertEquals(requestedPockets, largeBackpack.getPockets());
		
		assertEquals(requestedWeight, largeBackpack.getMaxWeight());
		
		assertEquals(BigBackpack.class, largeBackpack.getClass());
	}

}
