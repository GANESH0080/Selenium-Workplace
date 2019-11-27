package DoWhileWithAccessModi;

public class DoWhileExThreeAccess {

	public static void main(String[] args) {
		DoWhileExTwo test = new DoWhileExTwo();
		test.setX(60);

		int str = test.getX();

		// System.out.println(str);

		do {
			System.out.println("Value Of X is :" + str);

			str++;
		} while (str> 100);

	}

}
