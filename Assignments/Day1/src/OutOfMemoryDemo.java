
public class OutOfMemoryDemo {

	int arr[] = new int[100000000];

	public static void main(String[] args) {
		int i = 0;

		try {
			OutOfMemoryDemo obj[] = new OutOfMemoryDemo[100000000];
			for (; i < obj.length; i++) {
				obj[i] = new OutOfMemoryDemo();
			}
		}

		catch (OutOfMemoryError e) {
			System.out.println("out of memory " + i);
		}
	}

}
