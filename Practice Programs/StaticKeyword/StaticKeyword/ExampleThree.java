package StaticKeyword;

public class ExampleThree {

	// Static keyword mainly belong to the class than instance of class
	// Example of JAVA STATIC VARIABLE - Count no of student with Method

	int count = 0;

	void GetResult() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		ExampleThree CS = new ExampleThree();
		CS.GetResult();

		ExampleThree IT = new ExampleThree();
		IT.GetResult();
		ExampleThree MCA = new ExampleThree();
		MCA.GetResult();

	}

}
