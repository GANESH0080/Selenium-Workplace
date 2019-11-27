package InstanceVariableAccessModifier;

public class ProgramThreeAccess {

	public static void main(String[] args) {
		ProgramThree test = new ProgramThree();
		test.setfName("Ganesh");
		test.setlName("Salunkhe");
		System.out.println(test.getfName() +" "+test.getlName());
	}

}
