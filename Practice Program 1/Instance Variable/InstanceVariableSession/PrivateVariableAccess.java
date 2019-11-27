package InstanceVariableSession;

public class PrivateVariableAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateVariable test = new PrivateVariable();
		
		// private variable access in other class using Getter setter only but private method not able to access in other class.
		test.setI(30);
		System.out.println(test.getI());

	}

}
