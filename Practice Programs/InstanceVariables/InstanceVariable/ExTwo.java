package InstanceVariable;

public class ExTwo {
	static int x;
	static String abc;
	public static void main(String[] args) {
		// When you declared instance variable as static then variable can directly access in static or main
		x=20;
		System.out.println(x);
        x = 25;
        System.out.println(x);
        x = 35;
        System.out.println(x);
	}

}
