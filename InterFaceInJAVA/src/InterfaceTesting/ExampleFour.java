package InterfaceTesting;

interface BB {
	public void SampleMethod();
}

public class ExampleFour implements BB {

	public void SampleMethod()

	{
		System.out.println("How R You");
	}

	public void OtherSampleMethod() {
		System.out.println("?????");
	}

	public static void main(String args[]) {
		ExampleFour obj = new ExampleFour();
		obj.SampleMethod();
		obj.OtherSampleMethod();
	}
}
