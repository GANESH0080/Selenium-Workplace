package MethodOverLoading;

public class ExampleTen {
	static void getData() {
		System.out.println("Method has NO PARAMETER");
	}

	static void getData(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		ExampleTen test = new ExampleTen();
		test.getData();
		test.getData(10, 20);

	}
}
