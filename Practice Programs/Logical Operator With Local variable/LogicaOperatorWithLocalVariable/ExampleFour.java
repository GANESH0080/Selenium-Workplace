package LogicaOperatorWithLocalVariable;

public class ExampleFour {

	void getData() {
		// Local variable
		int i = 10;
		int j = 20;
		int k = 30;
		int l = 40;

		if (i < j && j < k && k < l) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

	public static void main(String[] args) {

		ExampleFour test = new ExampleFour();
		test.getData();
	}

}