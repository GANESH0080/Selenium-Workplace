package LogicalOperatorsWithInstanceVariable;

public class ExampleFive {
	boolean a;
	
	
	public static void main(String[] args) {
		ExampleFive test = new ExampleFive();
		test.a = true;
		
		if (!test.a == true) {
			System.out.println("F");
		} else {
			System.out.println("Pass");
		}

	}

}