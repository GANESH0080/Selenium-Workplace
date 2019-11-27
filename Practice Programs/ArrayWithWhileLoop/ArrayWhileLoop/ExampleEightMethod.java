package ArrayWhileLoop;

public class ExampleEightMethod {

	static void GetArray() {
		ExampleEight.i = 0;

		int[] array = { 415, 546, 696, 649, 97, 514, 974, 54, 8, 9495 };
		while (ExampleEight.i < array.length) {
			System.out.println(array[ExampleEight.i]);
			ExampleEight.i++;
		}

	}

}
