package MethodOverLoading;

public class ABCexample {
	public void show() {
		System.out.println("ABC Class");
	}

	// method Overloading is work only in same class with same methods name with
	// different parameters
	// In This example we have create two different classes and calling and
	// methods using objects
	public static void main(String[] args) {
		DEFexample a = new DEFexample();
		a.show(27);
		// below method is not available in DEFexample class so giving an error
		a.show();

		ABCexample b = new ABCexample();
		b.show();
		// below method is not available in ABCexample class so giving an error
		b.show(25);

	}
}
