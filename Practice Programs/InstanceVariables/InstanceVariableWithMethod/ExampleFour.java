package InstanceVariableWithMethod;

public class ExampleFour {
	int x;

	static void getData() {

		ExampleFour c = new ExampleFour();
		c.x = 15;
		System.out.println(c.x);
	}

	public static void main(String[] args) {

		ExampleFour.getData();
	}

}
