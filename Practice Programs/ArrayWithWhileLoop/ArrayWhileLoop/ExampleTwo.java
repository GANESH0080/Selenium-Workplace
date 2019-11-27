package ArrayWhileLoop;

public class ExampleTwo {

	public static void main(String[] args) {
		String[] array = new String[5];
		array[0] = "Ganesh";
		array[1] = "Mahadev";
		array[2] = "Salunkhe";
		array[3] = "Deepak";
		array[4] = "Salunkhe";
		System.out.println(array[2]);
		System.out.println("++++++++++++++++++++++++++++++++++++");

		int i = 0;
		while (i < array.length) {
			System.out.println(array[i]);
			i++;
		}

	}

}

