package side;

import java.lang.Comparable;

public class Place implements Comparable {
	private String name;
	private int population;
	
	public Place(String name, int population){
		this.name = name;
		this.population = population;
	}
	
	public String getName(){
		return name;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public String toString() {
		return this.name + "\t" + this.population;
	}
	
	public int compareTo(Object place){
		Place arg = (Place) place;
		if(arg.getPopulation() > this.population){
			return 1;
		} else return -1;
	}
		
}