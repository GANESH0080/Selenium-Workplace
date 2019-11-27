package LoadingRiding;

public class ChildClass extends BaseClass {

	static void getData(int a, int b) {
		System.out.println("Child Class" +" "+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass a = new BaseClass();
		a.getData();
		
		ChildClass b = new ChildClass();
		b.getData();
		b.getData(1, 2);
		
		// When both base & Child class methods are static and user created an object for base class and calling child class then based class method calls
		BaseClass c = new ChildClass();
		c.getData();
				
		// We are not able to inherite child class methods using base class.
		// ParentClass d = new BaseClass(); - Getting error
		// c.getData();
				
		
	}

}
