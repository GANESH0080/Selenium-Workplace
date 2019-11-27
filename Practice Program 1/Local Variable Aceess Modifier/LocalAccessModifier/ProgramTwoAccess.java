package LocalAccessModifier;

public class ProgramTwoAccess {

	public static void main(String[] args) {
		ProgramTwo test = new ProgramTwo();
		// If your method is not static then you have to access the method using object.
		test.getData();


	}

}
