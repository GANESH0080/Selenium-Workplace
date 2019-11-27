package PreIncrements;

public class ExampleTwo {
	int i;

	public static void main(String[] args) {
		ExampleTwo obj = new ExampleTwo();
		obj.i = 5;
		int b = ++obj.i;
		System.out.println(+b);
	}

}
