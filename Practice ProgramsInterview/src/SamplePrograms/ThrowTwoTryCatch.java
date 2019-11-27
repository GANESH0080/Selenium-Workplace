package SamplePrograms;

public class ThrowTwoTryCatch {
	public static void xyz() {

		int i = 5;
		if (i < 6) {
			try {
				throw new ArithmeticException("Pass but Fail");
			} catch (Exception e) {
				System.out.println("Hi");
				System.out.println(e);
			}
		} else {
			System.out.println("Fail");
		}

	}

	public static void main(String[] args) {

		xyz();
		System.out.println("Executed");

	}
}
