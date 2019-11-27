package DoWhileWithAccessModi;

public class DoWhileExOneAccess {

	public static void main(String[] args) {
		DoWhileExOne.x = 50;

		do {
			System.out.println("Value of X is :" + DoWhileExOne.x);
			DoWhileExOne.x++;
		} while (DoWhileExOne.x <= 100);

	}

}
