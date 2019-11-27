package SamplePrograms;

public class BaseClass {

	public void show() {

		System.out.println("Base show() called");

	}

	public static class Derived extends BaseClass {

		public void show() {

			System.out.println("Derived show() called");

		}

		public static void main(String args[]) {
			// TODO Auto-generated method stub
			BaseClass bb = new Derived();
			bb.show();
		}

	}
}
