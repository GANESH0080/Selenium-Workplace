package SingleInheritanceExample;

public class ProgramFourchild extends ProgramFour {

		public void printHello() {
			super.printHello();
			System.out.println("Hello from SubClass");
			return;
		}

		public static void main(String[] args) {

			ProgramFourchild n = new ProgramFourchild();
			n.printHello();
		}
	}