package IncrementUsingMethod;

public class MethThree {
	private int i = 25;

	
static void Getresult()
	{
		// User not able to access any private variable in static method
		// For access private variable in static method NEED TO CREATE AN OBJECT
		MethThree test = new MethThree();
		test.i++;
		System.out.println(test.i);
		

	}

}
