package SingleInheritanceExample;

public class ProgramThreechild extends ProgramThree {

	public void printHello() {
		
		System.out.println("Hello from SubClass");
		return;
	}

	public static void main(String[] args) {

		ProgramThreechild n = new ProgramThreechild();
		n.printHello();
	}
}