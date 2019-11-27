package LocalAccessModifier;

public class ProgramFour {

	void getData() {
		int P = 25;
		System.out.println("GetData method variable value is : " + P);
	}

	ProgramFour() {
		getData();
		getDetails();

	}

	static void getDetails() {
		String str = "GANU";
		System.out.println("GetDetails method variable value is : " + str);
	}

}
