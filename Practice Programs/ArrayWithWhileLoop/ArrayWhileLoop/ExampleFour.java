package ArrayWhileLoop;

public class ExampleFour {
	static int i = 0;

	static void GetArrayelements() {
		int[] arraysample = { 1, 5, 3, 6, 8, 99, 45, 55, 66, 66, 77, };
		while (i < arraysample.length) {
			System.out.println("Elements in Array is :" + arraysample[i]);
			i++;

		}
	}

	public static void main(String[] args) {

		ExampleFour.GetArrayelements();
	}
}
