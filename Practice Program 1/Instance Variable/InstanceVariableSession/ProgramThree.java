package InstanceVariableSession;

public class ProgramThree {
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public static void main(String[] args) {
		ProgramThree test = new ProgramThree();
		test.setI(25);
		System.out.println(test.getI());

	}

}
