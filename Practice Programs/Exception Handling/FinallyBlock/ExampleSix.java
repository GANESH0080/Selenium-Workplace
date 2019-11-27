package FinallyBlock;

public class ExampleSix {
	static int b;

	public static void main(String[] args) {
		try {
			b = 100 / 0;
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
