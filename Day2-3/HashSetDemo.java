import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	
public static void main(String[] args) {
		
		Set<Account> hs = new HashSet<Account>();
		
		hs.add(new Account(1,"name1"));
		hs.add(new Account(2,"name2"));
		hs.add(new Account(1,"name1"));
		hs.add(new Account(1,"name3"));
		
		Iterator<Account> itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			
		
	}

}
