package InstanceVariable;

public class ExampleTen {
	public int x;
	public String abc;
	public static void main(String[] args) {
		ExampleTen a = new  ExampleTen();
		a.x = 50;
		// For Instance variable we can assign object / instance wise value
		System.out.println(a.x);
		

		ExampleTen b = new  ExampleTen();
		b.x = 500;
		// For Instance variable we can assign object / instance wise value
		System.out.println(b.x);
	}

}
