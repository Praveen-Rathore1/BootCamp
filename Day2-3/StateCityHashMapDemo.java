import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StateCityHashMapDemo {
	
	
	public static void main(String[] args) {
		
		Map<String,ArrayList<CityDetails>> hm = new HashMap<String,ArrayList<CityDetails>>();
		
		ArrayList<CityDetails> cityList = new ArrayList<>();
		cityList.add(new CityDetails("Mumbai",1000000));
		cityList.add(new CityDetails("Pune",1000000));
		cityList.add(new CityDetails("Nagpur",1000000));		
		hm.put("Maharashtra",cityList);
		
		ArrayList<CityDetails> cityList1 = new ArrayList<>();
		cityList1.add(new CityDetails("Bangalore",1000000));
		cityList1.add(new CityDetails("Mysore",1000000));
		cityList1.add(new CityDetails("Bellary",1000000));		
		hm.put("Karnataka",cityList1);
		
		ArrayList<CityDetails> list = hm.get("Karnataka");
		System.out.println(list);
		
		/*
		Iterator<HashMap.Entry<String,ArrayList<CityDetails>>> itr = hm.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<String,ArrayList<CityDetails>> e = itr.next();
			System.out.println(e.getKey() + " " + e.getValue());
			
		}
		*/

}
}
