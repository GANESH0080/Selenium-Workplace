package TryCatch;

public class ExSixAccess {

	public static void main(String[] args) {
		ExSix test = new ExSix();
		try {
			test.setAbc(100 / 0);

		} catch (ArithmeticException g) {
			System.out.println(g);
		}

	}
}
