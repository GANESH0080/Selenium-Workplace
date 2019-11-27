package MethodOverLoad;

public class SimpleOne {
	public void getData() {
		System.out.println("Parent Class");
	}

	public void getData(int a, int b) {
		System.out.println("Parent Class" + " " + (a + b));
	}
}
