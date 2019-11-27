package LogicalOperatorsWithInstanceVariable;

public class ExampleFour {

	int a;
	int b;
	int c;
	int d;

	public static void main(String[] args) {
		ExampleFour test = new ExampleFour();
		test.a = 10;
		test.b = 20;
		test.c = 30;
		test.d = 40;
		if (test.a < test.b || test.a > test.c) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
