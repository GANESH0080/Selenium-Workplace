package AccessModifiers;

public class PublicAccessModifierExAccess {
	public static void main(String[] args) {
		
		// In PublicAccessModifierEx class define x variable as Static so we are accessing variable directly using class in satatic method
		PublicAccessModifierEx.x =50;
		 
		System.out.println("Value of X is :" +PublicAccessModifierEx.x);
		
	}

}


