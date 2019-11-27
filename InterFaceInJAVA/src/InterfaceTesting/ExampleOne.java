package InterfaceTesting;
// Interface support multiple inheritance in Java 

interface A {
	public void show();

}

public class ExampleOne implements A {
	public void show() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleOne obj = new ExampleOne();
		obj.show();
	}

}
