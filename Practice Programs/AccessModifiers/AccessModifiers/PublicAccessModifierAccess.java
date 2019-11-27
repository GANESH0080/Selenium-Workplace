package AccessModifiers;

public class PublicAccessModifierAccess {

	public static void main(String[] args) {

		// Need to create a Object for the PublicAccessModifier for accessing variable because PublicAccessModifier class variable not define as Static
		PublicAccessModifier test = new PublicAccessModifier();
		test.x = 25;

		System.out.println("Value of X is :" + test.x);

	}

}
