package SamplePrograms;

public class Super {
	int data = 50;

	void change(Super op) {
		op.data = op.data + 100;
	}

	public static void main(String[] args) {
		Super op = new Super();
		System.out.println("Before Change" + " " + op.data);
		op.change(op);
		System.out.println("After change" + " " + op.data);
	}
}
