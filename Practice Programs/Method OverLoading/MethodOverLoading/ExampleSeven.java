package MethodOverLoading;

public class ExampleSeven {
int result;
	public void getData() {
		System.out.println("GetData Method WHICH HAS NO PARAMETER");
	}

	public void getData(int a, int b) {
	
		result = a+b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		ExampleSix test = new ExampleSix();
		test.getData();

		test.getData(24, 25);
	}

}
