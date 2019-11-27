package LogicaOperatorWithLocalVariable;

public class ExampleEleven {

	static void getData() {
		int a = 10;
		if (!(a == 20)) {
			System.out.println("False");
		} else {
			System.out.println("Pass");
		}
	}

	static void getDetails() {
		ExampleEleven.getData();

	}

	public static void main(String[] args) {
		getDetails();

	}

}
