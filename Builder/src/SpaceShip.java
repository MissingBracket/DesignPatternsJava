
public class SpaceShip {
	private String name, manufacturer;
	private int weight, moduleCount=0;
	private ModuleType[] modules;
	
	private SpaceShip(SpaceShipBuilder ssb) {
		this.name=ssb.name;
		this.manufacturer=ssb.manufacturer;
		this.weight=ssb.weight;
		this.moduleCount=ssb.moduleCount;
		this.modules=ssb.modules;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getModuleCount() {
		return moduleCount;
	}
	public void setModuleCount(int moduleCount) {
		this.moduleCount = moduleCount;
	}
	public ModuleType[] getModules() {
		return modules;
	}
	public void setModules(ModuleType[] modules) {
		this.modules = modules;
	}
	public static class SpaceShipBuilder{
		private String name, manufacturer;
		private int weight, moduleCount;
		private ModuleType[] modules;
	
		public SpaceShipBuilder(String name, String manufacturer) {
			this.name=name;
			this.manufacturer=manufacturer;
		}
		public SpaceShipBuilder setWeight(int weight) {
			this.weight=weight;
			return this;
		}
		public SpaceShipBuilder setModuleCount(int modules) {
			this.moduleCount=modules;
			this.modules = new ModuleType[moduleCount];
			for(ModuleType a : this.modules){
				a=ModuleType.empty;
			}
			return this;
		}
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
		
		public SpaceShip build() {
			return new SpaceShip(this);
		}
		
	}
	
}
