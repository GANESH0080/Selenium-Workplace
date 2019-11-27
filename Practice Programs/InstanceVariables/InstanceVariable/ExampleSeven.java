package InstanceVariable;

public class ExampleSeven {
	private int x;
	private String abc;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String getAbc() {
		return abc;
	}
	public void setAbc(String abc) {
		this.abc = abc;
	}
	
	public static void main(String[] args) {
		// Instance variable not able to access in any static or main method when variable declared without STATIC
		System.out.println(+x);
		System.out.println(abc);
	}

}
