package MethodOverriding_Examples;

//Method Overloading always used with inheritance
// Created derived class using extended base class
public class ExampleOneOverriding extends ExampleOne {

	// Created an Method
	public void getData() {
		System.out.println("Derive Class");
	}

	// Main class
	public static void main(String[] args) {

		// Created an Object for base class ExampleOne
		ExampleOne test = new ExampleOneOverriding();
		// Calling method of derived class ExampleOneOverriding because both
		// class has same MethodNames so
		// First object call base class method and then derive class method
		// override the Base class method
		test.getData();

		// Created an Object for base class ExampleOne
		ExampleOne testing = new ExampleOne();
		// Calling method of base class ExampleOne
		testing.getData();

		// Created an Object for derive class ExampleOneOverriding
		ExampleOneOverriding testu = new ExampleOneOverriding();
		// Calling method of derived class ExampleOneOverriding
		testu.getData();

		// Created an Object for derive class ExampleOneOverriding
		// We are not able to create an object for base class using derive class
		ExampleOneOverriding t = new ExampleOne();
	    t.getData();

	}

}
