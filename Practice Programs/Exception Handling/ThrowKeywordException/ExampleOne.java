package ThrowKeywordException;

public class ExampleOne {
	// Using Try - Catch system will throw an Exception selfly
	// If you want to throw an Exception then you can use an Throw Keyword

	// Syntax of Throw - throw new Arithmetic Exception("----")
	// After throw statement we will write any statement otherwise compile time
	// error Unreachable statement
	// example
	// {
	// throw
	// }
	public static void main(String[] args) {
		int a = 100;
		if (a > 90) {
			try {
				throw new ArrayIndexOutOfBoundsException("Testing throw Exception");
				// After throw statement we will write any statement otherwise
				// compile time
				// error Unreachable statement
				// System.out.println("Test");
			} catch (Exception e) {
				System.out.println(e);

			}
		} else {
			System.out.println("PASS");
		}

	}
}
