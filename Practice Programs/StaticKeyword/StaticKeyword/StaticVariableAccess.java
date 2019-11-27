package StaticKeyword;

public class StaticVariableAccess {

	void getData() {

		StaticVariable.abc++;
		System.out.println("Value of ABC :" + StaticVariable.abc);

	}

	public static void main(String[] args) {

		StaticVariable a = new StaticVariable();
		StaticVariableAccess b = new StaticVariableAccess();
		b.getData();
		StaticVariableAccess c = new StaticVariableAccess();
		c.getData();
		StaticVariableAccess d = new StaticVariableAccess();
		d.getData();
		StaticVariableAccess e = new StaticVariableAccess();
		e.getData();

	}

}
