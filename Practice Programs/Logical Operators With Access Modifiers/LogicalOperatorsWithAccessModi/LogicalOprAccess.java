package LogicalOperatorsWithAccessModi;

public class LogicalOprAccess {

	public static void main(String[] args) {
		
		// For accessing AccessLogicalOper class no access modifier variable created Object
		AccessLogicalOper test = new AccessLogicalOper();
		test.eng = 60;
		test.mar = 40;
		
		System.out.println("English Marks is : " +test.eng);
		System.out.println("Marathi Marks is :" +test.mar);
		
		// Used Logical operator using created object
		if(test.eng < 100 && test.mar < 50){
			System.out.println("Condition is PASS");
		}
		else
		{
			System.out.println("Condition is FAIL");
		}
	}

}
