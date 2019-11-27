package InstanceVariable;

public class ExampleNine {
	private int x;
	private String abc;
	public static void main(String[] args) {
		ExampleNine a = new ExampleNine();
		a.x = 25;
		// For Instance variable we can assign object / instance wise value
		System.out.println(a.x);

		ExampleNine b = new ExampleNine();
		b.x = 35;
		// For Instance variable we can assign object / instance wise value
		System.out.println(b.x);
		
	}

}
