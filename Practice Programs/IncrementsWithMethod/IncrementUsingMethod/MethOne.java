package IncrementUsingMethod;

public class MethOne {
	private int i = 25;

	static void Getresult()

	{
		// User not able to access any private variable in static method
		// For access private variable in static method NEED TO CREATE AN OBJECT

		MethOne test = new MethOne();
		test.i = 95;
		test.i++;
		System.out.println(test.i);

	}

}
