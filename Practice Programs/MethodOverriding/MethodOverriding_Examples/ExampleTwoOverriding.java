package MethodOverriding_Examples;

public class ExampleTwoOverriding extends ExampleTwo {

	// Created an Method
	public void getData() {
		System.out.println("Testing Overriding");
	}

	// Main class
	public static void main(String[] args) {
		// Created an Object for base class
		ExampleTwo te = new ExampleTwo();
		// Calling base class method
		te.geterBaseClassMethod();

		// Created object for based class
		ExampleTwo tet = new ExampleTwoOverriding();
		tet.geterBaseClassMethod();
		

		// Created object for derived class
		ExampleTwoOverriding teto = new ExampleTwoOverriding();
		teto.geterBaseClassMethod();
		teto.getData();

	}
}
