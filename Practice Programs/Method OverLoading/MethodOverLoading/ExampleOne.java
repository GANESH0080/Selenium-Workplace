package MethodOverLoading;


// Method OverLoadding in Polymorphism
// Method OverLoading = Same class, same methodNames with Different parameters
public class ExampleOne {

	
	public void getData()
	{
		System.out.println("GetData Method WHICH HAS NO PARAMETER");
	}
	public void getData(String str)
	{
		System.out.println("GetData Method WHICH HAS PARAMETER");
	}
	
	public static void main(String[] args) {
		ExampleOne test = new ExampleOne();
		test.getData();
		test.getData("Ganesh");
		
		
		
	}
}


