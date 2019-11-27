package TryCatch;

public class ExThreeAccess {

	public static void main(String[] args) {
		ExThree abc = new ExThree();
		try {
			abc.a = 100 / 0;
		} catch (ArithmeticException n) {
			System.out.println(n);
		}

	}

}
