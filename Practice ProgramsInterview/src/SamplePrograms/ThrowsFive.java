package SamplePrograms;

public class ThrowsFive {
	public static void xyz() throws ArithmeticException {
		try {
			int i = 5;
			if (i < 6) {
				throw new ArithmeticException("46464");

			} else {
				System.out.println("Fail");
			}
		} 
		catch (Exception e) {
			System.out.println("Ganesh");
			System.out.println(e);
		}
	}

		public static void main(String[] args)
		{
			xyz();
		}

	}

