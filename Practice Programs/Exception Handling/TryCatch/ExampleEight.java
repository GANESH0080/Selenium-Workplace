package TryCatch;

public class ExampleEight {
	public static int i = 100;
	public static void main(String[] args) {
	
		try{
			
			int result = i/0;
			}
			catch(ArithmeticException i)
			{
				System.out.println(i);
			}

		}

	}
