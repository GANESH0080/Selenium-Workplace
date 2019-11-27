package MethodOverLoading;

public class ExampleEight {
	public void getData() {
		System.out.println("GetData Method WHICH HAS NO PARAMETER");
	}

	public void getData(int a, int b) {
	
		int result = a+b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		ExampleSix test = new ExampleSix();
		test.getData();

		test.getData(2, 25);
	}

}
