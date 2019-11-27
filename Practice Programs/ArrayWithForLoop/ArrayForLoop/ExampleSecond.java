package ArrayForLoop;

public class ExampleSecond {

	public static void main(String[] args) {
		int[] array = new int[5];

		array[0] = 321;
		array[1] = 721;
		array[2] = 1;
		array[3] = 189;
		array[4] = 1111;

		System.out.println(array[4]);
		System.out.println("------------");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
