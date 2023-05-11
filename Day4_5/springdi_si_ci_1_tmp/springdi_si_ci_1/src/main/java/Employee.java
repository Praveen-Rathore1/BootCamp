public class Employee {
	private int id;
	private String name;
	private double marks;
	private String address;

	public Employee() {
		System.out.println("def cons");
	}

	public Employee(int id) {
		this.id = id;
		System.out.println("Employee(int id)");
	}

	public Employee(String name) {
		this.name = name;
		System.out.println("Employee(String str)");
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Employee(int id, String name)");
	}

	public void setMarks(double tmp) {
		marks = tmp;
		System.out.println("setMarks(double tmp)---------------");
	}

	public double getMarks() {
		return marks;
	}

	public Employee(String address, String name, int id) {
		this.id = id;
		this.name = name;
		this.address = address;
		System.out.println("Check Employee(String name, String address, int id)");
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println("setName(String name)------------");
	}

	void show() {
		System.out.println("stdnt id:" + id + " stdnt name:" + name + "  marks:" + marks+" address:"+address);
	}

}
