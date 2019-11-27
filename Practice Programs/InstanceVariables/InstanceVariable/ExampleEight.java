package InstanceVariable;

public class ExampleEight {
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
		ExampleEight a = new ExampleEight();
		a.setX(20);
		// For Instance variable we can assign object / instance wise value
		System.out.println(a.getX());
		
		ExampleEight b = new ExampleEight();
        b.setX(30);
        // For Instance variable we can assign object / instance wise value
    	System.out.println(b.getX());
	}

}
