package ArrayForLoop;

public class ExampleFive {

	void Getarray() {
		String[] data = { "ganesh", "sanket", "Smith", "Mark", " ", "James" };
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

	public static void main(String[] args) {

		ExampleFive test = new ExampleFive();
		test.Getarray();
	}

}
