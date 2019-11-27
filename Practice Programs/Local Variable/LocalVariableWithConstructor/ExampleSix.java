package LocalVariableWithConstructor;

public class ExampleSix {

	ExampleSix() {
		String str = "Ganesh";
		System.out.println("Value of the String is :" + " " + str);

	}

	int getData() {
		// Local variable declared in side the method
		// Local variable need to initialized in method only because scope of
		// local variable is in Local only
		int x = 25;
		System.out.println("Value of X is :" + " " + x);
		return x;
	}

	int getdetails() {
		int m = this.getData();

		System.out.println("Value of M is :" + " " + m);
		return m;
	}

	void dataDetails() {
		int r = this.getData();
		int p = this.getdetails();

		System.out.println("Value of R is :" + " " + r);
		System.out.println("Value of P is :" + " " + p);
	}

	public static void main(String[] args) {
		ExampleSix t = new ExampleSix();
		t.dataDetails();
	}

}
