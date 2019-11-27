package InterfaceTesting;

interface AA {
	int i = 50;
}

public class ExampleThree implements AA {
	public void SampleMethod() {
		System.out.println("Variable value is :" + i);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleThree obj = new ExampleThree();
		obj.SampleMethod();
	}

}
