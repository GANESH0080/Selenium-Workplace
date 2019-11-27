package InstanceVariableWithMethod;

public class ExampleThree {
	static int x;

	static void getData() {

		ExampleThree.x = 10;
		System.out.println(+ExampleThree.x);
	}

	public static void main(String[] args) {

		System.out.println(+x);
		ExampleThree.getData();
	}// TODO Auto-generated method stub

}
