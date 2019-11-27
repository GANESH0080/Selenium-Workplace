package TryCatch;

public class ExampleSix {

	public static void main(String[] args) {
		String[] abc = new String[2];

		try {

			System.out.println("Array data is:" + " " + abc[3]);
			int i = 100 / 0;
		} catch (ArithmeticException i) {
			System.out.println(i);
		} catch (ArrayIndexOutOfBoundsException m) {
			System.out.println(m);
		} catch (Exception n) {
			System.out.println(n);
		}
	}
}