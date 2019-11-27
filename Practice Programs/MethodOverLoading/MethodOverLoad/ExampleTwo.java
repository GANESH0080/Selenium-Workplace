package MethodOverLoad;

public class ExampleTwo extends ExampleOne {

	public void getData() {
		System.out.println("Child Class");
	}

	public static void main(String[] args) {

		ExampleOne a = new ExampleOne();
		a.getData();

		ExampleTwo b = new ExampleTwo();
		b.getData();

		// Derive class Overrriding base class method - Polymorphism
		ExampleOne c = new ExampleTwo();
		c.getData();

		// We can not override an derive class methods using Base class
		// ExampleTwo d = new ExampleOne(); - Getting error

	}

}
