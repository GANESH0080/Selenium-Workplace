package ArrayExamples;

public class ExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[] aryBools = {false, true, false, true };

		System.out.println("Array data is:" + " " + aryBools[3]);

		// getting Out Of Bound Exception for below line because size of array
		// is 3 and we are trying to get value of 4th index
		System.out.println("Array data is:" + " " + aryBools[4]);

	}

}
