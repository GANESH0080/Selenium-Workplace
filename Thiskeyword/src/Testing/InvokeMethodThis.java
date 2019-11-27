package Testing;

public class InvokeMethodThis {
	// Creating Method
	void Mymethod() {
		int i = 25;
		System.out.println(i);
	}

	// Creating Method
	void Mymethod1() {
		this.Mymethod();
		int i = 45;
		System.out.println(i);
	}

	// Main
	public static void main(String[] args) {
		InvokeMethodThis obj = new InvokeMethodThis();
		obj.Mymethod1();
	}

}
