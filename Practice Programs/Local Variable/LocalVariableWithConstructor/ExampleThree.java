package LocalVariableWithConstructor;

public class ExampleThree {

	 int getData() {
		// Local variable declared in side the method
		// Local variable need to initialized in method only because scope of
		// local variable is in Local only
		int x = 25;
		System.out.println(+x);
				return ++x;
				

	}

	ExampleThree() {
		// By definition there is no possibility of returning a value from a
		// constructor.
		// A constructor does not support any return type. Not even void. The
		// implicit return type by default is the class type in which it is
		// declared.
		
		// We can call method in constructor directly
		getData();
		

	}

	public static void main(String[] args) {
		ExampleThree t = new ExampleThree();

	}

}
