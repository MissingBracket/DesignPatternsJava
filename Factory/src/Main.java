public class Main {

	public static void main(String[] args) {
		Backpack blueBackpack = BackpackFactory.getBackpack(backpackType.SMALL, 3, 8);
		System.out.println("Created a backpack: " + blueBackpack);

		Backpack greenBackpack = BackpackFactory.getBackpack(backpackType.BIG, 10, 25);
		System.out.println("Created a backpack: " + greenBackpack);
	}

}
