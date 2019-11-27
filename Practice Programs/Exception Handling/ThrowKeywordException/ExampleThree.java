package ThrowKeywordException;

public class ExampleThree {
	void throwKeyword() {
		int a = 11;

		if (a < 12) {
			try {
				throw new ArrayIndexOutOfBoundsException("Testing throw Exception");
			} catch (Exception e) {
				System.out.println(e);
			}
		} else {
			System.out.println("PASS");
		}
	}

	public static void main(String[] args) {
		ExampleThree test = new ExampleThree();

		test.throwKeyword();

	}
}
