package MultilevelInheritanceSession;

public class ProgramOne {

	void pgetData() {
		int i = 5;
		System.out.println(+i);
	}

	public static class ProgramTwo extends ProgramOne {
		void cgetData() {
			int i = 10;
			System.out.println(+i);
		}

		public static class ProgramThree extends ProgramTwo {
			void zgetData() {
				int i = 15;
				System.out.println(+i);
			}

		}

		public static void main(String[] args) {

			ProgramThree test = new ProgramThree();
			test.cgetData();
			test.zgetData();
			test.pgetData();

			ProgramTwo testing = new ProgramTwo();
			testing.cgetData();
			testing.pgetData();

			ProgramOne testNG = new ProgramOne();
			testNG.pgetData();

			// / Not able to access Child class using Parent class object
			//ProgramThree testu = new ProgramTwo();
			//ProgramThree testi = new ProgramOne();
			//ProgramTwo testy = new ProgramOne();

			ProgramOne t = new ProgramTwo();
			t.pgetData();
			
			
			

			ProgramOne ti = new ProgramThree();
			ti.pgetData();
			
			

			ProgramTwo tii = new ProgramThree();
			tii.pgetData();
			tii.cgetData();

		}

	}
}
