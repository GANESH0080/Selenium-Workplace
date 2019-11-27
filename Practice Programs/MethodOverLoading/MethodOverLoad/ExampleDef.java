package MethodOverLoad;

public class ExampleDef {
	public void getData(int a, int b) {
		System.out.println("Child Class" +" "+(a+b));
	}


	public static void main(String[] args) {

		
		ExampleAbc abc = new ExampleAbc();
		abc.getData();
		
		ExampleDef xyz = new ExampleDef();
		xyz.getData(10, 20);
		
		// When We not inherit or extendes any class then we not able to use polymorphism
	    // ExampleAbc a = new ExampleDef(); - Getting error
		
		
		// ExampleDef b = new ExampleAbc();  - Getting error
		
		
	}
}