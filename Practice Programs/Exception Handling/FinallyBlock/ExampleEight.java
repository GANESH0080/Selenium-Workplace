package FinallyBlock;

public class ExampleEight {

	public static void main(String[] args) {
		try{
			int b = 100/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
			// Final block not executed because System.exit(0) close / block the JVM
			System.exit(0);
		}
		finally
		{
			System.out.println("Finally");
		}
			
	}

}
