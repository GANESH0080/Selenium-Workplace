package StaticKeyword;

public class ExampleOne {

	// Static keyword mainly belong to the class than instance of class
	// Example of JAVA STATIC VARIABLE - Count no of student with Constructor

	 int count = 0;
	// The static keyword is used in java mainly for memory management. 
	ExampleOne() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		ExampleOne CS = new ExampleOne();
		ExampleOne IT = new ExampleOne();
		ExampleOne MCA = new ExampleOne();
// Getting Output as 1,1,1 because count variable is not a static variable
// that why every time for new object count value starting from 0
// But when you declared variable as static then Output will be 1 ,2,3 
	}

}
