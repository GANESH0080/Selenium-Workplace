package SingleInheritanceExam;

public class A {
	int a = 50;

	void getAdata() {
		System.out.println("Data of class A is :" + a);

	}

	public static class B extends A {

	}

	public static void main(String[] args) {

		B obj = new B();
		obj.getAdata();

		A object = new A();
		object.getAdata();

		A objecting = new B();
		objecting.getAdata();

		// Not able to access class B(Child class) using Class A(Parent class)
		// B object = new A();

	}
}
