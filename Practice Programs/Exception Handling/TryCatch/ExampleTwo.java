package TryCatch;

public class ExampleTwo {

	public static void main(String[] args) {
		String[] abc = { "Apple", "Grapes", "Banana", "Orange", "Mango" };
		System.out.println("Array data is:" + " " + abc[0]);

		try {
			System.out.println("Array data is:" + " " + abc[6]);
		} catch (ArrayIndexOutOfBoundsException i) {
			System.out.println(i);
			System.out.println("-----");
		}

	}
}
