package side;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
	
public class Processor{
	
	private List<Place> places;
	
	public Processor() {
		places = new ArrayList<Place>();
	}
	
	public void addPlaces() {
		Place p1 = new Place("Edinburgh", 300000);
		Place p2 = new Place("Dunfermline", 30000);
		Place p3 = new Place("Cupar	", 15000);
		Place p4 = new Place("Glasgow", 500000);
		Place p5 = new Place("Stirling", 80000);
		places.add(p1);
		places.add(p2);
		places.add(p3);
		places.add(p4);
		places.add(p5);
	}
	
	public void showPlaces(){
		if(places.size() > 0){
			places.stream().forEach(System.out::println);
		} else {
			System.out.println("no places listed");
		}
	}
	
	public List<Place> showPlacesWithPopulationGreaterThan(int limit){
		List<Place> filteredPlaces = places.stream()
			.filter(place -> limit < place.getPopulation())
			.sorted()
			.collect(Collectors.toList());
		
		filteredPlaces.forEach(System.out::println);
		return filteredPlaces;
	}
		
}