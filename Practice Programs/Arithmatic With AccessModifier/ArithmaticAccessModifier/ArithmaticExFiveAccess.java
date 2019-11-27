package ArithmaticAccessModifier;

public class ArithmaticExFiveAccess {

	public static void main(String[] args) {
		ArithmaticExFive test = new ArithmaticExFive();
		test.setX(50);
		test.setY(30);
		test.setResult(test.getX() + test.getY());
		System.out.println(test.getResult());
	}
}
