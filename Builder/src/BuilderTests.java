

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BuilderTests {
	private SpaceShip sideWinder;
	private String 
	name = "Siedwinder", 
	manufacturer = "Faulcon DeLacy";
	
	
	@Before
	public void setUp() throws Exception {
		sideWinder = new SpaceShip.SpaceShipBuilder(name ,manufacturer).build();
	}

	@Test
	public void testNewlyCreatedObject() {
		//	Newly created object should not have any modules
		assertNull(sideWinder.getModules());
	}
	@Test
	public void addedModulesToObject(){
		int availableModules = 6;
		ModuleType[] toInsert = new ModuleType[availableModules] ;
		toInsert= new ModuleType[]{
				ModuleType.laser, ModuleType.laser, ModuleType.jumpdrive,
				ModuleType.armor_plating, ModuleType.shield_generator, ModuleType.cargo_rack
		};
		sideWinder= new SpaceShip.SpaceShipBuilder(name, manufacturer)
				.setModuleCount(availableModules)
				.insertModules(toInsert)
				.build();
		assertEquals(6, sideWinder.getModules().length);
	}
	@Test
	public void rejectModuleInsertionIfModulesExceedSlots(){
		int availableModules = 4;
		ModuleType[] toInsert = new ModuleType[availableModules] ;
		toInsert= new ModuleType[]{
				ModuleType.laser, ModuleType.laser, ModuleType.jumpdrive,
				ModuleType.armor_plating, ModuleType.shield_generator, ModuleType.cargo_rack
		};
		sideWinder= new SpaceShip.SpaceShipBuilder(name, manufacturer)
				.setModuleCount(availableModules)
				.insertModules(toInsert)
				.build();
		assertEquals(0, sideWinder.CountModules());
	}

}
