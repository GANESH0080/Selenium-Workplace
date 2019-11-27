package TryCatch;

public class ExFourAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ExFour.m = 100 / 0;

		}

		catch (ArithmeticException o) {
			System.out.println(o);
		}
	}

}
