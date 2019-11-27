package Testing;

public class InvokeMethods {

	// Creating Constructor
	InvokeMethods() {
		// Using this 
		this.Mymethod();
	}
  //Creating method
	void Mymethod() {
		int i = 25;
		System.out.println(i);
	}
	//Creating method 1
	void Mymethod1() {
		this.Mymethod();
		int i = 45;
		System.out.println(i);
	}
   // main Method
	public static void main(String[] args) {
		InvokeMethods obj = new InvokeMethods();
		obj.Mymethod1();
	}

}
