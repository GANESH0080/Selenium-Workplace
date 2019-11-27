package TryCatch;

public class ExTwo {
	int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ExTwo abc = new ExTwo();
			abc.a = 100 / 0;

		} catch (ArithmeticException i) {
			System.out.println(i);
		}
	}
}
