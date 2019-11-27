package SamplePrograms;

public class ThrowsExample {

	public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (Exception e) {
			System.out.println("Common task completed");
			System.out.println(e);
		}
		System.out.println("Rest of the Code");
	}

}
