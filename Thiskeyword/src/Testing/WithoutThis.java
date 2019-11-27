package Testing;

// Without This Keyword when Class variable & Method variable has same name
public class WithoutThis {
	// Creating class / Instance variable
	int num1;

	// Created the Constructor with parameter / Variable
	public WithoutThis(int num1) {
		// Created local variable
		num1 = num1;
		System.out.println("Constructor value is :"+" "+num1);
	}

	// Created method
	void display() {
		System.out.println(num1);
	}

	// Main Method
	public static void main(String[] args) {
		// Calling constructor which has parameter
		WithoutThis abj = new WithoutThis(10);
		abj.display();
	}

}
