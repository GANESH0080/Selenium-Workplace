package TryCatch;

public class ExampleThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i = 100 / 0;
		} catch (ArithmeticException i) {
			System.out.println(i);
			//System.out.println("-------");

		} catch (Exception e) {
			System.out.println("e");
			
		}
		System.out.println("-------");
	}
}