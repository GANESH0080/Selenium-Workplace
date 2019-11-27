package StaticKeyword;

public class StaticMethodTwo {
	public static int i = 25;

	public static void testMethod() {
		System.out.println("M1");
		int i = 45;
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(i);
		testMethod();
	}

}
