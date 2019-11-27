package LoadingRiding;

public class ExampleTwo {

	static void getData() {
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		ExampleOne a = new ExampleOne();
		a.getData();
		// You can call an static method in other class with Classname
		ExampleOne.getData();

		ExampleTwo b = new ExampleTwo();
		b.getData();
		// You can call an static method in same class directly
		getData();
		// You can call an static method in same class with Classname
		ExampleTwo.getData();

		// When We not inherit or extendes any class then we not able to use polymorphism
		// ExampleOne c = new ExampleTwo(); - Getting error

		// ExampleTwo d = new ExampleOne - Getting error

	}

}
