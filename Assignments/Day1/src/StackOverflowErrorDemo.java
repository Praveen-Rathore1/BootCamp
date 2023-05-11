
public class StackOverflowErrorDemo {
	
	public static void main (String [] args)
	{
		int count=0;
		count++;
		System.out.println(count);
		try {
		main(args);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
