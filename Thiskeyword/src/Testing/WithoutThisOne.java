package Testing;

public class WithoutThisOne {
	int number=8;

	public WithoutThisOne(int num1) {
		number = num1;
	
	}

	void display() {
		System.out.println(number);
	}

	public static void main(String[] args) {
		WithoutThisOne abj = new WithoutThisOne(10);
		abj.display();
	}

}
