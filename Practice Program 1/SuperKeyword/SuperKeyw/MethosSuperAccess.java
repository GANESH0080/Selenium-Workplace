package SuperKeyw;

public class MethosSuperAccess extends MethodSuper {

	void methodA() {
		System.out.println("Ganesh parent Salunkhe");
	}

	public void methodB() {
		super.methodA();
		methodA();
	}
	
	public static void main(String [] args)
	{
		MethosSuperAccess test = new MethosSuperAccess();
		test.methodB();
		
	}

}
