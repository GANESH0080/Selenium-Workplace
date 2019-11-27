package Testing;

// Using this() you can call current class constructor & using Super() you can call parent class constructor
public class CallClassConsUsingThis {

	// Default Constructor of class
	CallClassConsUsingThis() {
		System.out.println("hello a");
	}
    // Constructor of class
	CallClassConsUsingThis(int x) {
		this();
		System.out.println(x);
	}
    // Main Method
	public static void main(String args[]) {
		// Creating object a 
		CallClassConsUsingThis a = new CallClassConsUsingThis(10);
	}
}