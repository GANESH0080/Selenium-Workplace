package LocalVariableWithConstructor;

public class ExampleOne {

	void getData() {
		// Local variable declared in side the method
		// Local variable need to initialized in method only because scope of
		// local variable is in Local only
		int i = 150;
		System.out.println(+i);

	}

	ExampleOne() {
		int i = 50;
		System.out.println(+i);
	}

	public static void main(String[] args) {
		ExampleOne t = new ExampleOne();
		t.getData();

	}

}
