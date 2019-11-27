package MethodOverriding_Examples;

public class ExampleSevenOverriding extends ExampleSeven {
	void getData(int a, int b) {
		System.out.println(a + b);

	}

	public static void main(String[] args) {
		ExampleSevenOverriding test = new ExampleSevenOverriding();
		test.getData();
		test.getData(14, 50);

		ExampleSeven testing = new ExampleSeven();
		testing.getData();

		ExampleSeven testu = new ExampleSevenOverriding();
		testu.getData();
	}

}
