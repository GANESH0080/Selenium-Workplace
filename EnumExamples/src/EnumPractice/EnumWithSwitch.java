package EnumPractice;

public class EnumWithSwitch {

	enum Fruits {
		APPLE, MANGO, CHIKU, BANANA
	}

	public static void main(String[] args) {

		Fruits frut = Fruits.APPLE;
		switch (frut) {
		case APPLE:
			System.out.println("Apple is the Best");
			break;
		case MANGO:
			System.out.println("It little bit Good");
			break;
		case CHIKU:
			System.out.println("Better");
			break;
		case BANANA:
			System.out.println("Good");
			break;
		default:
			System.out.println("Bad");

		}
	}
}
