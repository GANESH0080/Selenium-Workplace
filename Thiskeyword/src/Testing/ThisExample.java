package Testing;

public class ThisExample {
	// Creating instance (Class) Variable
	int num1;
	int num2;
	int result;

	// Creating constructor with parameter / Variable (Which is local variable)
	ThisExample(int num1, int num2) {
		// Using this keyword we can identify instance (Class) variable & Local
		// variable because both instance & local variable name is same
		this.num1 = num1;
		this.num2 = num2;

	}

	// Main method
	public static void main(String[] args) {
		// Calling constructor which has parameter parameter
		ThisExample obj = new ThisExample(5, 6);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}

}
