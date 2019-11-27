package ClassesInJAVA;

public class ExampleTen {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	void getData() {

		ExampleTen te = new ExampleTen();
		te.setA(22);
		System.out.println(te.getA());

	}

	public static void main(String[] args) {

		ExampleTen test = new ExampleTen();
		test.getData();
	}

}
