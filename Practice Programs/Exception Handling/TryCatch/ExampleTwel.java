package TryCatch;

public class ExampleTwel {

	public static void main(String[] args) {
		String[] abc = new String[2];
		try {

			System.out.println("Array data is:" + " " + abc[3]);

		}
		// General Catch
		catch (Exception n) {
			System.out.println(n);
		}
		// Getting error for this because General catch always at END
		// When you RUN an Program then General Catch has more priority than
		// ArrayIndexOutOfBoundsException
		// So General Exception should be at last
		catch (ArrayIndexOutOfBoundsException m) {
			System.out.println(m);
		}
	}
}
