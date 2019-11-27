package TryCatchWithMethod;

public class ExampleThree {
	int a;

	public void getresult() {
		try {
			a = 100 / 0;
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}