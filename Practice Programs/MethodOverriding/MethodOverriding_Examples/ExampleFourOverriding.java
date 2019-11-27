package MethodOverriding_Examples;

public class ExampleFourOverriding extends ExampleFour {

	void getBaseMethod() {
		System.out.println("Derived class Method");
	}

	public static void main(String[] args) {

		ExampleFour test = new ExampleFourOverriding();
		test.getBaseMethod();

	}

}
