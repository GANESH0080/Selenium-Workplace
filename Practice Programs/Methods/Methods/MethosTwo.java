package Methods;

public class MethosTwo {
	// Created method with void
	public void firstmethod() {
		System.out.println("Hello Youtube !!");
	}

	// Accessing method in main static method with creating an Object
	public static void main(String[] args) {

		MethosTwo test = new MethosTwo();
		test.firstmethod();
	}

}
