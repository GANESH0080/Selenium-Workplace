package MethodOverLoading;

// Method OverLoadding in Polymorphism
// Method OverLoading = Same class, same methodNames with Different parameters
public class ExampleTwo {

	static void getData()
	{
		System.out.println("GetData Method WHICH HAS NO PARAMETER");
	}
	static void getData(String str)
	{
		System.out.println("GetData Method WHICH HAS PARAMETER");
	}
	
	public static void main(String[] args) {
		getData();
		getData("Ganesh");
		
		
	}
}




