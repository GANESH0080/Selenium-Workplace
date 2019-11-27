package MethodOverLoading;

public class ExampleSix {
	public void getData() {
		System.out.println("GetData Method WHICH HAS NO PARAMETER");
	}

	public void getData(int a, int b) {
	
		
		System.out.println(+(a+b));
	}

	public static void main(String[] args) {
		ExampleSix test = new ExampleSix();
		test.getData();

		test.getData(20, 25);
	}
}


