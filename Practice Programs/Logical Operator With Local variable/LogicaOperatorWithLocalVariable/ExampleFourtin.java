package LogicaOperatorWithLocalVariable;

public class ExampleFourtin {


int abc = 45;

	void getData() {
		
		System.out.println(+abc);

	}

	void getdetails() {

		if (!(abc == 20)) {
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