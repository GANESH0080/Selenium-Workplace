package TryCatch;

public class ExampleNine {
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public static void main(String[] args) {

		ExampleNine abc = new ExampleNine();
		abc.setI(100);

		System.out.println(abc.getI());
		try {

			int result = abc.getI() / 0;
		} catch (ArithmeticException i) {
			System.out.println(i);
		}

	}
}
