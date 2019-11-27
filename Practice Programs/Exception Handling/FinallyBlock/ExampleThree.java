package FinallyBlock;

public class ExampleThree {

	public static void main(String[] args) {
		try{
			int b = 100/2;
			System.out.println("Value of B:" +b);
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
