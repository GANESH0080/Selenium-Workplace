package TryCatchWithMethod;

public class ExampleFour {
	static int a;

	public static void getresult() {
		try {
			a = 100 / 0;
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}