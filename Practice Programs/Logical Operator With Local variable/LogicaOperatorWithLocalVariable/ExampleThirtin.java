package LogicaOperatorWithLocalVariable;

public class ExampleThirtin {
	int a;

	void getData() {
		a = 10;
		System.out.println(+a);

	}

	void getdetails() {

		if (!(a == 20)) {
			System.out.println("False");
		} else {
			System.out.println("Pass");
		}
	}

	public static void main(String[] args) {

		ExampleThirtin test = new ExampleThirtin();
		test.getData();
		test.getdetails();

	}

}
