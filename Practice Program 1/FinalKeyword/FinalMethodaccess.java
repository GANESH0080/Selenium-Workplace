
public class FinalMethodaccess extends FinalMethod {
	
	// If you make any method as final, you cannot override it.
	
		void run() {
			System.out.println("running safely with 100kmph");
		}

		public static void main(String args[]) {
			FinalMethodaccess honda = new FinalMethodaccess();
			honda.run();
		}

	}
