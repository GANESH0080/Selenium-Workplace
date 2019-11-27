package MethodOverLoading;

public class A {

	// Method OverLoadding in Polymorphism
	// Method OverLoading = Same class, same methodNames with Different parameters
	public void show() {
		System.out.println(10);
	}

	public void show(int i) {
		System.out.println(5);
	}
	
	public void show(int i, int b)
	{
		System.out.println(50);

	}
	

	public static void main(String[] args) {
		A test = new A();
		// We are calling method which has parameter
		test.show(7);
		// We are calling method which has multiple parameter
		test.show(10, 20);
		// We are calling method which has not parameter
		test.show();
	}
}
