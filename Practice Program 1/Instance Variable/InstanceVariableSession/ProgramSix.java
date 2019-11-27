package InstanceVariableSession;

public class ProgramSix {
private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgramSix test = new ProgramSix();
		test.setI(30);
		System.out.println(test.getI());
		
	}

}
