package SamplePrograms;

public class Base {

	public void show() {

		System.out.println("Base show() called");

	}

	public static class Subclass extends Base {

		public void show() {

			System.out.println("Derived show() called");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclass bb = new Subclass();
		bb.show();
	}
}
