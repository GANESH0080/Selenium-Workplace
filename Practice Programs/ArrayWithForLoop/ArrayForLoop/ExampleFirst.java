package ArrayForLoop;

public class ExampleFirst {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 55, 36, 45, 85, 99, 100, 105 };
		System.out.println(array[5]);
		System.out.println("------------");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
