package SamplePrograms;

public class ThrowExample {
	public static void abc() {

		int i = 5;
		if (i < 6) {
			throw new ArithmeticException("Pass but Fail");
		} else {
			System.out.println("Fail");
		}

	}

	public static void main(String[] args) {

		abc();

	}
}