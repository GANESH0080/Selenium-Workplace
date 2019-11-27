package SuperKey;

class AccessVariableSuperChild extends AccessVariableSuper {

	String name = "Ganesh";

	void printcolor() {

		System.out.println(super.color);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessVariableSuperChild t = new AccessVariableSuperChild();
		t.printcolor();

	}

}
