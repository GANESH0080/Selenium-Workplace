package ClassesAndObjects;

public class ProgramFour {

	private int i = 500;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	static void getNumber() {
		ProgramFour test = new ProgramFour();
		test.i = 1000;
		System.out.println(test.i);
	}

	public static void main(String args[]) {
		getNumber();

		ProgramFour testing = new ProgramFour();
		System.out.println(testing.getI());

		testing.setI(2500);
		System.out.println(testing.getI());

	}

}