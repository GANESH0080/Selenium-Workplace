package AccessModifiers;

public class NoAccessModifierExampleAccess {

	public static void main(String[] args) {

		// In NoAccessModifierExample class variable x is define as static so in
		// main static method we are calling variable using class only
		NoAccessModifierExample.x = 10;
		System.out.println(NoAccessModifierExample.x);
	}
}