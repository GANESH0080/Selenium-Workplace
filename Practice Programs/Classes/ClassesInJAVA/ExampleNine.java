package ClassesInJAVA;

public class ExampleNine {

	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	void getData() {

		setA(50);
		System.out.println(getA());

	}

	public static void main(String[] args) {

		ExampleNine test = new ExampleNine();
		test.getData();
	}

}
