package MultilevelInheritanceSession;

import MultilevelInheritanceSession.ProgramMno.Programxyz;

class ProgramMnoMainClass {

	public static void main(String[] args) {

		Programxyz test = new Programxyz();
		ProgramMno te = new ProgramMno();

		// Not able to use because constructor is not available for that main
		// class
		ProgramMnoMainClass tt = new ProgramMnoMainClass();

		// Programxyz o = new ProgramMno();
		
		
		ProgramMno p = new Programxyz();

	}
}
