package LocalAccessModifier;

public class ProgramOne {

	ProgramOne() {
		String str = "GANESH SALUNKHE";
		System.out.println("String Value is :" + str);
	}

	// Created static method
	static void getData() {
		int x = 151;
		System.out.println("getData method local variable value is :" + " " + x);
	}
}