package ArrayWhileLoop;

public class ExampleSixMethod {

	public void GetArrayelements() {
		
		ExampleSixClass test = new ExampleSixClass();
		test.i=0;
	
		double[] arraysample = { 78, 45, 3.2, 6.66, 8.80, 99, 45.54, 0.555, 6.6, .6, 770.25, };
		while (test.i < arraysample.length) {
			System.out.println("Elements in Array is :" + arraysample[test.i]);
			test.i++;

		}
	
	}
}
