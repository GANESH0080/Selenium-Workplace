package FinallyBlock;

public class ExTwo {

	public static void main(String[] args) {
		try {
			int b = 100 / 2;
			// Final block not executed because System.exit(0) close / block the
			// JVM
			System.exit(0);
			System.out.println("Value of B :" + b);

		} catch (Exception e) {
			System.out.println(e);

		} finally {

			System.out.println("Finally");
		}

	}

}
