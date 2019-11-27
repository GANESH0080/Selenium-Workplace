package TryCatch;

public class ExampleFour {

	public static void main(String[] args) {
		String[] abc = new String[2];

		try {

			// int i = 100 / 0;
			System.out.println("Array data is:" + " " + abc[5]);
		} catch (ArithmeticException i) {
			System.out.println(i);

			// General exception class
		} catch (Exception m) {
			System.out.println(m);

		}

	}

}
