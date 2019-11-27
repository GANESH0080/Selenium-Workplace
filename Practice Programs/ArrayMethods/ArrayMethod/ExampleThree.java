package ArrayMethod;

public class ExampleThree {

	public void getarray() {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(array[0]);
		System.out.println(array[5]);
	}

	public static void main(String[] args) {
		ExampleOne test = new ExampleOne();
		test.getarray();

	}
}