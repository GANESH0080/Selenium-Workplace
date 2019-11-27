package TryCatchWithMethod;

public class ExampleOne {
	int a;

	public void getresult() {
		try {
			a = 100 / 0;
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		ExampleOne test = new ExampleOne();
		test.getresult();
	}

}
