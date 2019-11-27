package InstanceVariable;

public class ExOne {
	int x;
	String abc;
	public static void main(String[] args) {
		ExOne a = new  ExOne();
		a.x = 10;
		// For Instance variable we can assign object / instance wise value
		System.out.println(a.x);
		

		ExOne b = new  ExOne();
		b.x = 200;
		// For Instance variable we can assign object / instance wise value
		System.out.println(b.x);

	}

}
