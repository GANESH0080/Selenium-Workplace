package TryCatchWithMethod;

public class ExampleTwo {
	static int a;

	public static void getresult() {
		try {
			a = 100 / 0;
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		getresult();
	}

}
