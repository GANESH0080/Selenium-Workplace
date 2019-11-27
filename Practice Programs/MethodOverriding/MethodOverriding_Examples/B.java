package MethodOverriding_Examples;
// Method Overloading always used with inheritance
// Created class with extended base class A
public class B extends A {

	// Created an static method
	static void getData() {
		System.out.println("Class B Method");
	}

	// Main class
	public static void main(String[] args) {
		// Created an Object for base class A
		A test = new B();
		// Accessing Base class method because scope of any static method only
		// with class so we are unable to access an method of class B
		// We are able to access base class A method
		test.getData();
	}
}
