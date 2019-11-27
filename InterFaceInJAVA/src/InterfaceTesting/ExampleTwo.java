package InterfaceTesting;

interface B {
	public void show();

}

interface C {
	public void display();

}

public class ExampleTwo implements B, C {
	public void show() {
		System.out.println("Hello");
	}

	public void display() {
		System.out.println("HI");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleTwo obj = new ExampleTwo();
		obj.show();
		obj.display();
	}
}
