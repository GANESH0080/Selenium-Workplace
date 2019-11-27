package LocalVariable;

public class ExampleOne {

	void getData() {
		// Local variable declared in side the method
		// Local variable need to initialized in method only because scope of there variable is in Local only
		int i = 50;
		System.out.println("Shlok =" +i);
	}

	public static void main(String[] args) {
		ExampleOne t = new ExampleOne();
		t.getData();
		

	}

}
