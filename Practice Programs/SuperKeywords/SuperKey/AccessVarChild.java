package SuperKey;

public class AccessVarChild extends AccessVar {
	int empNo = 35;

	void empaccess() {
		System.out.println(empNo);
		System.out.println(super.empNo);
	}

	public static void main(String[] args) {

		AccessVarChild obj = new AccessVarChild();
		obj.empaccess();

	}

}
