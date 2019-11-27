package InterfaceTesting;

interface InterfaceOne {
	public void Methodone(int i);
}

interface InterfaceTwo {
	public void MethodTwo(int x);
}

interface InterfaceThree {
	public void MethodThree(int y);
}

interface Interfacefour {
	public void Methodfour(int z);
}

public class ExampleSix implements InterfaceOne, InterfaceTwo, InterfaceThree, Interfacefour {
	
	public void Methodone(int i) {

		System.out.println("HI +i");
	}

	public void MethodTwo(int x) {
		
		System.out.println("HELLO");
	}

	public void MethodThree(int y) {

		System.out.println("Hey");
	}

	public void Methodfour(int z) {

		System.out.println("How R U ???");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleSix obj = new ExampleSix();
		obj.Methodone(5);
		obj.MethodTwo(50);
		obj.MethodThree(70);
		obj.Methodfour(80);

	}

}
