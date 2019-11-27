package Inheritance;

public class ExampleTwo extends ExampleOne {

	ExampleTwo() {
		super(); // Call Parent class Constructor
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {

		ExampleOne a = new ExampleOne();
		ExampleTwo b = new ExampleTwo();
		ExampleOne c = new ExampleTwo();

		System.out.println("---------------");

		a.getData();
		b.getData();
		c.getData();

	}

}
