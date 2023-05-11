import java.util.StringTokenizer;

public class MethodChaining {

	static public class abcd {

		void met6() {
			System.out.println("in met6");
		}

	}

	MethodChaining met1() {
		System.out.println("in met1");
		return this;
	}

	MethodChaining met2() {
		System.out.println("in met2");
		return this;
	}

	MethodChaining met3() {
		System.out.println("in met3");
		return this;
	}

	MethodChaining met4() {
		System.out.println("in met4");
		return this;
	}

	public static void main(String[] args) {
		MethodChaining chaining = new MethodChaining();
		chaining.met1().met2().met3().met4();


	}

}
