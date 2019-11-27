package ArithmaticAccessModifier;

public class ArithmaticExOneAccess {

	public static void main(String[] args) {
		ArithmaticExOne test = new ArithmaticExOne();
		test.x = 50;
		test.y = 20;
		
		System.out.println(test.getResult());
		
	}

}
