package LogicalOperatorsWithAccessModi;

public class AccessOperatorExample {
	
	public static void main(String[] args) {
	// Access static variable with Class name because in static method static variable always access with only class name
		OperatorsExample.subone = 60;
		OperatorsExample.subtwo = 40;
		
		if(OperatorsExample.subone <100 && OperatorsExample.subtwo <50)
		{
			System.out.println("Condition is PASS");
		}
		else
		{
			System.out.println("Condition is FAIL");
		}
		
		
	}

}
