package LocalVariableWithConstructor;

public class ExampleFour {

	int getData() {
		// Local variable declared in side the method
		// Local variable need to initialized in method only because scope of
		// local variable is in Local only
		int x = 25;
		System.out.println("Value of X is :" + " " + x);
		// Returning local variable
		return x;
	}

	int getdetails() {
		// Accessing local variable in other method
		int m = this.getData();
		
		System.out.println("Value of M is :" + " " + m);
		// Returning local variable
		return m;
	}

	public static void main(String[] args) {
		ExampleFour t = new ExampleFour();
		//t.getData();
		t.getdetails();
	}

}
