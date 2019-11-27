package PreIncrements;

public class ExampleFour {

	ExampleFour() {
		int i;
	}

	public static void main(String[] args) {
		ExampleTwo obj = new ExampleTwo();
		obj.i = 80;
		int c = ++obj.i;
		System.out.println(+c);
	}

}
