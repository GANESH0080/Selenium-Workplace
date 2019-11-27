package PolymorphismExamples;
// Poly Means Many
// Morphism means Behavior
public class Example {

	
	void getData()
	{
		System.out.println("Hii");
	}
	
	static void getDatafirst()
	{
		System.out.println("Hello");
	}
	
	
	public static void main(String[] args) {
		Example test  =  new Example();
		test.getData();
		test.getDatafirst();
	}
	
}
