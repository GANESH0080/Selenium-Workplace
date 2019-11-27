package StaticKeyword;

public class ExampleTwo {

	// Static keyword mainly belong to the class than instance of class
		// Example of JAVA STATIC VARIABLE - Count no of student with Constructor

		static int count = 0;

		ExampleTwo() {
			count++;
			System.out.println(count);
		}

		public static void main(String[] args) {
			ExampleTwo CS = new ExampleTwo();
			ExampleTwo IT = new ExampleTwo();
			ExampleTwo MCA = new ExampleTwo();
	//When you declared variable as static then Output will be 1 ,2,3 
		}

	}
