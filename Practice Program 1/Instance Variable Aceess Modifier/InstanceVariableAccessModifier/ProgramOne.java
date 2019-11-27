package InstanceVariableAccessModifier;

public class ProgramOne {

	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public static void main(String[] args) {

		ProgramOne test = new ProgramOne();
		test.setI(25);
		System.out.println(test.getI());

	}

}
