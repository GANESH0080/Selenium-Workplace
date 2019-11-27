package EnumPractice;

public class EnumMethodSwitch {

	enum Months {
		JAN, FEB, MAR, APRIL, MAY, JUNE, JULY, AUG;

		public static void Mymethod() {
			Months m = Months.APRIL;
			switch (m) {
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
				System.out.println("April");
				break;
			case MAY:
				System.out.println("May");
				break;
			case JUNE:
				System.out.println("June");
				break;
			case JULY:
				System.out.println("July");
				break;
			case AUG:
				System.out.println("August");
				break;
			default:
				System.out.println("FAIL");
			}

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mymethod();
		
		
	}

	}

}
