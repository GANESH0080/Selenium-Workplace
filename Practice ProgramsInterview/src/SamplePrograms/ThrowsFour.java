package SamplePrograms;

public class ThrowsFour {
	public static void main(String[] args) {
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			System.out.println("Hello");
			System.out.println(e);
		}
		System.out.println("Hi");
	}
}
