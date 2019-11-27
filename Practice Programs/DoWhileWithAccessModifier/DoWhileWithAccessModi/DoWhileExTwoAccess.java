package DoWhileWithAccessModi;

public class DoWhileExTwoAccess {

	public static void main(String[] args) {
		DoWhileExTwo test = new DoWhileExTwo();
		test.setX(60);

		int str = test.getX();

		// Printing 60 only because Post Increment in getX method (x++)
		// If you use ++x in getX method then it will print 61
		System.out.println(str);

		do {
			System.out.println("Value Of X is :" + str);

			str++;
		} while (str <= 100);

	}

}
