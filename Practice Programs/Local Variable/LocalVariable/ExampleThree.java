package LocalVariable;

public class ExampleThree {

	static void getData() {
		// Local variable declared in side the method
		// Local variable need to initialized in method only because scope of local variable is in Local only
		int i = 500;
		System.out.println(+i);
	}

	public static void main(String[] args) {

		getData();

	}

}
