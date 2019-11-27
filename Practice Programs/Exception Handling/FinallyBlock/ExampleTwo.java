package FinallyBlock;

public class ExampleTwo {

	public static void main(String[] args) {
		try{
			int b = 100/2;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally");
		}
			
	}

}
