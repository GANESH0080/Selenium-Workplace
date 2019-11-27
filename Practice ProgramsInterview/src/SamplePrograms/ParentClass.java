package SamplePrograms;


public class ParentClass {
	public void show() {

		System.out.println("Parent show() called");

	}

	public static class Derived extends ParentClass {

		public void show() {

			System.out.println("Derived show() called");

		}

		public static void main(String args[]) {
			// TODO Auto-generated method stub
			ParentClass bb = new ParentClass();
			bb.show();
		}

	}
}

