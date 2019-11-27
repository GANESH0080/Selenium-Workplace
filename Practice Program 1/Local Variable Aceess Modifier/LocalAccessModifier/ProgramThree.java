package LocalAccessModifier;

public class ProgramThree {

	ProgramThree() {
		String str = "GANESH MAHADEV SALUNKHE";
		System.out.println("String Value is :" + str);
		getData();
	}

	// Private method will accessible in same class only
	// Method (Local variable) is accessible in method only.
	private void getData() {
		int x = 55;
		System.out.println("getData method variable value is :" + " " + x);
	}

	public static void main(String[] args) {
		ProgramThree test = new ProgramThree();

	}

}
