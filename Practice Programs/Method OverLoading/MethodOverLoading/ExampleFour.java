package MethodOverLoading;

public class ExampleFour {

	static void getData()
	{
		System.out.println("GetData Method WHICH HAS NO PARAMETER");
	}
	static void getData(String str)
	{
		System.out.println("GetData Method WHICH HAS PARAMETER");
	}
	
	public static void main(String[] args) {
		ExampleFour test = new ExampleFour();
		test.getData();
		test.getData("Ganesh Salunkhe");
		
		
	}
}




