import java.util.Random;

public class ShapesOfDunshire {

	public static void main(String[] args) {
		Random random = new Random();
		double finalVolume = 0.00;
		int shapeType = 0;
		int numPieces = (int) random.nextInt(20 - 10) + 10;		// [10,20)
		double radius = 0.00;
		double volume = 0.00;
		double height = 0.00;
		double price = 0.00;
		System.out.printf("Creating Shapes of Dunshire game with %d pieces.\n", numPieces);
		for (int i = 0; i < numPieces; i++) {
			shapeType = (int) random.nextInt(4 - 1) + 1;			// [1,3]
			switch (shapeType) {
			 	case 1:																			// Sphere
			 		radius = Math.round((random.nextDouble() * 5 + 5) * 100) / 100.0;			// [5,10); round to 2 decimal places
			 		volume = Math.round(((4.0 / 3) * Math.PI * Math.pow(radius, 3)) * 100) / 100.0;
			 		finalVolume += volume;
			 		System.out.printf("Manufacturing shape of type: %d and volume: %.2f cm3. Dimensions: radius = %.2f cm.\n", shapeType, volume, radius);
			 		break;
			 	case 2:																					// Cylinder
			 		radius = Math.round((random.nextDouble() * (10 - 5) + 5) * 100) / 100.0;			// [5,10); round to 2 decimal places
			 		height = Math.round((random.nextDouble() * (13 - 7) + 7) * 100) / 100.0;			// [7,13); round to 2 decimal places
			 		volume = Math.round((Math.PI * Math.pow(radius, 2) * height) * 100) / 100.0;
			 		finalVolume += volume;
			 		System.out.printf("Manufacturing shape of type: %d and volume: %.2f cm3. Dimensions: radius = %.2f cm and height = %.2f cm.\n", shapeType, volume, radius, height);
			 		break;
			 	case 3:																					// Cone
			 		radius = Math.round((random.nextDouble() * (10 - 5) + 5) * 100) / 100.0;			// [5,10); round to 2 decimal places
			 		height = Math.round((random.nextDouble() * (13 - 7) + 7) * 100) / 100.0;			// [7,13); round to 2 decimal places
			 		volume = Math.round(((1.0 / 3) * Math.PI * Math.pow(radius, 2) * height) * 100) / 100.0;
			 		finalVolume += volume;
			 		System.out.printf("Manufacturing shape of type: %d and volume: %.2f cm3. Dimensions: radius = %.2f cm and height = %.2f cm.\n", shapeType, volume, radius, height);
			}
				
		}
		finalVolume = Math.round(finalVolume * 100) / 100.0;
		price = Math.round((0.55 * finalVolume) * 100) / 100.0;
		System.out.printf("Total cost of manufacturing %d pieces, worth %.2f cm3 plastic, is $%.2f.\n", numPieces, finalVolume, price);
	}

}
