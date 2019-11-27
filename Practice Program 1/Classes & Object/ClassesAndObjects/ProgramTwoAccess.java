package ClassesAndObjects;

public class ProgramTwoAccess {

	static void getName() {

		ProgramTwo.fName = "Ganesh";
		System.out.print(ProgramTwo.fName +" ");
		ProgramTwo test = new ProgramTwo();
		ProgramTwo.lastName();
	}

	public static void main(String[] args) {
		getName();

	}

}
