package MethodOverriding_Examples;

public class ExampleFiveOverriding extends ExampleFive {

	void getBaseMethod() {
		System.out.println("Derived class Method");
	}

	ExampleFiveOverriding() {
		System.out.println("Derive Class Constructor");
	}

	public static void main(String[] args) {

		ExampleFive test = new ExampleFiveOverriding();
		test.getBaseMethod();
		
		

	}

}
