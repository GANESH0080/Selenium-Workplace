package SuperKey;

public class AccessVariableChild extends AccessVaiable {

	String color = "Child class variable color is Red";

	public void color() {

		System.out.println(color);
		System.out.println(super.color);

	}

	public static void main(String[] args) {
		AccessVariableChild obj = new AccessVariableChild();
		obj.color();

	}

}
