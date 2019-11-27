package FinallyBlock;

public class ExampleNine {

	public static void main(String[] args) {
		try {
			int b = 100 / 0;
		} catch (Exception e) {
			System.out.println(e);

		} finally {
			// Final block not executed because System.exit(0) close / block the
			// JVM
			System.exit(0);
			System.out.println("Finally");
		}

	}

}
