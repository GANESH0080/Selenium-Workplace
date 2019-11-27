package TryCatch;

public class ExOne {
	static int i;

	public static void main(String[] args) {
		try {
			ExOne.i = 100 / 0;

		} catch (ArithmeticException i) {
			System.out.println(i);
		}

	}

}
