package InstanceVariableWithMethod;

public class ExampleTwo {
	 static int x;

	 static void getData()
	 {
	 	x=50;
	 	System.out.println(x);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(+x);
		ExampleTwo.getData();
	}

}
