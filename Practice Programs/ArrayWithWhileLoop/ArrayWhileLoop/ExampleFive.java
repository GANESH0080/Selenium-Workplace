package ArrayWhileLoop;

public class ExampleFive {
	int i = 0;
	
	public void GetArrayelements() {
		int[] arraysample = { 1, 5, 3, 6, 8, 99, 45, 55, 66, 66, 77, };
		while (i < arraysample.length) {
			System.out.println("Elements in Array is :" + arraysample[i]);
			i++;

		}
	}
	
	public static void main(String[] args) {

		ExampleFour test = new ExampleFour();
		test.GetArrayelements();
	}
}

	
	
	
	
	
	
