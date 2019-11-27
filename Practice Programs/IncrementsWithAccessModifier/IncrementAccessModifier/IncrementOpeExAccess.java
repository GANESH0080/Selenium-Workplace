package IncrementAccessModifier;

public class IncrementOpeExAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncrementOpeEx test = new IncrementOpeEx();
		test.x = (float) 25.7;

		test.x += 5;
		System.out.println(test.x++); // 30.7
		System.out.println(++test.x); // 32.7
		test.x += 5;
		System.out.println(test.x++); // 37.7
		System.out.println(--test.x); // 37.7

	}

}
