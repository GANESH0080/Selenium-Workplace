package Inheritance;

public class B extends A {

	public static void main(String[] args) {
		A a = new A(); // Calling only Constructor of Class A
		System.out.println("-------");
		
		A b = new B(); // Created object for Class A and Calling constructor of Class A because We Inherites Class A in Class B
		System.out.println("-------");
		
		B c = new B(); // Calling constructor of Class A because We Inherites Class A in Class B
		System.out.println("-------");
		
		c.getData();
		System.out.println("-------");
		
		A d = new A();
		System.out.println("-------");
		d.getData();
		System.out.println("-------");
		
		
		B e = new B();
		System.out.println("-------");
		e.getData();
		
		System.out.println("-------");
		A f = new B();
		System.out.println("-------");
		f.getData();
		System.out.println("-------");
	}

}
