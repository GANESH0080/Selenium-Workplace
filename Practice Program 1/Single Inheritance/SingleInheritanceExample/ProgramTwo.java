package SingleInheritanceExample;

public class ProgramTwo {
	static int i = 5;

	// Base class Constructor
	ProgramTwo() {
		System.out.println("Instance class variable value is : " + i);
	}

	// Base class method
	void parentMethod() {
		int abc = 25;
		System.out.println(+abc);
	}

	// Extending Base class using child class
	public static class ProgramTwochild extends ProgramTwo {

		// Child class constructor
		ProgramTwochild() {
			int var = 55;
			System.out.println(+var);
			
		}

		// Child class method
		void childMethod() {

			String str = "GANESH";
			System.out.println(str);

		}
	}
}
