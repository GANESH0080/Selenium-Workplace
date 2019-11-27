package DoWhileWithAccessModi;

public class DoWhileExampleAccess {

	public static void main(String[] args) {
		DoWhileExample test = new DoWhileExample();
		test.x = 50;
		do {
			System.out.println("Value of X is :" + test.x);
			test.x++;
		} while (test.x < 100);

	}

}
