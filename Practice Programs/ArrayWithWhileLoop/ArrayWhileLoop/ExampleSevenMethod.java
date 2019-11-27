package ArrayWhileLoop;

public class ExampleSevenMethod {

	static public void GetArrayelements() {

		ExampleSeven test = new ExampleSeven();
		test.setI(0);

		int[] array = { 55, 89, 87, 56, 54, 23, 15, 45, 45, 78, 112654, 1649, 9856 };

		while (test.getI() < array.length) {

			System.out.println(array[test.getI()]);
			test.setI(test.getI() + 1);

		}
	}
}
