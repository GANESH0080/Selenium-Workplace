package IncrementUsingMethod;

public class MethTwo {
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	static void Getresult()

	{
		// User not able to access any private variable in static method
		// For access private variable in static method NEED TO CREATE AN OBJECT
		MethTwo test = new MethTwo();
		test.setI(29);
		
		/*int a = test.getI()+1;
		System.out.println(a);*/
		
		test.setI(test.getI()+2);
	    System.out.println(test.getI());
		
		

	}

}
