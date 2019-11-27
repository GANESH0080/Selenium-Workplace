package SamplePrograms;

public class Parent {

	void msg() throws Exception {
		System.out.println("Parent");
	}

	static class Child extends Parent {
		void msg() throws Exception {
			System.out.println("Child");
		}

	}

	public static void main(String args[]) throws Exception {

		Parent p = new Child();
		p.msg();
	}
}