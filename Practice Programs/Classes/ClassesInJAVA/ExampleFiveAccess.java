package ClassesInJAVA;

public class ExampleFiveAccess {

	public static void main(String[] args) {

		ExampleFive test = new ExampleFive();

		ExampleFive test1 = new ExampleFive();
		test.a = 35;
		test1.a = 49;
		System.out.println(test.a);
		System.out.println(test1.a);
	}

}
