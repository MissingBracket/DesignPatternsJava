public class Main {

	public static void printShipData(SpaceShip FerDeLance) {
		System.out.println("Constructed Ship "+ FerDeLance.getName() 
		+ " Constructed by " + FerDeLance.getManufacturer()
		+ " Which weighs " + FerDeLance.getWeight()
		+ "t And has " + FerDeLance.getModuleCount()+ " module slots");
		System.out.println("Spaceship has available modules: ");
		for(ModuleType a : FerDeLance.getModules()) {
		System.out.println(a.toString());
}
	}
	
	public static void main(String[] args) {
		int availableModules = 6;
		ModuleType[] toInsert = new ModuleType[availableModules] ;
		toInsert= new ModuleType[]{
				ModuleType.laser, ModuleType.laser, ModuleType.jumpdrive,
				ModuleType.armor_plating, ModuleType.shield_generator, ModuleType.cargo_rack
		};
		SpaceShip FerDeLance = new SpaceShip.SpaceShipBuilder("FerDeLance", "Zorgon Peterson")
				.setModuleCount(availableModules).setWeight(550)
				.insertModules(toInsert).build();
		
		printShipData(FerDeLance);
		
	}

}
