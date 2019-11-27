package ClassesAndObjects;

public class ProgramThree {

	private int i = 500;

	static void getNumber() {
		ProgramThree test = new ProgramThree();
		test.i = 1000;
		System.out.println(test.i);
	}

	public static void main(String args[]) {
		getNumber();
	}

}