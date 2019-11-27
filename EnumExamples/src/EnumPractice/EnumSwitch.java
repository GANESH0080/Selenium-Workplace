package EnumPractice;

public class EnumSwitch {

	enum Day {

		JAN, FEB, MAR, APRIL, MAY, JUNE, JULY

	}

	public static void main(String args[]) {
		Day d = Day.APRIL;
		switch (d) {
		case JAN:
			System.out.println("January");
			break;
		case FEB:
			System.out.println("Febuary");
			break;
		case MAR:
			System.out.println("March");
			break;
		case APRIL:
			System.out.println("Its April");
			break;
		case MAY:
			System.out.println("Its May");
			break;
		case JUNE:
			System.out.println("Its June");
			break;
		case JULY:
			System.out.println("Its July");
			break;
		default:
			System.out.println("PASS");
		}
	}
}
