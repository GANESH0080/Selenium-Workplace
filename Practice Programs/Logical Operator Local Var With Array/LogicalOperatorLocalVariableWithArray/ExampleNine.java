package LogicalOperatorLocalVariableWithArray;

public class ExampleNine {

	// Method creation: Method created like array because want to return array
	int[] getDatails() {
		// Created an array with 4 index
		int[] arr = new int[4];
		// Initialize an array for every Index
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		return arr;
	}

	// Created an another method
	void getData() {
		// Getting data of getDetails method
		int[] p = this.getDatails();

		// For condition for interating an Array
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

	public static void main(String[] args) {

		ExampleNine test = new ExampleNine();
		test.getData();
	}

}
