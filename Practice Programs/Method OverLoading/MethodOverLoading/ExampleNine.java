package MethodOverLoading;

public class ExampleNine {

	static void getData() {
		System.out.println("Method has NO PARAMETER");
	}

	static void getData(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		getData();
		getData(12,25);
		
		
	}
}
