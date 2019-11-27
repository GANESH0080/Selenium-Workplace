package LoadingRiding;

public class B {
	static void getData(int a, int b) {
		System.out.println("Child Class" +" "+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.getData();
		
		B b = new B();
		b.getData(10, 22);
		
		// When We not inherit or extendes any class then we not able to use polymorphism
		// A c = new B(); - Getting error
		
	}

}
