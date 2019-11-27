package TryCatch;

public class ExampleOne {
	// Exception handling is an event , Which occurs during the execution of
	// a program that disrupts the normal flow of the program's instructions
	public static void main(String[] args) {
		try {
			int i = 100 / 0;
		} catch (ArithmeticException i) {
			System.out.println(i);
			
		}
		System.out.println("------");

	}
}
