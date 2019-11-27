package AccessModifiers;

public class PrivateAccessModifierAccess {

	public static void main(String[] args) {
		/* In PrivateAccessModifier class variable X is define as Private ..
		/so in PrivateAccessModifierAccess class we are not able to access variable using object and class*/
		PrivateAccessModifier test =  new PrivateAccessModifier();
		test.x = 20;

	}

}
