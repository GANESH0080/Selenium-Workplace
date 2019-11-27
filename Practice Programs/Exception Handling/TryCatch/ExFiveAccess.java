package TryCatch;

public class ExFiveAccess {

	public static void main(String[] args) {
		ExFive obj = new ExFive();
		try {
			obj.abc = 100 / 0;

		} catch (ArithmeticException s) {
			System.out.println(s);
		}

	}
}
