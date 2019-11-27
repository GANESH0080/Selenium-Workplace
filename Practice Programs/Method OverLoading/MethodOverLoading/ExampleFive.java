package MethodOverLoading;

public class ExampleFive {
	

	public void getData() {
		System.out.println("GetData Method WHICH HAS NO PARAMETER");
	}

	public void getData(int a, int b, int result) {
	
		result = a+b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		ExampleFive test = new ExampleFive();
		test.getData();

		test.getData(20, 25,0);
	}
}
