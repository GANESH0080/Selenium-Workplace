package MethodOverLoad;

public class ExampleB {
	public void getData() {
		System.out.println("Child Class");
	}


	public static void main(String[] args) {

		
		ExampleA abc = new ExampleA();
		abc.getData();
		
		ExampleB xyz = new ExampleB();
		xyz.getData();
		
		// When We not inherit or extendes any class then we not able to use polymorphism
		// ExampleA def = new ExampleB(); - Getting error
		
		// ExampleB def = new ExampleA(); - Getting error

		
	}

}

