package LogicalOperatorsWithInstanceVariable;

public class LogicalOperatorExample {
	// Instance variable which is declared in class and outside the method
	int i = 50;
	int j = 100;
	int k = 150;

	public static void main(String[] args) {
		// We are not able to access instance variable in main method when
		// variable not static
		// When we declared variable as static then we can access instance var
		// in main method
		// if (i<j && j<k)

		LogicalOperatorExample test = new LogicalOperatorExample();
		test.i = 10;
		test.j = 20;
		test.k = 30;
		if (test.i < test.j && test.j < test.k)
		{
        System.out.println("Pass");
		}
		else
		{
		System.out.println("Fail");
	}
}
}