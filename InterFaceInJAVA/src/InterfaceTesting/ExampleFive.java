package InterfaceTesting;

interface One {
	public void Methodone();
}

interface Two {
	public void MethodTwo();
}

interface Three {
	public void MethodThree();
}

interface Four {
	public void Methodfour();
}

public class ExampleFive implements One, Two, Three, Four {
	public void Methodone() {

		System.out.println("HI");
	}

	public void MethodTwo() {

		System.out.println("HELLO");
	}

	public void MethodThree() {

		System.out.println("Hey");
	}

	public void Methodfour() {

		System.out.println("How R U ???");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleFive obj = new ExampleFive();
		obj.Methodone();
		obj.MethodTwo();
		obj.MethodThree();
		obj.Methodfour();

	}

}
