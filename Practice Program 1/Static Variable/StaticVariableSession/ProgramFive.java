package StaticVariableSession;

public class ProgramFive {
	static int i = 849;

	void getData() {
		System.out.println(+i);
	}

	static void getDetails() {
		ProgramFive t = new ProgramFive();
		t.getData();
	}
}