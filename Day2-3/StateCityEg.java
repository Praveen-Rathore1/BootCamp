import java.util.TreeSet;

public class StateCityEg {
	
public static void main(String[] args) {
		
		//TreeSet<CityDetails> ts = new TreeSet<CityDetails>((city1,city2) -> city1.getName().compareTo(city2.getName()));
		TreeSet<CityDetails> ts = new TreeSet<CityDetails>((city1,city2) -> city1.getPopulation() - city2.getPopulation());
		ts.add(new CityDetails("Noida",1000000));
		ts.add(new CityDetails("Chennai",100000));
		ts.add(new CityDetails("Kolkata",10000));
		ts.add(new CityDetails("Delhi",100000000));
		ts.add(new CityDetails("Mumbai",1000));
		
		//Set<CityDetails> ts1 = Collections.synchronizedSet(ts);
		
		for(CityDetails cd : ts)
		{
			System.out.println(cd);
		}
	}

}
