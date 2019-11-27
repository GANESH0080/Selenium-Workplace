package FinallyBlock;

public class ExampleSeven {

	public static void main(String[] args) {
		try {
			int b = 100 / 0;
		}
		// Exception is not handled so first finally block executed and afte
		// that exception error display
		finally {
			System.out.println("Finally");
		}

	}

}
