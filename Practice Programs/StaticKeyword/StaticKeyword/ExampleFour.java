package StaticKeyword;

public class ExampleFour {
	 // Static keyword mainly belong to the class than instance of class
		// Example of JAVA STATIC VARIABLE - Count no of student with Method

	static int count = 0;

		void GetResult() {
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
