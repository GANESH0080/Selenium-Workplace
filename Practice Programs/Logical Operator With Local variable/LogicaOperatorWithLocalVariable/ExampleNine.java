package LogicaOperatorWithLocalVariable;

public class ExampleNine {

	void getData() {
		int a = 10;
		if (!(a == 10)) {
			System.out.println("False");
		} else {
			System.out.println("Pass");
		}
	}

	public static void main(String[] args) {
		ExampleNine test = new ExampleNine();
		test.getData();

	}

}
