package MethodOverLoading;

public class ExampleThree {

	static void getData()
	{
		System.out.println("GetData Method WHICH HAS NO PARAMETER");
	}
	static void getData(String str)
	{
		System.out.println("GetData Method WHICH HAS PARAMETER");
	}
	
	public static void main(String[] args) {
		ExampleThree.getData();
		ExampleThree.getData("Ganesh");
		
	}
}




