package MethodOverLoad;

public class ExTwo extends ExOne {

	public void getData(int a, int b) {
		System.out.println("Child Class" + " " + (a + b));
	}

	public static void main(String[] args) {

		ExOne a = new ExOne();
		a.getData();

		ExTwo b = new ExTwo();
		b.getData();
		b.getData(14, 20);

		ExOne c = new ExTwo();
		c.getData();

		// We are not able to inherite derive class methods using Base class
		// ExTwo d = new ExOne(); - Getting Error

	}

}
