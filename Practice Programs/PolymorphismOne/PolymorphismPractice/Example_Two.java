package PolymorphismPractice;

public class Example_Two {
	static void getData() {
		System.out.println("Hello Example_Two");
	}
	
	
	
	public static void main(String[] args) {
		Example test = new Example_One();
	    //Example_One class method is a static method so object call an default class Example method
		test.getData();
		
		
	}
}
