package Testing;

public class ClassConUsingThis {

//Using this() you can call current class constructor & using Super() you can call parent class constructor

   //default constructor
	ClassConUsingThis() {
		System.out.println("hello a");
	}
    // Constructor 1
	ClassConUsingThis(int m, int n) {
		System.out.println(m);
		System.out.println(n);
	}
	// Constructor 2
	ClassConUsingThis(int x) {
		// Using this() we can call only default constructor
		this();
		System.out.println(x);
	}
    // Main Method
	public static void main(String args[]) {
		// Creating Object a
		ClassConUsingThis a = new ClassConUsingThis(10);
		// Creating another object using new keyword with the same name as "a"
		a = new ClassConUsingThis(100,200);
		//ClassConUsingThis b = new ClassConUsingThis(10);
	}
}