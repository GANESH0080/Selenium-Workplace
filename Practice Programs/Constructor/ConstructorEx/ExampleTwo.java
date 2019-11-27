package ConstructorEx;


//Constructor name is same name as CLASSNAME.
//Constructor never return any value
public class ExampleTwo {
	int x = 5;
	int y = 10;
	
	ExampleTwo() {
	int result = x + y;
	System.out.println("Testing Started" + " " + result);
	
	}
	
	public static void main(String[] args) {
		ExampleOne test = new ExampleOne();

	}

}
