package Testing;

public class InvokeMethodThisEx {

	// Created Constructor
	InvokeMethodThisEx(String str) {
		// Invoke methods using This keyword
		this.Mymethod(5);
		this.Mymethod1(10);
		System.out.println(str);
	}

	// Created Method with parameter / Variable
	void Mymethod(int number) {
		System.out.println(number);
	}

	// Created Method with parameter / Variable
	void Mymethod1(int numb) {
		System.out.println(numb);
	}

	// Main Method
	public static void main(String[] args) {

		// Calling constructor
		InvokeMethodThisEx obj = new InvokeMethodThisEx("Ganesh");
		// Calling methods using Object
		obj.Mymethod(55);
		obj.Mymethod(1010);
	}

}
