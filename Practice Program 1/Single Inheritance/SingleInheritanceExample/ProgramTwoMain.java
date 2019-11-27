package SingleInheritanceExample;

import SingleInheritanceExample.ProgramTwo.ProgramTwochild;

public class ProgramTwoMain {

	public static void main(String args[]) {
		ProgramTwochild test = new ProgramTwochild();
		test.childMethod();
		test.parentMethod();

		ProgramTwo testing = new ProgramTwo();
		testing.parentMethod();

		ProgramTwo tes = new ProgramTwochild();
		test.parentMethod();
		test.childMethod();
		

		// Not able to access Child class using Parent class
		// ProgramOneChild() te = ne ProgramOneParent();

	}
}
