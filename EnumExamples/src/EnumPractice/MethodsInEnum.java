package EnumPractice;

public class MethodsInEnum {

	enum Fruits {
		BANANA, MANGO, CHIKU, GRAPES, APPLE;

		public static void Mymethod(Fruits obj) {
			if (obj == Fruits.APPLE)

			{
				System.out.println("PASS");
			} else
				System.out.println("FAIL");

		}
	}

	public static void main(String[] args) {
		Fruits.Mymethod(Fruits.APPLE);

	}

}
