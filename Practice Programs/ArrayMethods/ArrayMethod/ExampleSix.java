package ArrayMethod;

public class ExampleSix {

	
	String[] array = new String[] { "abc", "cds", "fs" };

	static void Getarray() {

		ExampleFive test = new ExampleFive();

		System.out.println(test.array[1]);

	}
	
	static void Gettingarray()
	{
		ExampleSix.Getarray();
	}


}
