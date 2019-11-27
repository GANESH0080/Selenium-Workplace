package ThrowKeywordException;

public class ExampleFive {
	static int i;

	static void GetResult(int i) {
		if (i < 30) {
			throw new ArrayIndexOutOfBoundsException("Testing throw Exception");
		} else {
			System.out.println("PASS");
		}

	}

	public static void main(String[] args)

	{

		GetResult(20);
	}
}
