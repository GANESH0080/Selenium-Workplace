package ThrowKeywordException;

public class ExampleTwo {

	void throwKeyword() {
		int a = 11;

		if (a < 12) {
			throw new ArrayIndexOutOfBoundsException("Testing throw Exception");
		} else {
			System.out.println("PASS");
		}
	}

	public static void main(String[] args) {
		ExampleTwo test = new ExampleTwo();
		try {
			test.throwKeyword();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
