package ClassesInJAVA;

public class ExampleThree {
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		ExampleThree test = new ExampleThree();
		test.setA(15);
		System.out.println(test.getA());

	}

}