package SuperKeyw;

public class VariableSuperAccess extends VariableSuper {

	String Name = "Ninad";

	private void accessvariablemethod() {

		System.out.println(super.name);
		System.out.println(Name);
	}

	public static void main(String[] args) {
		VariableSuperAccess obj = new VariableSuperAccess();
		obj.accessvariablemethod();
	}

}
