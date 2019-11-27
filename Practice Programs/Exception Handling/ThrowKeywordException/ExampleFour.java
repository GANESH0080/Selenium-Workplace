package ThrowKeywordException;

public class ExampleFour {

	public static void main(String[] args) {
		int a = 100;
		if (a > 90) {
			// Throw is used for finding which type of Exception is occur
			throw new ArithmeticException("Not Valid");

		} else {
			System.out.println("PASS");
		}

	}

}
