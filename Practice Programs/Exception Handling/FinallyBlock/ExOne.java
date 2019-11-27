package FinallyBlock;

public class ExOne {

	public static void main(String[] args) {
		try {
			int b = 100 / 2;
			System.out.println("Value of B :" + b);
			// Final block not executed because System.exit(0) close / block the
			// JVM
			System.exit(0);
		} catch (Exception e) {
			System.out.println(e);

		} finally {

			System.out.println("Finally");
		}

	}

}
