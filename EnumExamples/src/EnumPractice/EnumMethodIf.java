package EnumPractice;

public class EnumMethodIf {

	enum Fruits {
		BANANA, APPLE, GRAPES, CHIKU, MANGO;

		public static void Mymethod(Fruits fru) {
			if (fru == Fruits.CHIKU) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}

		}
	}

	public static void main(String[] args) {
		Fruits.Mymethod(Fruits.CHIKU);

	}

}
