package FinallyBlock;

public class ExampleFive {
	static int b;

	public static void main(String[] args) {
		try {
			b = 100 / 2;
			System.out.println("Value of B:" + b);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Value of B:" +b);
		} finally {
			System.out.println("Finally");
			System.out.println("Value of B:" + b);
		}

	}

}
