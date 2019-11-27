package LogicaOperatorWithLocalVariable;

public class ExampleEight {

	int i = 10;
	int j = 20;
	int k = 30;
	int l = 40;

	ExampleEight() {

		if (i < j && j < k && k < l) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

	public static void main(String[] args) {

		ExampleEight test = new ExampleEight();

	}

}
