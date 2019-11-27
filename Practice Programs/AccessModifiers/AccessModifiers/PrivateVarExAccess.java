package AccessModifiers;

public class PrivateVarExAccess {

	public static void main(String[] args) {
		// We are accessing private variable which is declared in PrivateVarEx
		PrivateVarEx.setName("Ganesh Salunkhe");
		System.out.println(PrivateVarEx.getName());

	}

}
