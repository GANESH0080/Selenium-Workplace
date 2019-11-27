package ThrowKeywordException;

public class ExampleSix {
	static int i;

	static void GetResult(int i) {
		if (i < 30) {
			try {
				throw new ArrayIndexOutOfBoundsException("Testing throw Exception");
			}

			catch (Exception e) {
				System.out.println(e);
			}
		} else {
			System.out.println("PASS");
		}

	}

	public static void main(String[] args)

	{

		GetResult(20);
	}
}
