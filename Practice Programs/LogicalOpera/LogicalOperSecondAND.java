
public class LogicalOperSecondAND {
	/*
	 * Logical Operators : &&(AND), ||(OR),
	 */
	public static void main(String[] args) {
		int eng = 60;
		int mar = 80;
		// Using && operator with one condition is true and other condition is false
		if (eng<100 && mar < 40) {
			System.out.println("Conditin is PASS");
		}

		else {
			System.out.println("Conditin is FAIL");
		}
	}

}