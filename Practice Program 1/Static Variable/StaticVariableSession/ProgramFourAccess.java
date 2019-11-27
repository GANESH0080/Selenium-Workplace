package StaticVariableSession;

public class ProgramFourAccess {
	static void getData() {
		ProgramFour test = new ProgramFour();

		System.out.println(test.i);
	}
	public static void main(String[] args) {
		getData();
	}

}
