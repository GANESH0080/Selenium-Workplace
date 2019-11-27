package Increments;

public class IncreTen {

	public static void main(String[] args) {
		int x = 5;
		x+=5;
		System.out.println(x++); //10
		System.out.println(--x); // 10
		x+=5; 
		System.out.println(x); //15
		System.out.println(--x);  //14

	}

}