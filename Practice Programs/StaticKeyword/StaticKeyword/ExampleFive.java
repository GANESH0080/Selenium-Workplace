package StaticKeyword;

public class ExampleFive {

	static int count = 0;

	static void GetResult() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		ExampleFour CS = new ExampleFour();
		CS.GetResult();

		ExampleFour IT = new ExampleFour();
		IT.GetResult();
		ExampleFour MCA = new ExampleFour();
		MCA.GetResult();

	}

}