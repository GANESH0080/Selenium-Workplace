package ThrowsKeyword;

public class ExampleThree {

	static void m1() throws ArithmeticException {

		int a = 100 / 0;

	}

	static void m2() {
		try {
			m1();
		} catch (Exception e) {
			System.out.println(e);
		}
		int x = 5;
		int y = 10;
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		m2();

	}

}
