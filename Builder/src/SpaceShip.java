
/**
 * Sample class for storing some data
 * @author smileperience
 *
 */
public class SpaceShip {
	private String name, manufacturer;
	private int weight, moduleCount=0;
	private ModuleType[] modules;
	
	/**
	 * @param ssb Builder to use for spaceship creation
	 */
	private SpaceShip(SpaceShipBuilder ssb) {
		this.name=ssb.name;
		this.manufacturer=ssb.manufacturer;
		this.weight=ssb.weight;
		this.moduleCount=ssb.moduleCount;
		this.modules=ssb.modules;
	}
	/**
	 * @return name of the spaceship
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name name to set for the ship
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return Spaceship's manufacruter
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	/**
	 * @param manufacturer Manufacturer's name
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * @return Spaceship's weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param weight Weight to set for the ship
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/**
	 * @return Number of modules that ship can store
	 */
	public int getModuleCount() {
		return moduleCount;
	}
	/**
	 * @return number of modules installed
	 */
	public int CountModules(){
		int modCount = 0;
		for(ModuleType a : this.modules){
			if(!a.equals(ModuleType.empty))
				modCount++;
			else break;
		}
		return modCount;
	}
	/**
	 * @param moduleCount Set ship's module storage cap
	 */
	public void setModuleCount(int moduleCount) {
		this.moduleCount = moduleCount;
	}
	/**
	 * @return all modules in a ship
	 */
	public ModuleType[] getModules() {
		return modules;
	}
	/**
	 * @param modules Modules to install in the ship
	 */
	public void setModules(ModuleType[] modules) {
		this.modules = modules;
	}
	/**
	 * Builder for sample storage class
	 * @author smiley
	 *
	 */
	public static class SpaceShipBuilder{
		private String name, manufacturer;
		private int weight, moduleCount;
		private ModuleType[] modules;
	
		/**
		 * @param name Name to set for the ship
		 * @param manufacturer Manufacturer who created the ship
		 */
		public SpaceShipBuilder(String name, String manufacturer) {
			this.name=name;
			this.manufacturer=manufacturer;
		}
		/**
		 * @param weight Weight of the ship
		 * @return ship's instance for the builder
		 */
		public SpaceShipBuilder setWeight(int weight) {
			this.weight=weight;
			return this;
		}
		
		/**
		 * @param modules Modules to install in the ship
		 * @return ship;s instance for the builder
		 */
		public SpaceShipBuilder setModuleCount(int modules) {
			this.moduleCount=modules;
			this.modules = new ModuleType[moduleCount];
			for(int i =0; i < this.moduleCount; i++){
				this.modules[i] = ModuleType.empty;
			}
			return this;
		}
		/**
		 * @param moduleList Modules to be installed
		 * @return Instance of spaceship builder
		 */
		public SpaceShipBuilder insertModules(ModuleType[] moduleList) {
			if(moduleList.length > moduleCount) {
				System.out.println("Module conut exceeds available module space!");
				return this;
			}else 
				if(moduleList.length < this.moduleCount)
					for(int i =0; i < moduleList.length; i++)
						modules[i] = moduleList[i];
				else
					this.modules= moduleList;
			return this;
		}
		
		/**
		 * @return ready instance of the ship
		 */
		public SpaceShip build() {
			return new SpaceShip(this);
		}
		
	}
	
}
