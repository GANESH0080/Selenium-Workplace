package PreIncrements;

public class ExampleSeven {

	void Testmethod() {
		int i = 500;
		int b = ++i;
		System.out.println(+b);

	}

	void Testing() {
		Testmethod();
	}

	public static void main(String[] args) {
		ExampleSeven obj = new ExampleSeven();
		obj.Testing();

	}

}
