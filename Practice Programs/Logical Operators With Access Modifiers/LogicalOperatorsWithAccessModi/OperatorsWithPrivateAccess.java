package LogicalOperatorsWithAccessModi;

public class OperatorsWithPrivateAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OperatorsWithPrivate test = new OperatorsWithPrivate();
		test.setHindi(60);
		OperatorsWithPrivate testing = new OperatorsWithPrivate();
		testing.setMaths(10);
		System.out.println(test.getHindi());
		System.out.println(testing.getMaths());
		if (test.getHindi() < 100 && testing.getMaths() < 50) {
			System.out.println("Condition is PASS");

		} else {
			System.out.println("Condition is FAIL");
		}

	}

}
