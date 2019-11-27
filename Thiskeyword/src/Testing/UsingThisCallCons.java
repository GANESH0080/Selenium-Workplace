package Testing;

public class UsingThisCallCons {

	// Using this() you can call current class constructor & using Super() you
	// can call parent class constructor

	// default constructor
	UsingThisCallCons() {
		System.out.println("hello a");
	}

	// Constructor 1
	UsingThisCallCons(int m, int n) {
		System.out.println(m);
		System.out.println(n);
	}

	// Constructor 2
	UsingThisCallCons(int x) {
		// Using this() we can call only default constructor
		System.out.println(x);
	}

	// Constructor 3
	UsingThisCallCons(String x) {
		// Using this() we can call only default constructor
		this();
		System.out.println(x);
	}

	public static void main(String args[]) {
		UsingThisCallCons a = new UsingThisCallCons(10);
		a = new UsingThisCallCons(100, 200);
		// ClassConUsingThis b = new ClassConUsingThis(10);
		a = new UsingThisCallCons("Ganesh Salunkhe");
	}
}