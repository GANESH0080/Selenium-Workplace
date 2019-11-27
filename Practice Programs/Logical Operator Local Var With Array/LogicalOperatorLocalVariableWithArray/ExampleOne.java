package LogicalOperatorLocalVariableWithArray;

public class ExampleOne {

	// Method creation: Method created like array because want to return array
	static int[] getDatails() {
		// Created an array with 4 index
		int[] arr = new int[4];
		// Initialize an array for every Index
		arr[0] = 20;
		arr[1] = 10;
		arr[2] = 30;
		arr[3] = 40;
		return arr;
	}

	public static void main(String[] args) {

		int[] p = getDatails();
		for (int i = 0; i < p.length; i++) {
			// Printing an Array
			System.out.println(p[i]);
			// If Condition
			if (i > 0) {

				if (p[i - 1] < p[i]) {
					System.out.println("Pass");
				} else {
					System.out.println("Fail");
				}
			}

		}
	}
}
