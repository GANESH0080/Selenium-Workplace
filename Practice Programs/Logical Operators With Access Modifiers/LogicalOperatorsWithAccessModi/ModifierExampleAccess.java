package LogicalOperatorsWithAccessModi;

public class ModifierExampleAccess {

	public static void main(String[] args) {
		ModifierExamle test = new ModifierExamle();
		test.english = 50;
		ModifierExamle testing = new ModifierExamle();
        testing.marathi = 80;
        if (test.english >60 || testing.marathi >100)
        {
        	System.out.println("Condition is PASS");
        }
        else
        {
        	System.out.println("Condition is FAIL");
        }




	}

}
