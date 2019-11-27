package PreIncrements;

public class ExampleEight {

	void ExampleEight() {
		int i = 501;
		int b = ++i;
		System.out.println(+b);

	}

	void Testing() {
		ExampleEight();
	}

	public static void main(String[] args) {
		ExampleEight obj = new ExampleEight();
		obj.Testing();

	}

}
