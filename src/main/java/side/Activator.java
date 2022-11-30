package side;

import side.Processor;

public class Activator {

	public static void main(String... args){
		Processor processor = new Processor();
		processor.showPlaces();
		space();
		processor.addPlaces();
		processor.showPlaces();
		space();
		processor.showPlacesWithPopulationGreaterThan(50000);
		
	}
	
	private static void space() {
		System.out.println("-------------------");
	}
}