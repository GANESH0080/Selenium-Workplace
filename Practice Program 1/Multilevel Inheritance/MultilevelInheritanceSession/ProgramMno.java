package MultilevelInheritanceSession;

public class ProgramMno {

	ProgramMno() {

		String fName = "Ganesh";
		System.out.println(fName);
	}

	static class Programxyz extends ProgramMno {
		Programxyz() {

			String mName = "Mahadev";
			System.out.println(mName);
		}
		
		

	}

}
