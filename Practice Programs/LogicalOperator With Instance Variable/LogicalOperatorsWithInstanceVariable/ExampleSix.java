package LogicalOperatorsWithInstanceVariable;

public class ExampleSix {
int a;

	public static void main(String[] args) {
		ExampleSix test = new ExampleSix();
		test.a = 10;
		
		if (!(test.a == 20)) {
			System.out.println("F");
		} else {
			System.out.println("Pass");
		}

	}

}