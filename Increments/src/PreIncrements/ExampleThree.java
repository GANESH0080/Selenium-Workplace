package PreIncrements;

public class ExampleThree {

	int i;
	int c;

	public static void main(String[] args) {
		ExampleTwo obj = new ExampleTwo();
		obj.i = 50;
		int c = ++obj.i;
		System.out.println(+c);
	}

}
