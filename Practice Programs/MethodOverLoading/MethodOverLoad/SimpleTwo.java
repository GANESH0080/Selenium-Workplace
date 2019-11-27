package MethodOverLoad;

public class SimpleTwo {

	public void getData() {
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		SimpleOne a = new SimpleOne();
		a.getData();
		a.getData(5, 5);
		
		
		SimpleTwo b = new SimpleTwo();
		b.getData();

		
		// We are not Inheriteted class so below getting error
		//SimpleOne c = new SimpleTwo(); - Getting Error 
		
		
	}

}
