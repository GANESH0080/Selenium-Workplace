package InstanceVariableSession;

public class ProgramTen {
	String str = "Ganesh Salunkhe";

	ProgramTen() {
		System.out.println(str);
		int i = 65;
		System.out.println(+i);
	}

	static void getData() {
		String abc = "Salunkhe";
		System.out.println(abc);
	}

	static void getDetails() {
		getData();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProgramTen test = new ProgramTen();
		getDetails();
		getData();
	}

}
