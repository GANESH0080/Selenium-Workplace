package ArrayWhileLoop;

public class ExampleOne {

	public static void main(String[] args) {
		String[] array = new String[] { "G", "A", "N", "E", "S", "H" };

		System.out.println(array[2]);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		int i = 0;

		while (i < array.length) {
			System.out.println(array[i]);
			i++;

		}
	}

}
