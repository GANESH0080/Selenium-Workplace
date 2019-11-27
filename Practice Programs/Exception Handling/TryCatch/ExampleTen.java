package TryCatch;

public class ExampleTen {
	private int i;
	private int result;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public static void main(String[] args) {

		ExampleTen abc = new ExampleTen();
		abc.setI(100);

		System.out.println(abc.getI());
		try {

			abc.setResult(abc.getI() / 0);
		} catch (ArithmeticException i) {
			System.out.println(i);
		}

	}

}
