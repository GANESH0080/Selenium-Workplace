package MethodOverriding_Examples;

public class ExampleThreeOverriding extends ExampleThree {

	void getBaseMethod() {
		System.out.println("derive class Method");
	}

	public static void main(String[] args) {

		ExampleThree test = new ExampleThree();
		test.getBaseMethod();

	}

}
