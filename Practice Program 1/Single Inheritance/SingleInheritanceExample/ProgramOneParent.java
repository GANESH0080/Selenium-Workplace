package SingleInheritanceExample;

public class ProgramOneParent {
	int i = 5;

	// Base class Constructor
	ProgramOneParent() {
		System.out.println("Instance class variable value is : " + i);
	}

	// Base class method
	void parentMethod() {
		int abc = 25;
		System.out.println(+abc);
	}

	// Extending Base class using child class
	public static class ProgramOneChild extends ProgramOneParent {

		// Child class constructor
		ProgramOneChild() {

		}

		// Child class method
		void childMethod() {

			String str = "GANESH";
			System.out.println(str);

		}
	}

	public static void main(String args[]) {
		ProgramOneChild test = new ProgramOneChild();
		test.childMethod();
		test.parentMethod();

		ProgramOneParent testing = new ProgramOneParent();
		testing.parentMethod();

		ProgramOneParent tes = new ProgramOneChild();
		tes.parentMethod();
		// unable to access
		//tes.childMethod();

		// Not able to access Child class using Parent class
		// ProgramOneChild() te = ne ProgramOneParent();

	}
}
